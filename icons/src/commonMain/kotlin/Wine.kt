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

val Wine: ImageVector
    get() {
        val current = _wine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Wine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 22 h8 M7 10 h10 m-5 5 v7 m0 -7 a5 5 0 0 0 5 -5 c0 -2 -.5 -4 -2 -8 H9 c-1.5 4 -2 6 -2 8 a5 5 0 0 0 5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 7 10
                moveTo(x = 7.0f, y = 10.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m -5 5
                moveToRelative(dx = -5.0f, dy = 5.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // c 0 -2 -0.5 -4 -2 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -0.5f,
                    dy2 = -4.0f,
                    dx3 = -2.0f,
                    dy3 = -8.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // c -1.5 4 -2 6 -2 8
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 4.0f,
                    dx2 = -2.0f,
                    dy2 = 6.0f,
                    dx3 = -2.0f,
                    dy3 = 8.0f,
                )
                // a 5 5 0 0 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
            }
        }.build().also { _wine = it }
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
                imageVector = Wine,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wine: ImageVector? = null
