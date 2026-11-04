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

val ShoppingBasket: ImageVector
    get() {
        val current = _shoppingBasket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ShoppingBasket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 11 -1 9 m5 -9 -4 -7 M2 11 h20 M3.5 11 l1.6 7.4 a2 2 0 0 0 2 1.6 h9.8 a2 2 0 0 0 2 -1.6 l1.7 -7.4 M4.5 15.5 h15 M5 11 l4 -7 m0 7 1 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 11
                moveTo(x = 15.0f, y = 11.0f)
                // l -1 9
                lineToRelative(dx = -1.0f, dy = 9.0f)
                // m 5 -9
                moveToRelative(dx = 5.0f, dy = -9.0f)
                // l -4 -7
                lineToRelative(dx = -4.0f, dy = -7.0f)
                // M 2 11
                moveTo(x = 2.0f, y = 11.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 3.5 11
                moveTo(x = 3.5f, y = 11.0f)
                // l 1.6 7.4
                lineToRelative(dx = 1.6f, dy = 7.4f)
                // a 2 2 0 0 0 2 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 1.6f,
                )
                // h 9.8
                horizontalLineToRelative(dx = 9.8f)
                // a 2 2 0 0 0 2 -1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -1.6f,
                )
                // l 1.7 -7.4
                lineToRelative(dx = 1.7f, dy = -7.4f)
                // M 4.5 15.5
                moveTo(x = 4.5f, y = 15.5f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // M 5 11
                moveTo(x = 5.0f, y = 11.0f)
                // l 4 -7
                lineToRelative(dx = 4.0f, dy = -7.0f)
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // l 1 9
                lineToRelative(dx = 1.0f, dy = 9.0f)
            }
        }.build().also { _shoppingBasket = it }
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
                imageVector = ShoppingBasket,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shoppingBasket: ImageVector? = null
