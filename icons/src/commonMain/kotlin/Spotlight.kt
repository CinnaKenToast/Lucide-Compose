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

val Spotlight: ImageVector
    get() {
        val current = _spotlight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Spotlight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.3 19.56 16 22 m1 -6 3.76 2.1 M19 12.5 l3.03 -.6 M7.6 6.3 a3 3 0 0 0 -3.92 1.3 l-1.38 2.79 a3 3 0 0 0 1.3 3.91 l6.89 3.6 a1 1 0 0 0 1.34 -.45 l3.1 -6.21 A1 1 0 0 0 14.5 9.9z M8 9 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.3 19.56
                moveTo(x = 15.3f, y = 19.56f)
                // L 16 22
                lineTo(x = 16.0f, y = 22.0f)
                // m 1 -6
                moveToRelative(dx = 1.0f, dy = -6.0f)
                // l 3.76 2.1
                lineToRelative(dx = 3.76f, dy = 2.1f)
                // M 19 12.5
                moveTo(x = 19.0f, y = 12.5f)
                // l 3.03 -0.6
                lineToRelative(dx = 3.03f, dy = -0.6f)
                // M 7.6 6.3
                moveTo(x = 7.6f, y = 6.3f)
                // a 3 3 0 0 0 -3.92 1.3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.92f,
                    dy1 = 1.3f,
                )
                // l -1.38 2.79
                lineToRelative(dx = -1.38f, dy = 2.79f)
                // a 3 3 0 0 0 1.3 3.91
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.3f,
                    dy1 = 3.91f,
                )
                // l 6.89 3.6
                lineToRelative(dx = 6.89f, dy = 3.6f)
                // a 1 1 0 0 0 1.34 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.34f,
                    dy1 = -0.45f,
                )
                // l 3.1 -6.21
                lineToRelative(dx = 3.1f, dy = -6.21f)
                // A 1 1 0 0 0 14.5 9.9z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.5f,
                    y1 = 9.9f,
                )
                close()
                // M 8 9
                moveTo(x = 8.0f, y = 9.0f)
                // V 2
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _spotlight = it }
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
                imageVector = Spotlight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _spotlight: ImageVector? = null
