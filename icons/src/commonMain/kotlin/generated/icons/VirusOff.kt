package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.VirusOff: ImageVector
    get() {
        val current = _virusOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.VirusOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.01 10z M12 15z M12 22 v-3 m0 -17 v3 m1 17 h-2 m2 -20 h-2 m5.5 17.8 -1 -1.74 m1 -13.85 -1 1.73 m3.4 7.3 a7 7 0 0 0 -8.13 -8.13 m9.02 2.39 -1.73 1 M2 12 h3 m-3 1 v-2 m0 -9 20 20 m0 -10 h-3 m3 1 v-2 M4.2 16.5 l1.74 -1 m-1.73 -8 1.73 1 m1.11 -1.45 a7 7 0 0 0 9.9 9.9 M7.5 19.79 l1 -1.73 M9 12z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.01 10z
                moveTo(x = 10.01f, y = 10.0f)
                close()
                // M 12 15z
                moveTo(x = 12.0f, y = 15.0f)
                close()
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 0 -17
                moveToRelative(dx = 0.0f, dy = -17.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 1 17
                moveToRelative(dx = 1.0f, dy = 17.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 2 -20
                moveToRelative(dx = 2.0f, dy = -20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 5.5 17.8
                moveToRelative(dx = 5.5f, dy = 17.8f)
                // l -1 -1.74
                lineToRelative(dx = -1.0f, dy = -1.74f)
                // m 1 -13.85
                moveToRelative(dx = 1.0f, dy = -13.85f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // m 3.4 7.3
                moveToRelative(dx = 3.4f, dy = 7.3f)
                // a 7 7 0 0 0 -8.13 -8.13
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.13f,
                    dy1 = -8.13f,
                )
                // m 9.02 2.39
                moveToRelative(dx = 9.02f, dy = 2.39f)
                // l -1.73 1
                lineToRelative(dx = -1.73f, dy = 1.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m -3 1
                moveToRelative(dx = -3.0f, dy = 1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -9
                moveToRelative(dx = 0.0f, dy = -9.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // m 3 1
                moveToRelative(dx = 3.0f, dy = 1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 4.2 16.5
                moveTo(x = 4.2f, y = 16.5f)
                // l 1.74 -1
                lineToRelative(dx = 1.74f, dy = -1.0f)
                // m -1.73 -8
                moveToRelative(dx = -1.73f, dy = -8.0f)
                // l 1.73 1
                lineToRelative(dx = 1.73f, dy = 1.0f)
                // m 1.11 -1.45
                moveToRelative(dx = 1.11f, dy = -1.45f)
                // a 7 7 0 0 0 9.9 9.9
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.9f,
                    dy1 = 9.9f,
                )
                // M 7.5 19.79
                moveTo(x = 7.5f, y = 19.79f)
                // l 1 -1.73
                lineToRelative(dx = 1.0f, dy = -1.73f)
                // M 9 12z
                moveTo(x = 9.0f, y = 12.0f)
                close()
            }
        }.build().also { _virusOff = it }
    }

@Suppress("ObjectPropertyName")
private var _virusOff: ImageVector? = null
