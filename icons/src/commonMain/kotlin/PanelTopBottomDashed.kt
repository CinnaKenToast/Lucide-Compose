package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PanelTopBottomDashed: ImageVector
    get() {
        val current = _panelTopBottomDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "PanelTopBottomDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 15 h1 m-1 -6 h1 m4 6 h2 m-2 -6 h2 M3 15 h2 M3 9 h2 m4 6 h1 M9 9 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -1 -6
                moveToRelative(dx = -1.0f, dy = -6.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 4 6
                moveToRelative(dx = 4.0f, dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 -6
                moveToRelative(dx = -2.0f, dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 3 15
                moveTo(x = 3.0f, y = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 4 6
                moveToRelative(dx = 4.0f, dy = 6.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
            // <rect width="18" height="18" rx="2.0" x="3.0" y="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -14
                horizontalLineToRelative(dx = -14.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _panelTopBottomDashed = it }
    }


@Suppress("ObjectPropertyName")
private var _panelTopBottomDashed: ImageVector? = null
