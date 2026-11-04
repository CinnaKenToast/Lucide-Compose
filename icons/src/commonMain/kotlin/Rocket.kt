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

val Rocket: ImageVector
    get() {
        val current = _rocket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Rocket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 15 v5 s3.03 -.55 4 -2 c1.08 -1.62 0 -5 0 -5 M4.5 16.5 c-1.5 1.26 -2 5 -2 5 s3.74 -.5 5 -2 a2.16 2.16 0 0 0 -.09 -2.91 A2.2 2.2 0 0 0 4.5 16.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // s 3.03 -0.55 4 -2
                reflectiveCurveToRelative(
                    dx1 = 3.03f,
                    dy1 = -0.55f,
                    dx2 = 4.0f,
                    dy2 = -2.0f,
                )
                // c 1.08 -1.62 0 -5 0 -5
                curveToRelative(
                    dx1 = 1.08f,
                    dy1 = -1.62f,
                    dx2 = 0.0f,
                    dy2 = -5.0f,
                    dx3 = 0.0f,
                    dy3 = -5.0f,
                )
                // M 4.5 16.5
                moveTo(x = 4.5f, y = 16.5f)
                // c -1.5 1.26 -2 5 -2 5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.26f,
                    dx2 = -2.0f,
                    dy2 = 5.0f,
                    dx3 = -2.0f,
                    dy3 = 5.0f,
                )
                // s 3.74 -0.5 5 -2
                reflectiveCurveToRelative(
                    dx1 = 3.74f,
                    dy1 = -0.5f,
                    dx2 = 5.0f,
                    dy2 = -2.0f,
                )
                // a 2.16 2.16 0 0 0 -0.09 -2.91
                arcToRelative(
                    a = 2.16f,
                    b = 2.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.09f,
                    dy1 = -2.91f,
                )
                // A 2.2 2.2 0 0 0 4.5 16.5
                arcTo(
                    horizontalEllipseRadius = 2.2f,
                    verticalEllipseRadius = 2.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.5f,
                    y1 = 16.5f,
                )
            }
            // M9 12 a22 22 0 0 1 2 -3.95 A12.9 12.9 0 0 1 22 2 c0 2.72 -.78 7.5 -6 11 a22 22 0 0 1 -4 2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // a 22 22 0 0 1 2 -3.95
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -3.95f,
                )
                // A 12.9 12.9 0 0 1 22 2
                arcTo(
                    horizontalEllipseRadius = 12.9f,
                    verticalEllipseRadius = 12.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 2.0f,
                )
                // c 0 2.72 -0.78 7.5 -6 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.72f,
                    dx2 = -0.78f,
                    dy2 = 7.5f,
                    dx3 = -6.0f,
                    dy3 = 11.0f,
                )
                // a 22 22 0 0 1 -4 2z
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M9 12 H4 s.55 -3.03 2 -4 c1.62 -1.08 5 .05 5 .05
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // s 0.55 -3.03 2 -4
                reflectiveCurveToRelative(
                    dx1 = 0.55f,
                    dy1 = -3.03f,
                    dx2 = 2.0f,
                    dy2 = -4.0f,
                )
                // c 1.62 -1.08 5 0.05 5 0.05
                curveToRelative(
                    dx1 = 1.62f,
                    dy1 = -1.08f,
                    dx2 = 5.0f,
                    dy2 = 0.05f,
                    dx3 = 5.0f,
                    dy3 = 0.05f,
                )
            }
        }.build().also { _rocket = it }
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
                imageVector = Rocket,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rocket: ImageVector? = null
