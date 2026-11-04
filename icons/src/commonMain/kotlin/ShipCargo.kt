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

val ShipCargo: ImageVector
    get() {
        val current = _shipCargo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ShipCargo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 15 v-3 m0 -10 v2 m4.5 8 V9 a1 1 0 0 1 1 -1 h1 a1 1 0 0 0 1 -1 V5 a1 1 0 0 0 -1 -1 h-13 a1 1 0 0 0 -1 1 v2 a1 1 0 0 0 1 1 h1 a1 1 0 0 1 1 1 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4.5 8
                moveToRelative(dx = 4.5f, dy = 8.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -13
                horizontalLineToRelative(dx = -13.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
            // M19.38 19 a15 15 0 0 0 1.63 -6 1 1 0 0 0 -1 -1 H3.98 a1 1 0 0 0 -1 .98 c-.03 1.86 .97 5.63 2.83 7.78
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.38 19
                moveTo(x = 19.38f, y = 19.0f)
                // a 15 15 0 0 0 1.63 -6
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.63f,
                    dy1 = -6.0f,
                )
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 3.98
                horizontalLineTo(x = 3.98f)
                // a 1 1 0 0 0 -1 0.98
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.98f,
                )
                // c -0.03 1.86 0.97 5.63 2.83 7.78
                curveToRelative(
                    dx1 = -0.03f,
                    dy1 = 1.86f,
                    dx2 = 0.97f,
                    dy2 = 5.63f,
                    dx3 = 2.83f,
                    dy3 = 7.78f,
                )
            }
            // M2 20 c.6 .5 1.2 1 2.5 1 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 s1.2 1 2.5 1 c2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 20
                moveTo(x = 2.0f, y = 20.0f)
                // c 0.6 0.5 1.2 1 2.5 1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.5f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // s 1.2 1 2.5 1
                reflectiveCurveToRelative(
                    dx1 = 1.2f,
                    dy1 = 1.0f,
                    dx2 = 2.5f,
                    dy2 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
            }
        }.build().also { _shipCargo = it }
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
                imageVector = ShipCargo,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shipCargo: ImageVector? = null
