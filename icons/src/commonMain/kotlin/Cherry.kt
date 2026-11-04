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

val Cherry: ImageVector
    get() {
        val current = _cherry
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Cherry",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 17 a5 5 0 0 0 10 0 c0 -2.76 -2.5 -5 -5 -3 -2.5 -2 -5 .24 -5 3 m10 0 a5 5 0 0 0 10 0 c0 -2.76 -2.5 -5 -5 -3 -2.5 -2 -5 .24 -5 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 17
                moveTo(x = 2.0f, y = 17.0f)
                // a 5 5 0 0 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // c 0 -2.76 -2.5 -5 -5 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.76f,
                    dx2 = -2.5f,
                    dy2 = -5.0f,
                    dx3 = -5.0f,
                    dy3 = -3.0f,
                )
                // c -2.5 -2 -5 0.24 -5 3
                curveToRelative(
                    dx1 = -2.5f,
                    dy1 = -2.0f,
                    dx2 = -5.0f,
                    dy2 = 0.24f,
                    dx3 = -5.0f,
                    dy3 = 3.0f,
                )
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // a 5 5 0 0 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // c 0 -2.76 -2.5 -5 -5 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.76f,
                    dx2 = -2.5f,
                    dy2 = -5.0f,
                    dx3 = -5.0f,
                    dy3 = -3.0f,
                )
                // c -2.5 -2 -5 0.24 -5 3
                curveToRelative(
                    dx1 = -2.5f,
                    dy1 = -2.0f,
                    dx2 = -5.0f,
                    dy2 = 0.24f,
                    dx3 = -5.0f,
                    dy3 = 3.0f,
                )
            }
            // M7 14 c3.22 -2.91 4.29 -8.75 5 -12 1.66 2.38 4.94 9 5 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 14
                moveTo(x = 7.0f, y = 14.0f)
                // c 3.22 -2.91 4.29 -8.75 5 -12
                curveToRelative(
                    dx1 = 3.22f,
                    dy1 = -2.91f,
                    dx2 = 4.29f,
                    dy2 = -8.75f,
                    dx3 = 5.0f,
                    dy3 = -12.0f,
                )
                // c 1.66 2.38 4.94 9 5 12
                curveToRelative(
                    dx1 = 1.66f,
                    dy1 = 2.38f,
                    dx2 = 4.94f,
                    dy2 = 9.0f,
                    dx3 = 5.0f,
                    dy3 = 12.0f,
                )
            }
            // M22 9 c-4.29 0 -7.14 -2.33 -10 -7 5.71 0 10 4.67 10 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 9
                moveTo(x = 22.0f, y = 9.0f)
                // c -4.29 0 -7.14 -2.33 -10 -7
                curveToRelative(
                    dx1 = -4.29f,
                    dy1 = 0.0f,
                    dx2 = -7.14f,
                    dy2 = -2.33f,
                    dx3 = -10.0f,
                    dy3 = -7.0f,
                )
                // c 5.71 0 10 4.67 10 7
                curveToRelative(
                    dx1 = 5.71f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = 4.67f,
                    dx3 = 10.0f,
                    dy3 = 7.0f,
                )
            }
        }.build().also { _cherry = it }
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
                imageVector = Cherry,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cherry: ImageVector? = null
