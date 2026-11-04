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

val TriangleRight: ImageVector
    get() {
        val current = _triangleRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.TriangleRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 18 a2 2 0 0 1 -2 2 H3 c-1.1 0 -1.3 -.6 -.4 -1.3 L20.4 4.3 C21.3 3.6 22 3.9 22 5Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 18
                moveTo(x = 22.0f, y = 18.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -1.1 0 -1.3 -0.6 -0.4 -1.3
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -1.3f,
                    dy2 = -0.6f,
                    dx3 = -0.4f,
                    dy3 = -1.3f,
                )
                // L 20.4 4.3
                lineTo(x = 20.4f, y = 4.3f)
                // C 21.3 3.6 22 3.9 22 5z
                curveTo(
                    x1 = 21.3f,
                    y1 = 3.6f,
                    x2 = 22.0f,
                    y2 = 3.9f,
                    x3 = 22.0f,
                    y3 = 5.0f,
                )
                close()
            }
        }.build().also { _triangleRight = it }
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
                imageVector = TriangleRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _triangleRight: ImageVector? = null
