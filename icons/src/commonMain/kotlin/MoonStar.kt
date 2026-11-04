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

val MoonStar: ImageVector
    get() {
        val current = _moonStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MoonStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 5 h4 m-2 -2 v4 m.98 5.49 A9 9 0 1 1 11.51 3 c.4 -.02 .62 .46 .4 .8 a6 6 0 0 0 8.27 8.28 c.35 -.22 .83 0 .8 .4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0.98 5.49
                moveToRelative(dx = 0.98f, dy = 5.49f)
                // A 9 9 0 1 1 11.51 3
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 11.51f,
                    y1 = 3.0f,
                )
                // c 0.4 -0.02 0.62 0.46 0.4 0.8
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -0.02f,
                    dx2 = 0.62f,
                    dy2 = 0.46f,
                    dx3 = 0.4f,
                    dy3 = 0.8f,
                )
                // a 6 6 0 0 0 8.27 8.28
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.27f,
                    dy1 = 8.28f,
                )
                // c 0.35 -0.22 0.83 0 0.8 0.4
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = -0.22f,
                    dx2 = 0.83f,
                    dy2 = 0.0f,
                    dx3 = 0.8f,
                    dy3 = 0.4f,
                )
            }
        }.build().also { _moonStar = it }
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
                imageVector = MoonStar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _moonStar: ImageVector? = null
