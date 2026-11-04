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

val Bitcoin: ImageVector
    get() {
        val current = _bitcoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Bitcoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.77 19.09 a3.5 3.5 0 0 0 1.21 -6.9 m-1.21 6.9 -5.91 -1.04 m5.9 1.04 -.34 1.97 m1.56 -8.86 a3.5 3.5 0 0 0 1.22 -6.9 m-1.22 6.9 -3.94 -.7 m5.16 -6.2 L8.29 4.26 m5.9 1.04 .36 -1.97 M7.48 20.36 l3.13 -17.72
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.77 19.09
                moveTo(x = 11.77f, y = 19.09f)
                // a 3.5 3.5 0 0 0 1.21 -6.9
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.21f,
                    dy1 = -6.9f,
                )
                // m -1.21 6.9
                moveToRelative(dx = -1.21f, dy = 6.9f)
                // l -5.91 -1.04
                lineToRelative(dx = -5.91f, dy = -1.04f)
                // m 5.9 1.04
                moveToRelative(dx = 5.9f, dy = 1.04f)
                // l -0.34 1.97
                lineToRelative(dx = -0.34f, dy = 1.97f)
                // m 1.56 -8.86
                moveToRelative(dx = 1.56f, dy = -8.86f)
                // a 3.5 3.5 0 0 0 1.22 -6.9
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.22f,
                    dy1 = -6.9f,
                )
                // m -1.22 6.9
                moveToRelative(dx = -1.22f, dy = 6.9f)
                // l -3.94 -0.7
                lineToRelative(dx = -3.94f, dy = -0.7f)
                // m 5.16 -6.2
                moveToRelative(dx = 5.16f, dy = -6.2f)
                // L 8.29 4.26
                lineTo(x = 8.29f, y = 4.26f)
                // m 5.9 1.04
                moveToRelative(dx = 5.9f, dy = 1.04f)
                // l 0.36 -1.97
                lineToRelative(dx = 0.36f, dy = -1.97f)
                // M 7.48 20.36
                moveTo(x = 7.48f, y = 20.36f)
                // l 3.13 -17.72
                lineToRelative(dx = 3.13f, dy = -17.72f)
            }
        }.build().also { _bitcoin = it }
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
                imageVector = Bitcoin,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bitcoin: ImageVector? = null
