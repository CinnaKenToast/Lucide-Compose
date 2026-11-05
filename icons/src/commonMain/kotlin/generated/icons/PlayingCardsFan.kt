package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlayingCardsFan: ImageVector
    get() {
        val current = _playingCardsFan
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PlayingCardsFan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.65 7.65 a2 2 0 0 1 2.63 -1.05 l5.5 2.38 a2 2 0 0 1 1.06 2.63 l-3.96 9.18 a2 2 0 0 1 -2.63 1.05 l-5.51 -2.38 a2 2 0 0 1 -1.05 -2.63z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.65 7.65
                moveTo(x = 12.65f, y = 7.65f)
                // a 2 2 0 0 1 2.63 -1.05
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.63f,
                    dy1 = -1.05f,
                )
                // l 5.5 2.38
                lineToRelative(dx = 5.5f, dy = 2.38f)
                // a 2 2 0 0 1 1.06 2.63
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.06f,
                    dy1 = 2.63f,
                )
                // l -3.96 9.18
                lineToRelative(dx = -3.96f, dy = 9.18f)
                // a 2 2 0 0 1 -2.63 1.05
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.63f,
                    dy1 = 1.05f,
                )
                // l -5.51 -2.38
                lineToRelative(dx = -5.51f, dy = -2.38f)
                // a 2 2 0 0 1 -1.05 -2.63z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.05f,
                    dy1 = -2.63f,
                )
                close()
            }
            // M18 7.78 V4 a2 2 0 0 0 -2 -2 h-6 a2 2 0 0 0 -2 2 v10 a2 2 0 0 0 1.14 1.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 7.78
                moveTo(x = 18.0f, y = 7.78f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 0 1.14 1.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.14f,
                    dy1 = 1.8f,
                )
            }
            // m8 4.39 -4.36 .8 a2 2 0 0 0 -1.6 2.34 l1.82 9.83 a2 2 0 0 0 2.33 1.6 l2.54 -.47
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 4.39
                moveTo(x = 8.0f, y = 4.39f)
                // l -4.36 0.8
                lineToRelative(dx = -4.36f, dy = 0.8f)
                // a 2 2 0 0 0 -1.6 2.34
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.6f,
                    dy1 = 2.34f,
                )
                // l 1.82 9.83
                lineToRelative(dx = 1.82f, dy = 9.83f)
                // a 2 2 0 0 0 2.33 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.33f,
                    dy1 = 1.6f,
                )
                // l 2.54 -0.47
                lineToRelative(dx = 2.54f, dy = -0.47f)
            }
        }.build().also { _playingCardsFan = it }
    }

@Suppress("ObjectPropertyName")
private var _playingCardsFan: ImageVector? = null
