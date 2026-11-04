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

val LayersMinus: ImageVector
    get() {
        val current = _layersMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LayersMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.83 2.18 a2 2 0 0 0 -1.66 0 L2.6 6.08 a1 1 0 0 0 0 1.83 l8.58 3.91 A2 2 0 0 0 12.01 12 a2 2 0 0 0 .83 -.18 l8.58 -3.9 a1 1 0 0 0 0 -1.83z M16 17 h6 M2 12 a1 1 0 0 0 .6 .91 l8.58 3.91 A2 2 0 0 0 12.01 17 m-10 0 A1 1 0 0 0 2.6 17.9 l8.58 3.91 A2 2 0 0 0 12.01 22 a2 2 0 0 0 .83 -.18 l2.11 -.96 M22.02 12 a1 1 0 0 1 -.6 .92 L21.24 13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.83 2.18
                moveTo(x = 12.83f, y = 2.18f)
                // a 2 2 0 0 0 -1.66 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.66f,
                    dy1 = 0.0f,
                )
                // L 2.6 6.08
                lineTo(x = 2.6f, y = 6.08f)
                // a 1 1 0 0 0 0 1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.83f,
                )
                // l 8.58 3.91
                lineToRelative(dx = 8.58f, dy = 3.91f)
                // A 2 2 0 0 0 12.01 12
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.01f,
                    y1 = 12.0f,
                )
                // a 2 2 0 0 0 0.83 -0.18
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.18f,
                )
                // l 8.58 -3.9
                lineToRelative(dx = 8.58f, dy = -3.9f)
                // a 1 1 0 0 0 0 -1.83z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.83f,
                )
                close()
                // M 16 17
                moveTo(x = 16.0f, y = 17.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // a 1 1 0 0 0 0.6 0.91
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.6f,
                    dy1 = 0.91f,
                )
                // l 8.58 3.91
                lineToRelative(dx = 8.58f, dy = 3.91f)
                // A 2 2 0 0 0 12.01 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.01f,
                    y1 = 17.0f,
                )
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // A 1 1 0 0 0 2.6 17.9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.6f,
                    y1 = 17.9f,
                )
                // l 8.58 3.91
                lineToRelative(dx = 8.58f, dy = 3.91f)
                // A 2 2 0 0 0 12.01 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.01f,
                    y1 = 22.0f,
                )
                // a 2 2 0 0 0 0.83 -0.18
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.18f,
                )
                // l 2.11 -0.96
                lineToRelative(dx = 2.11f, dy = -0.96f)
                // M 22.02 12
                moveTo(x = 22.02f, y = 12.0f)
                // a 1 1 0 0 1 -0.6 0.92
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.6f,
                    dy1 = 0.92f,
                )
                // L 21.24 13
                lineTo(x = 21.24f, y = 13.0f)
            }
        }.build().also { _layersMinus = it }
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
                imageVector = LayersMinus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _layersMinus: ImageVector? = null
