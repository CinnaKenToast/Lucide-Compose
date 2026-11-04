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

val HeartMinus: ImageVector
    get() {
        val current = _heartMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.HeartMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14.88 18.99 -1.37 1.32 a2 2 0 0 1 -3 .02 L5 15 c-1.5 -1.5 -3 -3.2 -3 -5.5 a5.5 5.5 0 0 1 9.6 -3.68 .56 .56 0 0 0 .8 0 A5.49 5.49 0 0 1 22 9.5 a5 5 0 0 1 -.24 1.57 M15 15 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.88 18.99
                moveTo(x = 14.88f, y = 18.99f)
                // l -1.37 1.32
                lineToRelative(dx = -1.37f, dy = 1.32f)
                // a 2 2 0 0 1 -3 0.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.02f,
                )
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // c -1.5 -1.5 -3 -3.2 -3 -5.5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = -1.5f,
                    dx2 = -3.0f,
                    dy2 = -3.2f,
                    dx3 = -3.0f,
                    dy3 = -5.5f,
                )
                // a 5.5 5.5 0 0 1 9.6 -3.68
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.6f,
                    dy1 = -3.68f,
                )
                // a 0.56 0.56 0 0 0 0.8 0
                arcToRelative(
                    a = 0.56f,
                    b = 0.56f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                )
                // A 5.49 5.49 0 0 1 22 9.5
                arcTo(
                    horizontalEllipseRadius = 5.49f,
                    verticalEllipseRadius = 5.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 9.5f,
                )
                // a 5 5 0 0 1 -0.24 1.57
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.24f,
                    dy1 = 1.57f,
                )
                // M 15 15
                moveTo(x = 15.0f, y = 15.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _heartMinus = it }
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
                imageVector = HeartMinus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _heartMinus: ImageVector? = null
