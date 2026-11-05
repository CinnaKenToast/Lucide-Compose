package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CaptionsOff: ImageVector
    get() {
        val current = _captionsOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CaptionsOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.5 5 H19 a2 2 0 0 1 2 2 v8.5 M17 11 h-.5 m2.5 8 H5 a2 2 0 0 1 -2 -2 V7 a2 2 0 0 1 2 -2 M2 2 l20 20 M7 11 h4 m-4 4 h2.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 5
                moveTo(x = 10.5f, y = 5.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
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
                // v 8.5
                verticalLineToRelative(dy = 8.5f)
                // M 17 11
                moveTo(x = 17.0f, y = 11.0f)
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // m 2.5 8
                moveToRelative(dx = 2.5f, dy = 8.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // V 7
                verticalLineTo(y = 7.0f)
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
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7 11
                moveTo(x = 7.0f, y = 11.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
            }
        }.build().also { _captionsOff = it }
    }

@Suppress("ObjectPropertyName")
private var _captionsOff: ImageVector? = null
