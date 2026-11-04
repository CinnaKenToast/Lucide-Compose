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

val BrainOff: ImageVector
    get() {
        val current = _brainOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BrainOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 v-6 m0 -7 v1.34 m5.7 -.05 A3 3 0 1 0 12 5 a3 3 0 0 0 -4.12 -2.78
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // v 1.34
                verticalLineToRelative(dy = 1.34f)
                // m 5.7 -0.05
                moveToRelative(dx = 5.7f, dy = -0.05f)
                // A 3 3 0 1 0 12 5
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 5.0f,
                )
                // a 3 3 0 0 0 -4.12 -2.78
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.12f,
                    dy1 = -2.78f,
                )
            }
            // M18 5.13 a4 4 0 0 1 2.52 5.77 m-.88 8.74 A4 4 0 0 1 12 18 a4 4 0 1 1 -7.97 -.52 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5.13
                moveTo(x = 18.0f, y = 5.13f)
                // a 4 4 0 0 1 2.52 5.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.52f,
                    dy1 = 5.77f,
                )
                // m -0.88 8.74
                moveToRelative(dx = -0.88f, dy = 8.74f)
                // A 4 4 0 0 1 12 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                // a 4 4 0 1 1 -7.97 -0.52
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.97f,
                    dy1 = -0.52f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M20 10.54 a4 4 0 0 1 1.53 5.34 M3.48 10.89 a4 4 0 0 1 1.87 -5.54
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 10.54
                moveTo(x = 20.0f, y = 10.54f)
                // a 4 4 0 0 1 1.53 5.34
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.53f,
                    dy1 = 5.34f,
                )
                // M 3.48 10.89
                moveTo(x = 3.48f, y = 10.89f)
                // a 4 4 0 0 1 1.87 -5.54
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.87f,
                    dy1 = -5.54f,
                )
            }
            // M6 18 a4 4 0 0 1 -2 -7.46 M9 13 a4 4 0 0 0 2.17 -1.5 l.13 -.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // a 4 4 0 0 1 -2 -7.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -7.46f,
                )
                // M 9 13
                moveTo(x = 9.0f, y = 13.0f)
                // a 4 4 0 0 0 2.17 -1.5
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.17f,
                    dy1 = -1.5f,
                )
                // l 0.13 -0.2
                lineToRelative(dx = 0.13f, dy = -0.2f)
            }
        }.build().also { _brainOff = it }
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
                imageVector = BrainOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brainOff: ImageVector? = null
