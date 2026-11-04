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

val OctagonExclamationPoint: ImageVector
    get() {
        val current = _octagonExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.OctagonExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 16z M12 8 v4 m3.31 -10 a2 2 0 0 1 1.42 .59 l4.68 4.68 A2 2 0 0 1 22 8.7 v6.62 a2 2 0 0 1 -.59 1.42 l-4.68 4.68 A2 2 0 0 1 15.3 22 H8.7 a2 2 0 0 1 -1.42 -.59 L2.6 16.73 A2 2 0 0 1 2 15.3 V8.7 a2 2 0 0 1 .59 -1.42 L7.27 2.6 A2 2 0 0 1 8.7 2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16z
                moveTo(x = 12.0f, y = 16.0f)
                close()
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 3.31 -10
                moveToRelative(dx = 3.31f, dy = -10.0f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // l 4.68 4.68
                lineToRelative(dx = 4.68f, dy = 4.68f)
                // A 2 2 0 0 1 22 8.7
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 8.7f,
                )
                // v 6.62
                verticalLineToRelative(dy = 6.62f)
                // a 2 2 0 0 1 -0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 1.42f,
                )
                // l -4.68 4.68
                lineToRelative(dx = -4.68f, dy = 4.68f)
                // A 2 2 0 0 1 15.3 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.3f,
                    y1 = 22.0f,
                )
                // H 8.7
                horizontalLineTo(x = 8.7f)
                // a 2 2 0 0 1 -1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = -0.59f,
                )
                // L 2.6 16.73
                lineTo(x = 2.6f, y = 16.73f)
                // A 2 2 0 0 1 2 15.3
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 15.3f,
                )
                // V 8.7
                verticalLineTo(y = 8.7f)
                // a 2 2 0 0 1 0.59 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.42f,
                )
                // L 7.27 2.6
                lineTo(x = 7.27f, y = 2.6f)
                // A 2 2 0 0 1 8.7 2z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.7f,
                    y1 = 2.0f,
                )
                close()
            }
        }.build().also { _octagonExclamationPoint = it }
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
                imageVector = OctagonExclamationPoint,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _octagonExclamationPoint: ImageVector? = null
