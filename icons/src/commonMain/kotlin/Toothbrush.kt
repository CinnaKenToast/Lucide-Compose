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

val Toothbrush: ImageVector
    get() {
        val current = _toothbrush
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Toothbrush",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 11 c-2 2 -4 2 -6 4 l-7 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 11
                moveTo(x = 15.0f, y = 11.0f)
                // c -2 2 -4 2 -6 4
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -4.0f,
                    dy2 = 2.0f,
                    dx3 = -6.0f,
                    dy3 = 4.0f,
                )
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
            }
            // m22 4 -7.41 7.41 -2 -2 A2 2 0 0 1 14 6 a2 2 0 0 1 .59 -1.41 A2 2 0 0 1 16 4 a2 2 0 0 1 3.26 -1.55 l2.15 2.14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 4
                moveTo(x = 22.0f, y = 4.0f)
                // l -7.41 7.41
                lineToRelative(dx = -7.41f, dy = 7.41f)
                // l -2 -2
                lineToRelative(dx = -2.0f, dy = -2.0f)
                // A 2 2 0 0 1 14 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 6.0f,
                )
                // a 2 2 0 0 1 0.59 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.41f,
                )
                // A 2 2 0 0 1 16 4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 4.0f,
                )
                // a 2 2 0 0 1 3.26 -1.55
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.26f,
                    dy1 = -1.55f,
                )
                // l 2.15 2.14
                lineToRelative(dx = 2.15f, dy = 2.14f)
            }
        }.build().also { _toothbrush = it }
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
                imageVector = Toothbrush,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _toothbrush: ImageVector? = null
