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

val Ampersands: ImageVector
    get() {
        val current = _ampersands
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Ampersands",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 17 c-5 -3 -7 -7 -7 -9 a2 2 0 0 1 4 0 c0 2.5 -5 2.5 -5 6 0 1.7 1.3 3 3 3 2.8 0 5 -2.2 5 -5 m12 5 c-5 -3 -7 -7 -7 -9 a2 2 0 0 1 4 0 c0 2.5 -5 2.5 -5 6 0 1.7 1.3 3 3 3 2.8 0 5 -2.2 5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 17
                moveTo(x = 10.0f, y = 17.0f)
                // c -5 -3 -7 -7 -7 -9
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = -3.0f,
                    dx2 = -7.0f,
                    dy2 = -7.0f,
                    dx3 = -7.0f,
                    dy3 = -9.0f,
                )
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // c 0 2.5 -5 2.5 -5 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.5f,
                    dx2 = -5.0f,
                    dy2 = 2.5f,
                    dx3 = -5.0f,
                    dy3 = 6.0f,
                )
                // c 0 1.7 1.3 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                    dx2 = 1.3f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // c 2.8 0 5 -2.2 5 -5
                curveToRelative(
                    dx1 = 2.8f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.2f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
                // m 12 5
                moveToRelative(dx = 12.0f, dy = 5.0f)
                // c -5 -3 -7 -7 -7 -9
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = -3.0f,
                    dx2 = -7.0f,
                    dy2 = -7.0f,
                    dx3 = -7.0f,
                    dy3 = -9.0f,
                )
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // c 0 2.5 -5 2.5 -5 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.5f,
                    dx2 = -5.0f,
                    dy2 = 2.5f,
                    dx3 = -5.0f,
                    dy3 = 6.0f,
                )
                // c 0 1.7 1.3 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                    dx2 = 1.3f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // c 2.8 0 5 -2.2 5 -5
                curveToRelative(
                    dx1 = 2.8f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.2f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
            }
        }.build().also { _ampersands = it }
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
                imageVector = Ampersands,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _ampersands: ImageVector? = null
