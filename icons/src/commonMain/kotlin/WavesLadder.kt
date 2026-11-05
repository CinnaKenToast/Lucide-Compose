package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WavesLadder: ImageVector
    get() {
        val current = _wavesLadder
        if (current != null) return current

        return ImageVector.Builder(
            name = "WavesLadder",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 5 a2 2 0 0 0 -2 2 v11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
            }
            // M2 18 c.6 .5 1.2 1 2.5 1 2.5 0 2.5 -2 5 -2 2.6 0 2.4 2 5 2 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 M7 13 h10 M7 9 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // c 0.6 0.5 1.2 1 2.5 1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.5f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 2.6 0 2.4 2 5 2
                curveToRelative(
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                    dx2 = 2.4f,
                    dy2 = 2.0f,
                    dx3 = 5.0f,
                    dy3 = 2.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // M 7 13
                moveTo(x = 7.0f, y = 13.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 7 9
                moveTo(x = 7.0f, y = 9.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
            // M9 5 a2 2 0 0 0 -2 2 v11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
            }
        }.build().also { _wavesLadder = it }
    }


@Suppress("ObjectPropertyName")
private var _wavesLadder: ImageVector? = null
