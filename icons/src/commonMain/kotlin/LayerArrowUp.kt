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

val LayerArrowUp: ImageVector
    get() {
        val current = _layerArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LayerArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 14 V4 m-4.33 6.77 L2.58 13.1 a1 1 0 0 0 0 1.82 l8.6 3.91 a2 2 0 0 0 1.65 0 l8.58 -3.9 A1 1 0 0 0 22 14 a1 1 0 0 0 -.59 -.92 l-5.08 -2.3 M9 7 l3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m -4.33 6.77
                moveToRelative(dx = -4.33f, dy = 6.77f)
                // L 2.58 13.1
                lineTo(x = 2.58f, y = 13.1f)
                // a 1 1 0 0 0 0 1.82
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.82f,
                )
                // l 8.6 3.91
                lineToRelative(dx = 8.6f, dy = 3.91f)
                // a 2 2 0 0 0 1.65 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.65f,
                    dy1 = 0.0f,
                )
                // l 8.58 -3.9
                lineToRelative(dx = 8.58f, dy = -3.9f)
                // A 1 1 0 0 0 22 14
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                // a 1 1 0 0 0 -0.59 -0.92
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -0.92f,
                )
                // l -5.08 -2.3
                lineToRelative(dx = -5.08f, dy = -2.3f)
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _layerArrowUp = it }
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
                imageVector = LayerArrowUp,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _layerArrowUp: ImageVector? = null
