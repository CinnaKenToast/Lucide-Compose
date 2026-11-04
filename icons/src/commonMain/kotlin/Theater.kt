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

val Theater: ImageVector
    get() {
        val current = _theater
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Theater",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 10 s3 -3 3 -8 m17 8 s-3 -3 -3 -8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // s 3 -3 3 -8
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -8.0f,
                )
                // m 17 8
                moveToRelative(dx = 17.0f, dy = 8.0f)
                // s -3 -3 -3 -8
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                    dx2 = -3.0f,
                    dy2 = -8.0f,
                )
            }
            // M10 2 c0 4.4 -3.6 8 -8 8 m12 -8 c0 4.4 3.6 8 8 8 M2 10 s2 2 2 5 m18 -5 s-2 2 -2 5 M8 15 h8 M2 22 v-1 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v1 m4 0 v-1 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // c 0 4.4 -3.6 8 -8 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.4f,
                    dx2 = -3.6f,
                    dy2 = 8.0f,
                    dx3 = -8.0f,
                    dy3 = 8.0f,
                )
                // m 12 -8
                moveToRelative(dx = 12.0f, dy = -8.0f)
                // c 0 4.4 3.6 8 8 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.4f,
                    dx2 = 3.6f,
                    dy2 = 8.0f,
                    dx3 = 8.0f,
                    dy3 = 8.0f,
                )
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // s 2 2 2 5
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 5.0f,
                )
                // m 18 -5
                moveToRelative(dx = 18.0f, dy = -5.0f)
                // s -2 2 -2 5
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 5.0f,
                )
                // M 8 15
                moveTo(x = 8.0f, y = 15.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _theater = it }
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
                imageVector = Theater,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _theater: ImageVector? = null
