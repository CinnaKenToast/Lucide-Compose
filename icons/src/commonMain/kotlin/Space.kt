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

val Space: ImageVector
    get() {
        val current = _space
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Space",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 17 v1 c0 .5 -.5 1 -1 1 H3 c-.5 0 -1 -.5 -1 -1 v-1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.5 -0.5 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.5 0 -1 -0.5 -1 -1
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.5f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
            }
        }.build().also { _space = it }
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
                imageVector = Space,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _space: ImageVector? = null
