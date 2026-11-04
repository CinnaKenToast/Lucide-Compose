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

val Ham: ImageVector
    get() {
        val current = _ham
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Ham",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.14 21.14 A7.27 10.45 45 1 0 2.86 10.86
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.14 21.14
                moveTo(x = 13.14f, y = 21.14f)
                // A 7.27 10.45 45 1 0 2.86 10.86
                arcTo(
                    horizontalEllipseRadius = 7.27f,
                    verticalEllipseRadius = 10.45f,
                    theta = 45.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 2.86f,
                    y1 = 10.86f,
                )
            }
            // M13.14 21.14 A7.27 4.37 45 0 0 2.86 10.86 a7.27 4.37 45 0 0 10.28 10.28 m3.43 -10.7 L18.6 8.4 a2.5 2.5 0 1 0 1.65 -4.65 2.5 2.5 0 1 0 -4.66 1.66 l-2.02 2.03 M8.5 16.5 l-1 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.14 21.14
                moveTo(x = 13.14f, y = 21.14f)
                // A 7.27 4.37 45 0 0 2.86 10.86
                arcTo(
                    horizontalEllipseRadius = 7.27f,
                    verticalEllipseRadius = 4.37f,
                    theta = 45.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.86f,
                    y1 = 10.86f,
                )
                // a 7.27 4.37 45 0 0 10.28 10.28
                arcToRelative(
                    a = 7.27f,
                    b = 4.37f,
                    theta = 45.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.28f,
                    dy1 = 10.28f,
                )
                // m 3.43 -10.7
                moveToRelative(dx = 3.43f, dy = -10.7f)
                // L 18.6 8.4
                lineTo(x = 18.6f, y = 8.4f)
                // a 2.5 2.5 0 1 0 1.65 -4.65
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.65f,
                    dy1 = -4.65f,
                )
                // a 2.5 2.5 0 1 0 -4.66 1.66
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.66f,
                    dy1 = 1.66f,
                )
                // l -2.02 2.03
                lineToRelative(dx = -2.02f, dy = 2.03f)
                // M 8.5 16.5
                moveTo(x = 8.5f, y = 16.5f)
                // l -1 -1
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _ham = it }
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
                imageVector = Ham,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _ham: ImageVector? = null
