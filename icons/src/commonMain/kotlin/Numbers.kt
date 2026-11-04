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

val Numbers: ImageVector
    get() {
        val current = _numbers
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Numbers",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 4 2.6 -1.95 a.25 .25 0 0 1 .4 .2 V10 m3 4.54 A4 4 0 0 1 18 14 a2 2 0 0 1 0 4 2 2 0 0 1 0 4 4 4 0 0 1 -2 -.53 M8 22 H4.5 A.5 .5 0 0 1 4 21.5 c0 -2.68 4 -2.93 4 -5.5 a2 2 0 0 0 -2 -2 2.5 2.5 0 0 0 -2 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // l 2.6 -1.95
                lineToRelative(dx = 2.6f, dy = -1.95f)
                // a 0.25 0.25 0 0 1 0.4 0.2
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.2f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // m 3 4.54
                moveToRelative(dx = 3.0f, dy = 4.54f)
                // A 4 4 0 0 1 18 14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 14.0f,
                )
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 1 -2 -0.53
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -0.53f,
                )
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // H 4.5
                horizontalLineTo(x = 4.5f)
                // A 0.5 0.5 0 0 1 4 21.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 21.5f,
                )
                // c 0 -2.68 4 -2.93 4 -5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.68f,
                    dx2 = 4.0f,
                    dy2 = -2.93f,
                    dx3 = 4.0f,
                    dy3 = -5.5f,
                )
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // a 2.5 2.5 0 0 0 -2 1
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                )
            }
        }.build().also { _numbers = it }
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
                imageVector = Numbers,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _numbers: ImageVector? = null
