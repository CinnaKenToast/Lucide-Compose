package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FlaskRound: ImageVector
    get() {
        val current = _flaskRound
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FlaskRound",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 v6.3 a7 7 0 1 0 4 0 V2 M5 15 h14 M8.5 2 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // v 6.3
                verticalLineToRelative(dy = 6.3f)
                // a 7 7 0 1 0 4 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // M 5 15
                moveTo(x = 5.0f, y = 15.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 8.5 2
                moveTo(x = 8.5f, y = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _flaskRound = it }
    }

@Suppress("ObjectPropertyName")
private var _flaskRound: ImageVector? = null
