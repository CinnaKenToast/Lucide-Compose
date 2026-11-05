package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RobotArm: ImageVector
    get() {
        val current = _robotArm
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.RobotArm",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 21 7.5 8.32 M14 7 l1.75 -3.77 a.5 .5 0 0 1 .66 -.17 L20 5 m0 4 -3.59 1.94 a.5 .5 0 0 1 -.66 -.17 L14 7 H8 M3.49 21 h10 M5 21 V8.73
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 21
                moveTo(x = 12.0f, y = 21.0f)
                // L 7.5 8.32
                lineTo(x = 7.5f, y = 8.32f)
                // M 14 7
                moveTo(x = 14.0f, y = 7.0f)
                // l 1.75 -3.77
                lineToRelative(dx = 1.75f, dy = -3.77f)
                // a 0.5 0.5 0 0 1 0.66 -0.17
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.66f,
                    dy1 = -0.17f,
                )
                // L 20 5
                lineTo(x = 20.0f, y = 5.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // l -3.59 1.94
                lineToRelative(dx = -3.59f, dy = 1.94f)
                // a 0.5 0.5 0 0 1 -0.66 -0.17
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.66f,
                    dy1 = -0.17f,
                )
                // L 14 7
                lineTo(x = 14.0f, y = 7.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // M 3.49 21
                moveTo(x = 3.49f, y = 21.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // V 8.73
                verticalLineTo(y = 8.73f)
            }
            // <circle cx="6.0" cy="7.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 7
                moveTo(x = 6.0f, y = 7.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _robotArm = it }
    }

@Suppress("ObjectPropertyName")
private var _robotArm: ImageVector? = null
