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

val Pyramid: ImageVector
    get() {
        val current = _pyramid
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Pyramid",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2.5 16.88 a1 1 0 0 1 -.32 -1.43 l9 -13.02 a1 1 0 0 1 1.64 0 l9 13.01 a1 1 0 0 1 -.32 1.44 l-8.51 4.86 a2 2 0 0 1 -1.98 0Z M12 2 v20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.5 16.88
                moveTo(x = 2.5f, y = 16.88f)
                // a 1 1 0 0 1 -0.32 -1.43
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.32f,
                    dy1 = -1.43f,
                )
                // l 9 -13.02
                lineToRelative(dx = 9.0f, dy = -13.02f)
                // a 1 1 0 0 1 1.64 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.64f,
                    dy1 = 0.0f,
                )
                // l 9 13.01
                lineToRelative(dx = 9.0f, dy = 13.01f)
                // a 1 1 0 0 1 -0.32 1.44
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.32f,
                    dy1 = 1.44f,
                )
                // l -8.51 4.86
                lineToRelative(dx = -8.51f, dy = 4.86f)
                // a 2 2 0 0 1 -1.98 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.98f,
                    dy1 = 0.0f,
                )
                close()
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
            }
        }.build().also { _pyramid = it }
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
                imageVector = Pyramid,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pyramid: ImageVector? = null
