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

val Droplet: ImageVector
    get() {
        val current = _droplet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Droplet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 a7 7 0 0 0 7 -7 c0 -2 -1 -3.9 -3 -5.5 s-3.5 -4 -4 -6.5 c-.5 2.5 -2 4.9 -4 6.5 S5 13 5 15 a7 7 0 0 0 7 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // a 7 7 0 0 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // c 0 -2 -1 -3.9 -3 -5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -1.0f,
                    dy2 = -3.9f,
                    dx3 = -3.0f,
                    dy3 = -5.5f,
                )
                // s -3.5 -4 -4 -6.5
                reflectiveCurveToRelative(
                    dx1 = -3.5f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -6.5f,
                )
                // c -0.5 2.5 -2 4.9 -4 6.5
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 2.5f,
                    dx2 = -2.0f,
                    dy2 = 4.9f,
                    dx3 = -4.0f,
                    dy3 = 6.5f,
                )
                // S 5 13 5 15
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 13.0f,
                    x2 = 5.0f,
                    y2 = 15.0f,
                )
                // a 7 7 0 0 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
            }
        }.build().also { _droplet = it }
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
                imageVector = Droplet,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _droplet: ImageVector? = null
