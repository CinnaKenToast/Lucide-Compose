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

val BrickWallFire: ImageVector
    get() {
        val current = _brickWallFire
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BrickWallFire",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 3 v2.1 M17 9 c1 3 2.5 3.5 3.5 4.5 A5 5 0 0 1 22 17 a5 5 0 0 1 -10 0 c0 -.3 0 -.6 .1 -.9 a2 2 0 1 0 3.3 -2 C13 11.5 16 9 17 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 3
                moveTo(x = 16.0f, y = 3.0f)
                // v 2.1
                verticalLineToRelative(dy = 2.1f)
                // M 17 9
                moveTo(x = 17.0f, y = 9.0f)
                // c 1 3 2.5 3.5 3.5 4.5
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 3.0f,
                    dx2 = 2.5f,
                    dy2 = 3.5f,
                    dx3 = 3.5f,
                    dy3 = 4.5f,
                )
                // A 5 5 0 0 1 22 17
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 17.0f,
                )
                // a 5 5 0 0 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                // c 0 -0.3 0 -0.6 0.1 -0.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = 0.0f,
                    dy2 = -0.6f,
                    dx3 = 0.1f,
                    dy3 = -0.9f,
                )
                // a 2 2 0 1 0 3.3 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.3f,
                    dy1 = -2.0f,
                )
                // C 13 11.5 16 9 17 9
                curveTo(
                    x1 = 13.0f,
                    y1 = 11.5f,
                    x2 = 16.0f,
                    y2 = 9.0f,
                    x3 = 17.0f,
                    y3 = 9.0f,
                )
            }
            // M21 8.27 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h3.94 M3 15 h5.25 M3 9 h8.23 M8 15 v6 M8 3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 8.27
                moveTo(x = 21.0f, y = 8.27f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 3.94
                horizontalLineToRelative(dx = 3.94f)
                // M 3 15
                moveTo(x = 3.0f, y = 15.0f)
                // h 5.25
                horizontalLineToRelative(dx = 5.25f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 8.23
                horizontalLineToRelative(dx = 8.23f)
                // M 8 15
                moveTo(x = 8.0f, y = 15.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _brickWallFire = it }
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
                imageVector = BrickWallFire,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brickWallFire: ImageVector? = null
