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

val StarOff: ImageVector
    get() {
        val current = _starOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.StarOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.34 4.69 1.18 -2.4 a.53 .53 0 0 1 .95 0 l2.31 4.68 a2.1 2.1 0 0 0 1.6 1.16 l5.17 .76 a.53 .53 0 0 1 .29 .9 l-3.24 3.16 m-.66 5 .43 2.5 a.53 .53 0 0 1 -.77 .56 L13 18.58 a2.1 2.1 0 0 0 -1.98 0 L6.4 21.01 a.53 .53 0 0 1 -.77 -.56 l.88 -5.14 a2.1 2.1 0 0 0 -.61 -1.88 L2.16 9.8 a.53 .53 0 0 1 .3 -.91 l5.16 -.76 .4 -.1 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.34 4.69
                moveTo(x = 10.34f, y = 4.69f)
                // l 1.18 -2.4
                lineToRelative(dx = 1.18f, dy = -2.4f)
                // a 0.53 0.53 0 0 1 0.95 0
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.95f,
                    dy1 = 0.0f,
                )
                // l 2.31 4.68
                lineToRelative(dx = 2.31f, dy = 4.68f)
                // a 2.1 2.1 0 0 0 1.6 1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = 1.16f,
                )
                // l 5.17 0.76
                lineToRelative(dx = 5.17f, dy = 0.76f)
                // a 0.53 0.53 0 0 1 0.29 0.9
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.29f,
                    dy1 = 0.9f,
                )
                // l -3.24 3.16
                lineToRelative(dx = -3.24f, dy = 3.16f)
                // m -0.66 5
                moveToRelative(dx = -0.66f, dy = 5.0f)
                // l 0.43 2.5
                lineToRelative(dx = 0.43f, dy = 2.5f)
                // a 0.53 0.53 0 0 1 -0.77 0.56
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = 0.56f,
                )
                // L 13 18.58
                lineTo(x = 13.0f, y = 18.58f)
                // a 2.1 2.1 0 0 0 -1.98 0
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.98f,
                    dy1 = 0.0f,
                )
                // L 6.4 21.01
                lineTo(x = 6.4f, y = 21.01f)
                // a 0.53 0.53 0 0 1 -0.77 -0.56
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = -0.56f,
                )
                // l 0.88 -5.14
                lineToRelative(dx = 0.88f, dy = -5.14f)
                // a 2.1 2.1 0 0 0 -0.61 -1.88
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.61f,
                    dy1 = -1.88f,
                )
                // L 2.16 9.8
                lineTo(x = 2.16f, y = 9.8f)
                // a 0.53 0.53 0 0 1 0.3 -0.91
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = -0.91f,
                )
                // l 5.16 -0.76
                lineToRelative(dx = 5.16f, dy = -0.76f)
                // l 0.4 -0.1
                lineToRelative(dx = 0.4f, dy = -0.1f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _starOff = it }
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
                imageVector = StarOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _starOff: ImageVector? = null
