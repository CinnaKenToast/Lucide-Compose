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

val Ruler: ImageVector
    get() {
        val current = _ruler
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Ruler",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.3 15.3 a2.4 2.4 0 0 1 0 3.4 l-2.6 2.6 a2.4 2.4 0 0 1 -3.4 0 L2.7 8.7 a2.4 2.4 0 0 1 0 -3.4 l2.6 -2.6 a2.4 2.4 0 0 1 3.4 0Z m-6.8 -2.8 2 -2 m-5 -1 2 -2 m-5 -1 2 -2 m7 11 2 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.3 15.3
                moveTo(x = 21.3f, y = 15.3f)
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
                // L 2.7 8.7
                lineTo(x = 2.7f, y = 8.7f)
                // a 2.4 2.4 0 0 1 0 -3.4
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.4f,
                )
                // l 2.6 -2.6
                lineToRelative(dx = 2.6f, dy = -2.6f)
                // a 2.4 2.4 0 0 1 3.4 0z
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.4f,
                    dy1 = 0.0f,
                )
                close()
                // m -6.8 -2.8
                moveToRelative(dx = -6.8f, dy = -2.8f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // m -5 -1
                moveToRelative(dx = -5.0f, dy = -1.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // m -5 -1
                moveToRelative(dx = -5.0f, dy = -1.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // m 7 11
                moveToRelative(dx = 7.0f, dy = 11.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
            }
        }.build().also { _ruler = it }
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
                imageVector = Ruler,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _ruler: ImageVector? = null
