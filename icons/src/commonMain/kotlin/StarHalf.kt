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

val StarHalf: ImageVector
    get() {
        val current = _starHalf
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.StarHalf",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18.34 a2 2 0 0 0 -.99 .24 L6.4 21.01 a.53 .53 0 0 1 -.77 -.56 l.88 -5.14 a2.1 2.1 0 0 0 -.61 -1.88 L2.16 9.8 a.53 .53 0 0 1 .3 -.91 l5.16 -.76 a2.1 2.1 0 0 0 1.6 -1.16 l2.3 -4.68 A.5 .5 0 0 1 12 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18.34
                moveTo(x = 12.0f, y = 18.34f)
                // a 2 2 0 0 0 -0.99 0.24
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.99f,
                    dy1 = 0.24f,
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
                // a 2.1 2.1 0 0 0 1.6 -1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = -1.16f,
                )
                // l 2.3 -4.68
                lineToRelative(dx = 2.3f, dy = -4.68f)
                // A 0.5 0.5 0 0 1 12 2
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
            }
        }.build().also { _starHalf = it }
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
                imageVector = StarHalf,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _starHalf: ImageVector? = null
