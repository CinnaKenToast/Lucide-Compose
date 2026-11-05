package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RobotVacuum: ImageVector
    get() {
        val current = _robotVacuum
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.RobotVacuum",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 17 h2 m-1 -5z M17 12 a5 5 0 0 0 -10 0 M19 2 v2.8 M2 5 h2.8 M22 5 h-2.8 M5 2 v2.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 17
                moveTo(x = 11.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -1 -5z
                moveToRelative(dx = -1.0f, dy = -5.0f)
                close()
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // a 5 5 0 0 0 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // v 2.8
                verticalLineToRelative(dy = 2.8f)
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
                // h 2.8
                horizontalLineToRelative(dx = 2.8f)
                // M 22 5
                moveTo(x = 22.0f, y = 5.0f)
                // h -2.8
                horizontalLineToRelative(dx = -2.8f)
                // M 5 2
                moveTo(x = 5.0f, y = 2.0f)
                // v 2.8
                verticalLineToRelative(dy = 2.8f)
            }
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _robotVacuum = it }
    }

@Suppress("ObjectPropertyName")
private var _robotVacuum: ImageVector? = null
