package com.shipsco.lucide_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LineSquiggle: ImageVector
    get() {
        val current = _lineSquiggle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LineSquiggle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 3.5 c5 -2 7 2.5 3 4 C1.5 10 2 15 5 16 c5 2 9 -10 14 -7 s.5 13.5 -4 12 c-5 -2.5 .5 -11 6 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 3.5
                moveTo(x = 7.0f, y = 3.5f)
                // c 5 -2 7 2.5 3 4
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = -2.0f,
                    dx2 = 7.0f,
                    dy2 = 2.5f,
                    dx3 = 3.0f,
                    dy3 = 4.0f,
                )
                // C 1.5 10 2 15 5 16
                curveTo(
                    x1 = 1.5f,
                    y1 = 10.0f,
                    x2 = 2.0f,
                    y2 = 15.0f,
                    x3 = 5.0f,
                    y3 = 16.0f,
                )
                // c 5 2 9 -10 14 -7
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 2.0f,
                    dx2 = 9.0f,
                    dy2 = -10.0f,
                    dx3 = 14.0f,
                    dy3 = -7.0f,
                )
                // s 0.5 13.5 -4 12
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = 13.5f,
                    dx2 = -4.0f,
                    dy2 = 12.0f,
                )
                // c -5 -2.5 0.5 -11 6 -2
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.5f,
                    dx2 = 0.5f,
                    dy2 = -11.0f,
                    dx3 = 6.0f,
                    dy3 = -2.0f,
                )
            }
        }.build().also { _lineSquiggle = it }
    }

@Preview
@Composable
private fun IconPreview() {
    com.shipsco.theme.AppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = LineSquiggle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lineSquiggle: ImageVector? = null
