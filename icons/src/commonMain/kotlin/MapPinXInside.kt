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

val MapPinXInside: ImageVector
    get() {
        val current = _mapPinXInside
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MapPinXInside",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 10 c0 5 -5.54 10.2 -7.4 11.8 a1 1 0 0 1 -1.2 0 C9.54 20.2 4 15 4 10 a8 8 0 0 1 16 0 m-5.5 -2.5 -5 5 m0 -5 5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // c 0 5 -5.54 10.2 -7.4 11.8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                    dx2 = -5.54f,
                    dy2 = 10.2f,
                    dx3 = -7.4f,
                    dy3 = 11.8f,
                )
                // a 1 1 0 0 1 -1.2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.2f,
                    dy1 = 0.0f,
                )
                // C 9.54 20.2 4 15 4 10
                curveTo(
                    x1 = 9.54f,
                    y1 = 20.2f,
                    x2 = 4.0f,
                    y2 = 15.0f,
                    x3 = 4.0f,
                    y3 = 10.0f,
                )
                // a 8 8 0 0 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // m -5.5 -2.5
                moveToRelative(dx = -5.5f, dy = -2.5f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
            }
        }.build().also { _mapPinXInside = it }
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
                imageVector = MapPinXInside,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mapPinXInside: ImageVector? = null
