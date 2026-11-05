package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Command: ImageVector
    get() {
        val current = _command
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Command",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 6 v12 a3 3 0 1 0 3 -3 H6 a3 3 0 1 0 3 3 V6 a3 3 0 1 0 -3 3 h12 a3 3 0 1 0 -3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 3 3 0 1 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 1 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 3 3 0 1 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
            }
        }.build().also { _command = it }
    }

@Suppress("ObjectPropertyName")
private var _command: ImageVector? = null
