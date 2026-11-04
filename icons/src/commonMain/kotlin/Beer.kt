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

val Beer: ImageVector
    get() {
        val current = _beer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Beer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 11 h1 a3 3 0 0 1 0 6 h-1 m-8 -5 v6 m4 -6 v6 m1 -10.5 c-1 0 -1.44 .5 -3 .5 S9 7.5 8 7.5 6.28 8 5.5 8 a2.5 2.5 0 0 1 0 -5 C6.28 3 7.07 3.5 8 3.5 S9.44 2 11 2 s2 1.5 3 1.5 S15.72 3 16.5 3 a2.5 2.5 0 0 1 0 5 C15.72 8 15 7.5 14 7.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 11
                moveTo(x = 17.0f, y = 11.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // m -8 -5
                moveToRelative(dx = -8.0f, dy = -5.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 4 -6
                moveToRelative(dx = 4.0f, dy = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 1 -10.5
                moveToRelative(dx = 1.0f, dy = -10.5f)
                // c -1 0 -1.44 0.5 -3 0.5
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.44f,
                    dy2 = 0.5f,
                    dx3 = -3.0f,
                    dy3 = 0.5f,
                )
                // S 9 7.5 8 7.5
                reflectiveCurveTo(
                    x1 = 9.0f,
                    y1 = 7.5f,
                    x2 = 8.0f,
                    y2 = 7.5f,
                )
                // S 6.28 8 5.5 8
                reflectiveCurveTo(
                    x1 = 6.28f,
                    y1 = 8.0f,
                    x2 = 5.5f,
                    y2 = 8.0f,
                )
                // a 2.5 2.5 0 0 1 0 -5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // C 6.28 3 7.07 3.5 8 3.5
                curveTo(
                    x1 = 6.28f,
                    y1 = 3.0f,
                    x2 = 7.07f,
                    y2 = 3.5f,
                    x3 = 8.0f,
                    y3 = 3.5f,
                )
                // S 9.44 2 11 2
                reflectiveCurveTo(
                    x1 = 9.44f,
                    y1 = 2.0f,
                    x2 = 11.0f,
                    y2 = 2.0f,
                )
                // s 2 1.5 3 1.5
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.5f,
                    dx2 = 3.0f,
                    dy2 = 1.5f,
                )
                // S 15.72 3 16.5 3
                reflectiveCurveTo(
                    x1 = 15.72f,
                    y1 = 3.0f,
                    x2 = 16.5f,
                    y2 = 3.0f,
                )
                // a 2.5 2.5 0 0 1 0 5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // C 15.72 8 15 7.5 14 7.5
                curveTo(
                    x1 = 15.72f,
                    y1 = 8.0f,
                    x2 = 15.0f,
                    y2 = 7.5f,
                    x3 = 14.0f,
                    y3 = 7.5f,
                )
            }
            // M5 8 v12 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
            }
        }.build().also { _beer = it }
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
                imageVector = Beer,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _beer: ImageVector? = null
