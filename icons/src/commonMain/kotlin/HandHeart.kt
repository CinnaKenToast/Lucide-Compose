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

val HandHeart: ImageVector
    get() {
        val current = _handHeart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.HandHeart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 14 h2 a2 2 0 0 0 0 -4 h-3 c-.6 0 -1.1 .2 -1.4 .6 L3 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 14
                moveTo(x = 11.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.6 0 -1.1 0.2 -1.4 0.6
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = 0.0f,
                    dx2 = -1.1f,
                    dy2 = 0.2f,
                    dx3 = -1.4f,
                    dy3 = 0.6f,
                )
                // L 3 16
                lineTo(x = 3.0f, y = 16.0f)
            }
            // m14.45 13.39 5.05 -4.7 C20.2 8 21 6.86 21 5.76 a2.75 2.75 0 0 0 -4.8 -1.84 .3 .3 0 0 1 -.4 0 A2.75 2.75 0 0 0 11 5.75 c0 1.2 .8 2.25 1.5 2.95 l3.5 3.25 M2 15 l6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.45 13.39
                moveTo(x = 14.45f, y = 13.39f)
                // l 5.05 -4.7
                lineToRelative(dx = 5.05f, dy = -4.7f)
                // C 20.2 8 21 6.86 21 5.76
                curveTo(
                    x1 = 20.2f,
                    y1 = 8.0f,
                    x2 = 21.0f,
                    y2 = 6.86f,
                    x3 = 21.0f,
                    y3 = 5.76f,
                )
                // a 2.75 2.75 0 0 0 -4.8 -1.84
                arcToRelative(
                    a = 2.75f,
                    b = 2.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.8f,
                    dy1 = -1.84f,
                )
                // a 0.3 0.3 0 0 1 -0.4 0
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
                // A 2.75 2.75 0 0 0 11 5.75
                arcTo(
                    horizontalEllipseRadius = 2.75f,
                    verticalEllipseRadius = 2.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 5.75f,
                )
                // c 0 1.2 0.8 2.25 1.5 2.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.2f,
                    dx2 = 0.8f,
                    dy2 = 2.25f,
                    dx3 = 1.5f,
                    dy3 = 2.95f,
                )
                // l 3.5 3.25
                lineToRelative(dx = 3.5f, dy = 3.25f)
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
            }
            // m7 20 1.6 -1.4 C8.9 18.2 9.4 18 10 18 h4 c1.1 0 2.1 -.4 2.8 -1.2 l4.6 -4.4 a1 1 0 0 0 -2.75 -2.91
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 20
                moveTo(x = 7.0f, y = 20.0f)
                // l 1.6 -1.4
                lineToRelative(dx = 1.6f, dy = -1.4f)
                // C 8.9 18.2 9.4 18 10 18
                curveTo(
                    x1 = 8.9f,
                    y1 = 18.2f,
                    x2 = 9.4f,
                    y2 = 18.0f,
                    x3 = 10.0f,
                    y3 = 18.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1.1 0 2.1 -0.4 2.8 -1.2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.1f,
                    dy2 = -0.4f,
                    dx3 = 2.8f,
                    dy3 = -1.2f,
                )
                // l 4.6 -4.4
                lineToRelative(dx = 4.6f, dy = -4.4f)
                // a 1 1 0 0 0 -2.75 -2.91
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.75f,
                    dy1 = -2.91f,
                )
            }
        }.build().also { _handHeart = it }
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
                imageVector = HandHeart,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _handHeart: ImageVector? = null
