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

val PenOff: ImageVector
    get() {
        val current = _penOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PenOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 10 -6.16 6.16 A2 2 0 0 0 3.34 17 l-1.32 4.36 a.5 .5 0 0 0 .62 .63 L7 20.66 a2 2 0 0 0 .83 -.5 L14 13.98 m-1.17 -6.8 4.36 -4.35 a1 1 0 1 1 3.98 3.98 l-4.35 4.35 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // l -6.16 6.16
                lineToRelative(dx = -6.16f, dy = 6.16f)
                // A 2 2 0 0 0 3.34 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.34f,
                    y1 = 17.0f,
                )
                // l -1.32 4.36
                lineToRelative(dx = -1.32f, dy = 4.36f)
                // a 0.5 0.5 0 0 0 0.62 0.63
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.63f,
                )
                // L 7 20.66
                lineTo(x = 7.0f, y = 20.66f)
                // a 2 2 0 0 0 0.83 -0.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.5f,
                )
                // L 14 13.98
                lineTo(x = 14.0f, y = 13.98f)
                // m -1.17 -6.8
                moveToRelative(dx = -1.17f, dy = -6.8f)
                // l 4.36 -4.35
                lineToRelative(dx = 4.36f, dy = -4.35f)
                // a 1 1 0 1 1 3.98 3.98
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.98f,
                    dy1 = 3.98f,
                )
                // l -4.35 4.35
                lineToRelative(dx = -4.35f, dy = 4.35f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _penOff = it }
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
                imageVector = PenOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _penOff: ImageVector? = null
