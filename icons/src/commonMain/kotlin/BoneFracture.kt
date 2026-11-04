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

val BoneFracture: ImageVector
    get() {
        val current = _boneFracture
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BoneFracture",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 4.5 a1 1 0 0 1 5 0 A.5 .5 0 0 0 19.5 5 a1 1 0 0 1 0 5 c-.81 0 -1.8 -.7 -2.5 0 l-1.96 1.96 a.15 .15 0 0 1 -.25 -.08 l-.5 -2.06 a.2 .2 0 0 0 -.1 -.12 L12.1 9.2 a.15 .15 0 0 1 -.07 -.24 L14 7 c.7 -.7 0 -1.69 0 -2.5 M16 20 l-1 -2 m5 -2 -2 -1 M4 8 l2 1 m2 -5 1 2 m.7 8.19 A.2 .2 0 0 0 9.8 14.3 l2.07 .5 a.15 .15 0 0 1 .08 .24 L10 17 c-.7 .7 0 1.69 0 2.5 a1 1 0 0 1 -5 0 A.5 .5 0 0 0 4.5 19 a1 1 0 0 1 0 -5 c.81 0 1.8 .7 2.5 0 l1.96 -1.96 a.15 .15 0 0 1 .25 .08z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 4.5
                moveTo(x = 14.0f, y = 4.5f)
                // a 1 1 0 0 1 5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // A 0.5 0.5 0 0 0 19.5 5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.5f,
                    y1 = 5.0f,
                )
                // a 1 1 0 0 1 0 5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // c -0.81 0 -1.8 -0.7 -2.5 0
                curveToRelative(
                    dx1 = -0.81f,
                    dy1 = 0.0f,
                    dx2 = -1.8f,
                    dy2 = -0.7f,
                    dx3 = -2.5f,
                    dy3 = 0.0f,
                )
                // l -1.96 1.96
                lineToRelative(dx = -1.96f, dy = 1.96f)
                // a 0.15 0.15 0 0 1 -0.25 -0.08
                arcToRelative(
                    a = 0.15f,
                    b = 0.15f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.25f,
                    dy1 = -0.08f,
                )
                // l -0.5 -2.06
                lineToRelative(dx = -0.5f, dy = -2.06f)
                // a 0.2 0.2 0 0 0 -0.1 -0.12
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = -0.12f,
                )
                // L 12.1 9.2
                lineTo(x = 12.1f, y = 9.2f)
                // a 0.15 0.15 0 0 1 -0.07 -0.24
                arcToRelative(
                    a = 0.15f,
                    b = 0.15f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.07f,
                    dy1 = -0.24f,
                )
                // L 14 7
                lineTo(x = 14.0f, y = 7.0f)
                // c 0.7 -0.7 0 -1.69 0 -2.5
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = -0.7f,
                    dx2 = 0.0f,
                    dy2 = -1.69f,
                    dx3 = 0.0f,
                    dy3 = -2.5f,
                )
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // l -1 -2
                lineToRelative(dx = -1.0f, dy = -2.0f)
                // m 5 -2
                moveToRelative(dx = 5.0f, dy = -2.0f)
                // l -2 -1
                lineToRelative(dx = -2.0f, dy = -1.0f)
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // l 2 1
                lineToRelative(dx = 2.0f, dy = 1.0f)
                // m 2 -5
                moveToRelative(dx = 2.0f, dy = -5.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // m 0.7 8.19
                moveToRelative(dx = 0.7f, dy = 8.19f)
                // A 0.2 0.2 0 0 0 9.8 14.3
                arcTo(
                    horizontalEllipseRadius = 0.2f,
                    verticalEllipseRadius = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.8f,
                    y1 = 14.3f,
                )
                // l 2.07 0.5
                lineToRelative(dx = 2.07f, dy = 0.5f)
                // a 0.15 0.15 0 0 1 0.08 0.24
                arcToRelative(
                    a = 0.15f,
                    b = 0.15f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.08f,
                    dy1 = 0.24f,
                )
                // L 10 17
                lineTo(x = 10.0f, y = 17.0f)
                // c -0.7 0.7 0 1.69 0 2.5
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = 0.7f,
                    dx2 = 0.0f,
                    dy2 = 1.69f,
                    dx3 = 0.0f,
                    dy3 = 2.5f,
                )
                // a 1 1 0 0 1 -5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // A 0.5 0.5 0 0 0 4.5 19
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.5f,
                    y1 = 19.0f,
                )
                // a 1 1 0 0 1 0 -5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // c 0.81 0 1.8 0.7 2.5 0
                curveToRelative(
                    dx1 = 0.81f,
                    dy1 = 0.0f,
                    dx2 = 1.8f,
                    dy2 = 0.7f,
                    dx3 = 2.5f,
                    dy3 = 0.0f,
                )
                // l 1.96 -1.96
                lineToRelative(dx = 1.96f, dy = -1.96f)
                // a 0.15 0.15 0 0 1 0.25 0.08z
                arcToRelative(
                    a = 0.15f,
                    b = 0.15f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.25f,
                    dy1 = 0.08f,
                )
                close()
            }
        }.build().also { _boneFracture = it }
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
                imageVector = BoneFracture,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _boneFracture: ImageVector? = null
