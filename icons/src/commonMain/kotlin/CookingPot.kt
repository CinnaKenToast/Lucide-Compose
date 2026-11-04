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

val CookingPot: ImageVector
    get() {
        val current = _cookingPot
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CookingPot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 12 h20 m-2 0 v8 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 v-8 m0 -4 16 -4 M8.86 6.78 8.41 4.97 a2 2 0 0 1 1.45 -2.43 l1.94 -.48 a2 2 0 0 1 2.43 1.46 l.45 1.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // l 16 -4
                lineToRelative(dx = 16.0f, dy = -4.0f)
                // M 8.86 6.78
                moveTo(x = 8.86f, y = 6.78f)
                // L 8.41 4.97
                lineTo(x = 8.41f, y = 4.97f)
                // a 2 2 0 0 1 1.45 -2.43
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.45f,
                    dy1 = -2.43f,
                )
                // l 1.94 -0.48
                lineToRelative(dx = 1.94f, dy = -0.48f)
                // a 2 2 0 0 1 2.43 1.46
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.43f,
                    dy1 = 1.46f,
                )
                // l 0.45 1.8
                lineToRelative(dx = 0.45f, dy = 1.8f)
            }
        }.build().also { _cookingPot = it }
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
                imageVector = CookingPot,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cookingPot: ImageVector? = null
