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

val BellMinus: ImageVector
    get() {
        val current = _bellMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BellMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.27 21 a2 2 0 0 0 3.46 0 M15 8 h6 m-4.76 -4.24 A6 6 0 0 0 6 8 c0 4.5 -1.41 5.96 -2.74 7.33 A1 1 0 0 0 4 17 h16 a1 1 0 0 0 .74 -1.67 A9 9 0 0 1 18.67 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.27 21
                moveTo(x = 10.27f, y = 21.0f)
                // a 2 2 0 0 0 3.46 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = 0.0f,
                )
                // M 15 8
                moveTo(x = 15.0f, y = 8.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -4.76 -4.24
                moveToRelative(dx = -4.76f, dy = -4.24f)
                // A 6 6 0 0 0 6 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 8.0f,
                )
                // c 0 4.5 -1.41 5.96 -2.74 7.33
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.5f,
                    dx2 = -1.41f,
                    dy2 = 5.96f,
                    dx3 = -2.74f,
                    dy3 = 7.33f,
                )
                // A 1 1 0 0 0 4 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 17.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 1 1 0 0 0 0.74 -1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = -1.67f,
                )
                // A 9 9 0 0 1 18.67 12
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.67f,
                    y1 = 12.0f,
                )
            }
        }.build().also { _bellMinus = it }
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
                imageVector = BellMinus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bellMinus: ImageVector? = null
