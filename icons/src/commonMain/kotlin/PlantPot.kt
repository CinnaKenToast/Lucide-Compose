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

val PlantPot: ImageVector
    get() {
        val current = _plantPot
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PlantPot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 8.54 V6 a4 4 0 0 1 4 -4 h1.5 A.5 .5 0 0 1 20 2.5 V4 a4 4 0 0 1 -4 4 4 4 0 0 0 -4 4 5 5 0 0 1 -8 -4 5 5 0 0 1 8 4 c0 2 1 3 1 5 m5 0 -1.08 3.58 A2 2 0 0 1 15 22 H9 a2 2 0 0 1 -1.91 -1.42 L6 17 m-1 0 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 8.54
                moveTo(x = 14.0f, y = 8.54f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // A 0.5 0.5 0 0 1 20 2.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 2.5f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 5 5 0 0 1 -8 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = -4.0f,
                )
                // a 5 5 0 0 1 8 4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 4.0f,
                )
                // c 0 2 1 3 1 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 3.0f,
                    dx3 = 1.0f,
                    dy3 = 5.0f,
                )
                // m 5 0
                moveToRelative(dx = 5.0f, dy = 0.0f)
                // l -1.08 3.58
                lineToRelative(dx = -1.08f, dy = 3.58f)
                // A 2 2 0 0 1 15 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 22.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 2 2 0 0 1 -1.91 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.91f,
                    dy1 = -1.42f,
                )
                // L 6 17
                lineTo(x = 6.0f, y = 17.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _plantPot = it }
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
                imageVector = PlantPot,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _plantPot: ImageVector? = null
