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

val Paintbrush: ImageVector
    get() {
        val current = _paintbrush
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Paintbrush",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.62 17.9 3.94 14.98 M18.38 2.62 a1 1 0 1 1 3 3 l-4.02 4.02 a.5 .5 0 0 0 0 .71 l.94 .94 a2.4 2.4 0 0 1 0 3.41 l-.94 .95 a.5 .5 0 0 1 -.7 0 l-8.3 -8.3 a.5 .5 0 0 1 0 -.7 L9.3 5.7 a2.4 2.4 0 0 1 3.4 0 l.95 .94 a.5 .5 0 0 0 .7 0z M9 8 c-1.8 2.71 -3.97 3.46 -6.58 3.95 a.5 .5 0 0 0 -.3 .82 l7.32 8.88 a1 1 0 0 0 1.18 .2 C12.74 20.4 16 16.8 16 15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.62 17.9
                moveTo(x = 14.62f, y = 17.9f)
                // L 3.94 14.98
                lineTo(x = 3.94f, y = 14.98f)
                // M 18.38 2.62
                moveTo(x = 18.38f, y = 2.62f)
                // a 1 1 0 1 1 3 3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // l -4.02 4.02
                lineToRelative(dx = -4.02f, dy = 4.02f)
                // a 0.5 0.5 0 0 0 0 0.71
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 0.71f,
                )
                // l 0.94 0.94
                lineToRelative(dx = 0.94f, dy = 0.94f)
                // a 2.4 2.4 0 0 1 0 3.41
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.41f,
                )
                // l -0.94 0.95
                lineToRelative(dx = -0.94f, dy = 0.95f)
                // a 0.5 0.5 0 0 1 -0.7 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 0.0f,
                )
                // l -8.3 -8.3
                lineToRelative(dx = -8.3f, dy = -8.3f)
                // a 0.5 0.5 0 0 1 0 -0.7
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                )
                // L 9.3 5.7
                lineTo(x = 9.3f, y = 5.7f)
                // a 2.4 2.4 0 0 1 3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.4f,
                    dy1 = 0.0f,
                )
                // l 0.95 0.94
                lineToRelative(dx = 0.95f, dy = 0.94f)
                // a 0.5 0.5 0 0 0 0.7 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = 0.0f,
                )
                close()
                // M 9 8
                moveTo(x = 9.0f, y = 8.0f)
                // c -1.8 2.71 -3.97 3.46 -6.58 3.95
                curveToRelative(
                    dx1 = -1.8f,
                    dy1 = 2.71f,
                    dx2 = -3.97f,
                    dy2 = 3.46f,
                    dx3 = -6.58f,
                    dy3 = 3.95f,
                )
                // a 0.5 0.5 0 0 0 -0.3 0.82
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = 0.82f,
                )
                // l 7.32 8.88
                lineToRelative(dx = 7.32f, dy = 8.88f)
                // a 1 1 0 0 0 1.18 0.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.18f,
                    dy1 = 0.2f,
                )
                // C 12.74 20.4 16 16.8 16 15
                curveTo(
                    x1 = 12.74f,
                    y1 = 20.4f,
                    x2 = 16.0f,
                    y2 = 16.8f,
                    x3 = 16.0f,
                    y3 = 15.0f,
                )
            }
        }.build().also { _paintbrush = it }
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
                imageVector = Paintbrush,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _paintbrush: ImageVector? = null
