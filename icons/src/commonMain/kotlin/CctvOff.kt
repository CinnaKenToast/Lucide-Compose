package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CctvOff: ImageVector
    get() {
        val current = _cctvOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "CctvOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12.3 6.65 4.8 2.4 a1 1 0 0 1 .45 1.34 l-.5 1 .6 .61 h2.73 a1 1 0 0 1 .9 1.45 l-.73 1.44 m-5.38 .28 -.72 1.44 a1 1 0 0 1 -1.34 .44 L3.6 12.3 a2.9 2.9 0 0 1 -1.3 -3.91 L3.69 5.6 a3 3 0 0 1 .87 -1.04
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.3 6.65
                moveTo(x = 12.3f, y = 6.65f)
                // l 4.8 2.4
                lineToRelative(dx = 4.8f, dy = 2.4f)
                // a 1 1 0 0 1 0.45 1.34
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.45f,
                    dy1 = 1.34f,
                )
                // l -0.5 1
                lineToRelative(dx = -0.5f, dy = 1.0f)
                // l 0.6 0.61
                lineToRelative(dx = 0.6f, dy = 0.61f)
                // h 2.73
                horizontalLineToRelative(dx = 2.73f)
                // a 1 1 0 0 1 0.9 1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = 1.45f,
                )
                // l -0.73 1.44
                lineToRelative(dx = -0.73f, dy = 1.44f)
                // m -5.38 0.28
                moveToRelative(dx = -5.38f, dy = 0.28f)
                // l -0.72 1.44
                lineToRelative(dx = -0.72f, dy = 1.44f)
                // a 1 1 0 0 1 -1.34 0.44
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.34f,
                    dy1 = 0.44f,
                )
                // L 3.6 12.3
                lineTo(x = 3.6f, y = 12.3f)
                // a 2.9 2.9 0 0 1 -1.3 -3.91
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = -3.91f,
                )
                // L 3.69 5.6
                lineTo(x = 3.69f, y = 5.6f)
                // a 3 3 0 0 1 0.87 -1.04
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.87f,
                    dy1 = -1.04f,
                )
            }
            // M2 19 h3.76 a2 2 0 0 0 1.8 -1.1 L9 15 M2 2 l20 20 M2 21 v-4 m5 -8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // h 3.76
                horizontalLineToRelative(dx = 3.76f)
                // a 2 2 0 0 0 1.8 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = -1.1f,
                )
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 5 -8z
                moveToRelative(dx = 5.0f, dy = -8.0f)
                close()
            }
        }.build().also { _cctvOff = it }
    }


@Suppress("ObjectPropertyName")
private var _cctvOff: ImageVector? = null
