package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderCog: ImageVector
    get() {
        val current = _folderCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FolderCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.3 20 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h3.98 a2 2 0 0 1 1.69 .9 l.66 1.2 A2 2 0 0 0 12 6 h8 a2 2 0 0 1 2 2 v3.3 m-7.7 8.23 .93 -.38 m0 -2.3 -.93 -.38 m2.55 -1.24 -.38 -.93 m.38 6.47 -.38 .93 m2.68 -6.47 .38 -.93 m0 7.4 -.38 -.93 m1.62 -3.92 .93 -.38 m-.93 2.68 .93 .38
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.3 20
                moveTo(x = 10.3f, y = 20.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 3.98
                horizontalLineToRelative(dx = 3.98f)
                // a 2 2 0 0 1 1.69 0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.69f,
                    dy1 = 0.9f,
                )
                // l 0.66 1.2
                lineToRelative(dx = 0.66f, dy = 1.2f)
                // A 2 2 0 0 0 12 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 6.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 3.3
                verticalLineToRelative(dy = 3.3f)
                // m -7.7 8.23
                moveToRelative(dx = -7.7f, dy = 8.23f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m 0 -2.3
                moveToRelative(dx = 0.0f, dy = -2.3f)
                // l -0.93 -0.38
                lineToRelative(dx = -0.93f, dy = -0.38f)
                // m 2.55 -1.24
                moveToRelative(dx = 2.55f, dy = -1.24f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // m 0.38 6.47
                moveToRelative(dx = 0.38f, dy = 6.47f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // m 2.68 -6.47
                moveToRelative(dx = 2.68f, dy = -6.47f)
                // l 0.38 -0.93
                lineToRelative(dx = 0.38f, dy = -0.93f)
                // m 0 7.4
                moveToRelative(dx = 0.0f, dy = 7.4f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // m 1.62 -3.92
                moveToRelative(dx = 1.62f, dy = -3.92f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m -0.93 2.68
                moveToRelative(dx = -0.93f, dy = 2.68f)
                // l 0.93 0.38
                lineToRelative(dx = 0.93f, dy = 0.38f)
            }
            // <circle cx="18.0" cy="18.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _folderCog = it }
    }

@Suppress("ObjectPropertyName")
private var _folderCog: ImageVector? = null
