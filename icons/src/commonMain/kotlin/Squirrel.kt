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

val Squirrel: ImageVector
    get() {
        val current = _squirrel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Squirrel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.24 22 a3 3 0 0 0 -2.2 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.24 22
                moveTo(x = 15.24f, y = 22.0f)
                // a 3 3 0 0 0 -2.2 -5
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.2f,
                    dy1 = -5.0f,
                )
            }
            // M16 20 a3 3 0 0 1 3 -3 h1 a2 2 0 0 0 2 -2 v-2 a4 4 0 0 0 -4 -4 V4 m0 9 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // m 0 9
                moveToRelative(dx = 0.0f, dy = 9.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
            // M18 6 a4 4 0 0 0 -4 4 7 7 0 0 0 -7 7 c0 -5 4 -5 4 -10.5 a4.5 4.5 0 1 0 -9 0 2.5 2.5 0 0 0 5 0 C7 10 3 11 3 17 c0 2.8 2.2 5 5 5 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
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
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // c 0 -5 4 -5 4 -10.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                    dx2 = 4.0f,
                    dy2 = -5.0f,
                    dx3 = 4.0f,
                    dy3 = -10.5f,
                )
                // a 4.5 4.5 0 1 0 -9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 0 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // C 7 10 3 11 3 17
                curveTo(
                    x1 = 7.0f,
                    y1 = 10.0f,
                    x2 = 3.0f,
                    y2 = 11.0f,
                    x3 = 3.0f,
                    y3 = 17.0f,
                )
                // c 0 2.8 2.2 5 5 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.8f,
                    dx2 = 2.2f,
                    dy2 = 5.0f,
                    dx3 = 5.0f,
                    dy3 = 5.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _squirrel = it }
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
                imageVector = Squirrel,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _squirrel: ImageVector? = null
