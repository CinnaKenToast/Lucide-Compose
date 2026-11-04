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

val Banana: ImageVector
    get() {
        val current = _banana
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Banana",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 13 c3.5 -2 8 -2 10 2 a5.5 5.5 0 0 1 8 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 13
                moveTo(x = 4.0f, y = 13.0f)
                // c 3.5 -2 8 -2 10 2
                curveToRelative(
                    dx1 = 3.5f,
                    dy1 = -2.0f,
                    dx2 = 8.0f,
                    dy2 = -2.0f,
                    dx3 = 10.0f,
                    dy3 = 2.0f,
                )
                // a 5.5 5.5 0 0 1 8 5
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 5.0f,
                )
            }
            // M5.15 17.89 c5.52 -1.52 8.65 -6.89 7 -12 C11.55 4 11.5 2 13 2 c3.22 0 5 5.5 5 8 0 6.5 -4.2 12 -10.49 12 C5.11 22 2 22 2 20 c0 -1.5 1.14 -1.55 3.15 -2.11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.15 17.89
                moveTo(x = 5.15f, y = 17.89f)
                // c 5.52 -1.52 8.65 -6.89 7 -12
                curveToRelative(
                    dx1 = 5.52f,
                    dy1 = -1.52f,
                    dx2 = 8.65f,
                    dy2 = -6.89f,
                    dx3 = 7.0f,
                    dy3 = -12.0f,
                )
                // C 11.55 4 11.5 2 13 2
                curveTo(
                    x1 = 11.55f,
                    y1 = 4.0f,
                    x2 = 11.5f,
                    y2 = 2.0f,
                    x3 = 13.0f,
                    y3 = 2.0f,
                )
                // c 3.22 0 5 5.5 5 8
                curveToRelative(
                    dx1 = 3.22f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 5.5f,
                    dx3 = 5.0f,
                    dy3 = 8.0f,
                )
                // c 0 6.5 -4.2 12 -10.49 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.5f,
                    dx2 = -4.2f,
                    dy2 = 12.0f,
                    dx3 = -10.49f,
                    dy3 = 12.0f,
                )
                // C 5.11 22 2 22 2 20
                curveTo(
                    x1 = 5.11f,
                    y1 = 22.0f,
                    x2 = 2.0f,
                    y2 = 22.0f,
                    x3 = 2.0f,
                    y3 = 20.0f,
                )
                // c 0 -1.5 1.14 -1.55 3.15 -2.11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.5f,
                    dx2 = 1.14f,
                    dy2 = -1.55f,
                    dx3 = 3.15f,
                    dy3 = -2.11f,
                )
            }
        }.build().also { _banana = it }
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
                imageVector = Banana,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _banana: ImageVector? = null
