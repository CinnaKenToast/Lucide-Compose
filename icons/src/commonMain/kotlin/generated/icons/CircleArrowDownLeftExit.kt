package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleArrowDownLeftExit: ImageVector
    get() {
        val current = _circleArrowDownLeftExit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleArrowDownLeftExit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 12 a10 10 0 1 1 10 10 M2 22 l10 -10 M8 22 H2 v-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // a 10 10 0 1 1 10 10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 10.0f,
                )
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // l 10 -10
                lineToRelative(dx = 10.0f, dy = -10.0f)
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
            }
        }.build().also { _circleArrowDownLeftExit = it }
    }

@Suppress("ObjectPropertyName")
private var _circleArrowDownLeftExit: ImageVector? = null
