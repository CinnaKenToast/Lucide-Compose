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

val MapPinOff: ImageVector
    get() {
        val current = _mapPinOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MapPinOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.75 7.09 a3 3 0 0 1 2.16 2.16 m2.16 7.82 a32 32 0 0 1 -4.47 4.73 1 1 0 0 1 -1.2 0 C9.54 20.2 4 15 4 10 a8 8 0 0 1 1.43 -4.57 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.75 7.09
                moveTo(x = 12.75f, y = 7.09f)
                // a 3 3 0 0 1 2.16 2.16
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.16f,
                    dy1 = 2.16f,
                )
                // m 2.16 7.82
                moveToRelative(dx = 2.16f, dy = 7.82f)
                // a 32 32 0 0 1 -4.47 4.73
                arcToRelative(
                    a = 32.0f,
                    b = 32.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.47f,
                    dy1 = 4.73f,
                )
                // a 1 1 0 0 1 -1.2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.2f,
                    dy1 = 0.0f,
                )
                // C 9.54 20.2 4 15 4 10
                curveTo(
                    x1 = 9.54f,
                    y1 = 20.2f,
                    x2 = 4.0f,
                    y2 = 15.0f,
                    x3 = 4.0f,
                    y3 = 10.0f,
                )
                // a 8 8 0 0 1 1.43 -4.57
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.43f,
                    dy1 = -4.57f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M8.48 2.82 A8 8 0 0 1 20 10 a9 9 0 0 1 -.81 3.53 M9.13 9.13 a3 3 0 0 0 3.74 3.74
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.48 2.82
                moveTo(x = 8.48f, y = 2.82f)
                // A 8 8 0 0 1 20 10
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 10.0f,
                )
                // a 9 9 0 0 1 -0.81 3.53
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.81f,
                    dy1 = 3.53f,
                )
                // M 9.13 9.13
                moveTo(x = 9.13f, y = 9.13f)
                // a 3 3 0 0 0 3.74 3.74
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.74f,
                    dy1 = 3.74f,
                )
            }
        }.build().also { _mapPinOff = it }
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
                imageVector = MapPinOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mapPinOff: ImageVector? = null
