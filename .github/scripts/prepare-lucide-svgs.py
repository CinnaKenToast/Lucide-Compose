from collections import defaultdict
from pathlib import Path
import sys
from typing import Dict, List, Optional
import xml.etree.ElementTree as ET


DRAWABLE_ELEMENTS = {
    "circle",
    "ellipse",
    "line",
    "path",
    "polygon",
    "polyline",
    "rect",
}
SVG_NAMESPACE = "http://www.w3.org/2000/svg"
COLLISION_DIRECTORY = "icon-name-collisions"


def _style_fill(element: ET.Element) -> Optional[str]:
    for declaration in element.get("style", "").split(";"):
        property_name, separator, value = declaration.partition(":")
        if separator and property_name.strip() == "fill":
            return value.strip()
    return None


def _make_fills_explicit(element: ET.Element, inherited_fill: str) -> None:
    element_name = element.tag.rsplit("}", 1)[-1]
    fill = _style_fill(element) or element.get("fill") or inherited_fill

    if (
        element_name in DRAWABLE_ELEMENTS
        and element.get("fill") is None
        and _style_fill(element) is None
    ):
        element.set("fill", fill)

    for child in element:
        _make_fills_explicit(child, fill)

    if (
        element_name not in DRAWABLE_ELEMENTS
        and element.get("fill") == "none"
    ):
        element.set("fill", "currentColor")


def prepare_svg(path: Path) -> None:
    tree = ET.parse(path)
    _make_fills_explicit(tree.getroot(), "black")
    tree.write(path, encoding="utf-8", xml_declaration=True)


def kotlin_icon_name(path: Path) -> str:
    return "".join(part[:1].upper() + part[1:] for part in path.stem.split("-"))


def separate_case_collisions(svg_paths: List[Path], icons_directory: Path) -> int:
    groups: Dict[str, List[Path]] = defaultdict(list)
    for svg_path in svg_paths:
        groups[kotlin_icon_name(svg_path).casefold()].append(svg_path)

    moved = 0
    collision_root = icons_directory.parent / COLLISION_DIRECTORY
    for collision_group in groups.values():
        if len(collision_group) < 2:
            continue
        for svg_path in collision_group:
            destination_directory = collision_root / svg_path.stem
            destination_directory.mkdir(parents=True, exist_ok=True)
            svg_path.replace(destination_directory / svg_path.name)
            moved += 1
    return moved


def main() -> None:
    if len(sys.argv) != 2:
        raise SystemExit("Usage: prepare-lucide-svgs.py <icons-directory>")

    icons_directory = Path(sys.argv[1])
    svg_paths = sorted(icons_directory.rglob("*.svg"))
    if not svg_paths:
        raise SystemExit(f"No SVG files found in {icons_directory}")

    ET.register_namespace("", SVG_NAMESPACE)
    for svg_path in svg_paths:
        prepare_svg(svg_path)

    moved = separate_case_collisions(svg_paths, icons_directory)
    print(f"Prepared fill attributes in {len(svg_paths)} SVG files")
    if moved:
        print(f"Separated {moved} icons with case-insensitive output name collisions")


if __name__ == "__main__":
    main()
