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

val CanSoda: ImageVector
    get() {
        val current = _canSoda
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CanSoda",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 22 1.66 -2.5 A2 2 0 0 0 19 18.4 V5.6 a2 2 0 0 0 -.34 -1.1 L17 2 m1 20 H6 M18 2 H6 M5 17 h14 M5 7 h14 M7 22 l-1.66 -2.5 A2 2 0 0 1 5 18.4 V5.6 a2 2 0 0 1 .34 -1.1 L7 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 22
                moveTo(x = 17.0f, y = 22.0f)
                // l 1.66 -2.5
                lineToRelative(dx = 1.66f, dy = -2.5f)
                // A 2 2 0 0 0 19 18.4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 18.4f,
                )
                // V 5.6
                verticalLineTo(y = 5.6f)
                // a 2 2 0 0 0 -0.34 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.34f,
                    dy1 = -1.1f,
                )
                // L 17 2
                lineTo(x = 17.0f, y = 2.0f)
                // m 1 20
                moveToRelative(dx = 1.0f, dy = 20.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // M 18 2
                moveTo(x = 18.0f, y = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // M 5 17
                moveTo(x = 5.0f, y = 17.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 5 7
                moveTo(x = 5.0f, y = 7.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // l -1.66 -2.5
                lineToRelative(dx = -1.66f, dy = -2.5f)
                // A 2 2 0 0 1 5 18.4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 18.4f,
                )
                // V 5.6
                verticalLineTo(y = 5.6f)
                // a 2 2 0 0 1 0.34 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.34f,
                    dy1 = -1.1f,
                )
                // L 7 2
                lineTo(x = 7.0f, y = 2.0f)
            }
        }.build().also { _canSoda = it }
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
                imageVector = CanSoda,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _canSoda: ImageVector? = null
