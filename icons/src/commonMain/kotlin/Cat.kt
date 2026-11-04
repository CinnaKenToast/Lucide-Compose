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

val Cat: ImageVector
    get() {
        val current = _cat
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Cat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 5 a8 8 0 0 1 2 .26 c1.78 -2 5.03 -2.84 6.42 -2.26 1.4 .58 -.42 7 -.42 7 a7.4 7.4 0 0 1 1 3.44 C21 17.9 16.97 21 12 21 s-9 -3 -9 -7.56 c0 -1.25 .5 -2.4 1 -3.44 0 0 -1.89 -6.42 -.5 -7 S8.22 3.23 10 5.23 A9 9 0 0 1 12 5 m-4 9 v.5 m8 -.5 v.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // a 8 8 0 0 1 2 0.26
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.26f,
                )
                // c 1.78 -2 5.03 -2.84 6.42 -2.26
                curveToRelative(
                    dx1 = 1.78f,
                    dy1 = -2.0f,
                    dx2 = 5.03f,
                    dy2 = -2.84f,
                    dx3 = 6.42f,
                    dy3 = -2.26f,
                )
                // c 1.4 0.58 -0.42 7 -0.42 7
                curveToRelative(
                    dx1 = 1.4f,
                    dy1 = 0.58f,
                    dx2 = -0.42f,
                    dy2 = 7.0f,
                    dx3 = -0.42f,
                    dy3 = 7.0f,
                )
                // a 7.4 7.4 0 0 1 1 3.44
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 3.44f,
                )
                // C 21 17.9 16.97 21 12 21
                curveTo(
                    x1 = 21.0f,
                    y1 = 17.9f,
                    x2 = 16.97f,
                    y2 = 21.0f,
                    x3 = 12.0f,
                    y3 = 21.0f,
                )
                // s -9 -3 -9 -7.56
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = -3.0f,
                    dx2 = -9.0f,
                    dy2 = -7.56f,
                )
                // c 0 -1.25 0.5 -2.4 1 -3.44
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.25f,
                    dx2 = 0.5f,
                    dy2 = -2.4f,
                    dx3 = 1.0f,
                    dy3 = -3.44f,
                )
                // c 0 0 -1.89 -6.42 -0.5 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.89f,
                    dy2 = -6.42f,
                    dx3 = -0.5f,
                    dy3 = -7.0f,
                )
                // S 8.22 3.23 10 5.23
                reflectiveCurveTo(
                    x1 = 8.22f,
                    y1 = 3.23f,
                    x2 = 10.0f,
                    y2 = 5.23f,
                )
                // A 9 9 0 0 1 12 5
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 5.0f,
                )
                // m -4 9
                moveToRelative(dx = -4.0f, dy = 9.0f)
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
                // m 8 -0.5
                moveToRelative(dx = 8.0f, dy = -0.5f)
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
            }
            // M11.25 16.25 h1.5 L12 17z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.25 16.25
                moveTo(x = 11.25f, y = 16.25f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // L 12 17z
                lineTo(x = 12.0f, y = 17.0f)
                close()
            }
        }.build().also { _cat = it }
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
                imageVector = Cat,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cat: ImageVector? = null
