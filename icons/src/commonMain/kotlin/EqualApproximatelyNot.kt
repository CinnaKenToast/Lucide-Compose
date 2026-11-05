package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EqualApproximatelyNot: ImageVector
    get() {
        val current = _equalApproximatelyNot
        if (current != null) return current

        return ImageVector.Builder(
            name = "EqualApproximatelyNot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 15 a6.5 6.5 0 0 1 7 0 6.5 6.5 0 0 0 7 0 M5 9 a6.5 6.5 0 0 1 7 0 6.5 6.5 0 0 0 7 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 15
                moveTo(x = 5.0f, y = 15.0f)
                // a 6.5 6.5 0 0 1 7 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 0 0 7 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // M 5 9
                moveTo(x = 5.0f, y = 9.0f)
                // a 6.5 6.5 0 0 1 7 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 0 0 7 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
            }
            // <line x1="19.0" y1="5.0" x2="5.0" y2="19.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
            }
        }.build().also { _equalApproximatelyNot = it }
    }


@Suppress("ObjectPropertyName")
private var _equalApproximatelyNot: ImageVector? = null
