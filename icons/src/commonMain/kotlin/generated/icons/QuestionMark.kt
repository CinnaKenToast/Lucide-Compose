package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.QuestionMark: ImageVector
    get() {
        val current = _questionMark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.QuestionMark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 15 c0 -2.48 5 -2.99 5 -6.5 a5 4.5 0 0 0 -10 0 M12 20z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // c 0 -2.48 5 -2.99 5 -6.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.48f,
                    dx2 = 5.0f,
                    dy2 = -2.99f,
                    dx3 = 5.0f,
                    dy3 = -6.5f,
                )
                // a 5 4.5 0 0 0 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                // M 12 20z
                moveTo(x = 12.0f, y = 20.0f)
                close()
            }
        }.build().also { _questionMark = it }
    }

@Suppress("ObjectPropertyName")
private var _questionMark: ImageVector? = null
