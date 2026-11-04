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

val PencilRuler: ImageVector
    get() {
        val current = _pencilRuler
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PencilRuler",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 7 8.7 2.7 a2.4 2.4 0 0 0 -3.4 0 L2.7 5.3 a2.4 2.4 0 0 0 0 3.4 L7 13 m1 -7 2 -2 m8 12 2 -2 m-3 -3 4.3 4.3 a2.4 2.4 0 0 1 0 3.4 l-2.6 2.6 a2.4 2.4 0 0 1 -3.4 0 L11 17 M21.17 6.81 a1 1 0 0 0 -3.98 -3.98 L3.84 16.17 A2 2 0 0 0 3.34 17 l-1.32 4.36 a.5 .5 0 0 0 .62 .62 L7 20.66 a2 2 0 0 0 .83 -.5z M15 5 l4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 7
                moveTo(x = 13.0f, y = 7.0f)
                // L 8.7 2.7
                lineTo(x = 8.7f, y = 2.7f)
                // a 2.4 2.4 0 0 0 -3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.4f,
                    dy1 = 0.0f,
                )
                // L 2.7 5.3
                lineTo(x = 2.7f, y = 5.3f)
                // a 2.4 2.4 0 0 0 0 3.4
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.4f,
                )
                // L 7 13
                lineTo(x = 7.0f, y = 13.0f)
                // m 1 -7
                moveToRelative(dx = 1.0f, dy = -7.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // m 8 12
                moveToRelative(dx = 8.0f, dy = 12.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // l 4.3 4.3
                lineToRelative(dx = 4.3f, dy = 4.3f)
                // a 2.4 2.4 0 0 1 0 3.4
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.4f,
                )
                // l -2.6 2.6
                lineToRelative(dx = -2.6f, dy = 2.6f)
                // a 2.4 2.4 0 0 1 -3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.4f,
                    dy1 = 0.0f,
                )
                // L 11 17
                lineTo(x = 11.0f, y = 17.0f)
                // M 21.17 6.81
                moveTo(x = 21.17f, y = 6.81f)
                // a 1 1 0 0 0 -3.98 -3.98
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.98f,
                    dy1 = -3.98f,
                )
                // L 3.84 16.17
                lineTo(x = 3.84f, y = 16.17f)
                // A 2 2 0 0 0 3.34 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.34f,
                    y1 = 17.0f,
                )
                // l -1.32 4.36
                lineToRelative(dx = -1.32f, dy = 4.36f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // L 7 20.66
                lineTo(x = 7.0f, y = 20.66f)
                // a 2 2 0 0 0 0.83 -0.5z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.5f,
                )
                close()
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _pencilRuler = it }
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
                imageVector = PencilRuler,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pencilRuler: ImageVector? = null
