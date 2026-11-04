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

val BrickWallShield: ImageVector
    get() {
        val current = _brickWallShield
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BrickWallShield",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 9 v1.26 M16 3 v5.46 m5 .66 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h5.75
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // v 1.26
                verticalLineToRelative(dy = 1.26f)
                // M 16 3
                moveTo(x = 16.0f, y = 3.0f)
                // v 5.46
                verticalLineToRelative(dy = 5.46f)
                // m 5 0.66
                moveToRelative(dx = 5.0f, dy = 0.66f)
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
                // h 5.75
                horizontalLineToRelative(dx = 5.75f)
            }
            // M22 17.5 c0 2.5 -1.75 3.75 -3.83 4.47 a.5 .5 0 0 1 -.33 0 C15.75 21.25 14 20 14 17.5 V14 a.5 .5 0 0 1 .5 -.5 c1 0 2.25 -.6 3.12 -1.36 a.6 .6 0 0 1 .76 0 5.3 5.3 0 0 0 3.12 1.36 A.5 .5 0 0 1 22 14z M3 15 h7 M3 9 h12.14 M8 15 v6 M8 3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 17.5
                moveTo(x = 22.0f, y = 17.5f)
                // c 0 2.5 -1.75 3.75 -3.83 4.47
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.5f,
                    dx2 = -1.75f,
                    dy2 = 3.75f,
                    dx3 = -3.83f,
                    dy3 = 4.47f,
                )
                // a 0.5 0.5 0 0 1 -0.33 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.33f,
                    dy1 = 0.0f,
                )
                // C 15.75 21.25 14 20 14 17.5
                curveTo(
                    x1 = 15.75f,
                    y1 = 21.25f,
                    x2 = 14.0f,
                    y2 = 20.0f,
                    x3 = 14.0f,
                    y3 = 17.5f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // a 0.5 0.5 0 0 1 0.5 -0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = -0.5f,
                )
                // c 1 0 2.25 -0.6 3.12 -1.36
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.25f,
                    dy2 = -0.6f,
                    dx3 = 3.12f,
                    dy3 = -1.36f,
                )
                // a 0.6 0.6 0 0 1 0.76 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.76f,
                    dy1 = 0.0f,
                )
                // a 5.3 5.3 0 0 0 3.12 1.36
                arcToRelative(
                    a = 5.3f,
                    b = 5.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.12f,
                    dy1 = 1.36f,
                )
                // A 0.5 0.5 0 0 1 22 14z
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                close()
                // M 3 15
                moveTo(x = 3.0f, y = 15.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 12.14
                horizontalLineToRelative(dx = 12.14f)
                // M 8 15
                moveTo(x = 8.0f, y = 15.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _brickWallShield = it }
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
                imageVector = BrickWallShield,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brickWallShield: ImageVector? = null
