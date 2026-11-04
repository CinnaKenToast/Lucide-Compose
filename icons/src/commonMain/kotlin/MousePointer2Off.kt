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

val MousePointer2Off: ImageVector
    get() {
        val current = _mousePointer2Off
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MousePointer2Off",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15.55 8.45 5.14 2.09 a.5 .5 0 0 1 -.06 .94 l-6.13 1.58 a2 2 0 0 0 -1.44 1.44 l-1.58 6.12 a.5 .5 0 0 1 -.94 .07 l-2.09 -5.14 M22 2 2 22 m4.82 -10.47 L4.04 4.69 a.5 .5 0 0 1 .65 -.65 l6.84 2.78
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.55 8.45
                moveTo(x = 15.55f, y = 8.45f)
                // l 5.14 2.09
                lineToRelative(dx = 5.14f, dy = 2.09f)
                // a 0.5 0.5 0 0 1 -0.06 0.94
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.06f,
                    dy1 = 0.94f,
                )
                // l -6.13 1.58
                lineToRelative(dx = -6.13f, dy = 1.58f)
                // a 2 2 0 0 0 -1.44 1.44
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.44f,
                    dy1 = 1.44f,
                )
                // l -1.58 6.12
                lineToRelative(dx = -1.58f, dy = 6.12f)
                // a 0.5 0.5 0 0 1 -0.94 0.07
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.94f,
                    dy1 = 0.07f,
                )
                // l -2.09 -5.14
                lineToRelative(dx = -2.09f, dy = -5.14f)
                // M 22 2
                moveTo(x = 22.0f, y = 2.0f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // m 4.82 -10.47
                moveToRelative(dx = 4.82f, dy = -10.47f)
                // L 4.04 4.69
                lineTo(x = 4.04f, y = 4.69f)
                // a 0.5 0.5 0 0 1 0.65 -0.65
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = -0.65f,
                )
                // l 6.84 2.78
                lineToRelative(dx = 6.84f, dy = 2.78f)
            }
        }.build().also { _mousePointer2Off = it }
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
                imageVector = MousePointer2Off,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mousePointer2Off: ImageVector? = null
