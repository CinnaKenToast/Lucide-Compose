package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SprayCan: ImageVector
    get() {
        val current = _sprayCan
        if (current != null) return current

        return ImageVector.Builder(
            name = "SprayCan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 3z M7 5z M11 7z M3 7z M7 9z M3 11z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3z
                moveTo(x = 3.0f, y = 3.0f)
                close()
                // M 7 5z
                moveTo(x = 7.0f, y = 5.0f)
                close()
                // M 11 7z
                moveTo(x = 11.0f, y = 7.0f)
                close()
                // M 3 7z
                moveTo(x = 3.0f, y = 7.0f)
                close()
                // M 7 9z
                moveTo(x = 7.0f, y = 9.0f)
                close()
                // M 3 11z
                moveTo(x = 3.0f, y = 11.0f)
                close()
            }
            // <rect width="4" height="4" x="15.0" y="5.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // m19 9 2 2 v10 c0 .6 -.4 1 -1 1 h-6 c-.6 0 -1 -.4 -1 -1 V11 l2 -2 m-2 5 8 -2 m-8 7 8 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 9
                moveTo(x = 19.0f, y = 9.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 0.6 -0.4 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = -0.4f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.6 0 -1 -0.4 -1 -1
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.4f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // m -2 5
                moveToRelative(dx = -2.0f, dy = 5.0f)
                // l 8 -2
                lineToRelative(dx = 8.0f, dy = -2.0f)
                // m -8 7
                moveToRelative(dx = -8.0f, dy = 7.0f)
                // l 8 -2
                lineToRelative(dx = 8.0f, dy = -2.0f)
            }
        }.build().also { _sprayCan = it }
    }


@Suppress("ObjectPropertyName")
private var _sprayCan: ImageVector? = null
