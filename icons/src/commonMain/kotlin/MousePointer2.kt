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

val MousePointer2: ImageVector
    get() {
        val current = _mousePointer2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MousePointer2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4.04 4.69 a.5 .5 0 0 1 .65 -.65 l16 6.5 a.5 .5 0 0 1 -.07 .94 l-6.12 1.58 a2 2 0 0 0 -1.44 1.44 l-1.58 6.12 a.5 .5 0 0 1 -.94 .07z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.04 4.69
                moveTo(x = 4.04f, y = 4.69f)
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
                // l 16 6.5
                lineToRelative(dx = 16.0f, dy = 6.5f)
                // a 0.5 0.5 0 0 1 -0.07 0.94
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.07f,
                    dy1 = 0.94f,
                )
                // l -6.12 1.58
                lineToRelative(dx = -6.12f, dy = 1.58f)
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
                // a 0.5 0.5 0 0 1 -0.94 0.07z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.94f,
                    dy1 = 0.07f,
                )
                close()
            }
        }.build().also { _mousePointer2 = it }
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
                imageVector = MousePointer2,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mousePointer2: ImageVector? = null
