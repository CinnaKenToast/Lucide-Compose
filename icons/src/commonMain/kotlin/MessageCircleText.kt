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

val MessageCircleText: ImageVector
    get() {
        val current = _messageCircleText
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MessageCircleText",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3.09 17.5 a2 2 0 0 0 -.1 -1.16 10 10 0 1 1 4.78 4.72 2 2 0 0 0 -1.1 -.1 l-3.41 1 a1 1 0 0 1 -1.24 -1.16z M8 12 h9 m-9 4 h5 M8 8 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.09 17.5
                moveTo(x = 3.09f, y = 17.5f)
                // a 2 2 0 0 0 -0.1 -1.16
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = -1.16f,
                )
                // a 10 10 0 1 1 4.78 4.72
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.78f,
                    dy1 = 4.72f,
                )
                // a 2 2 0 0 0 -1.1 -0.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.1f,
                    dy1 = -0.1f,
                )
                // l -3.41 1
                lineToRelative(dx = -3.41f, dy = 1.0f)
                // a 1 1 0 0 1 -1.24 -1.16z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.24f,
                    dy1 = -1.16f,
                )
                close()
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // m -9 4
                moveToRelative(dx = -9.0f, dy = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _messageCircleText = it }
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
                imageVector = MessageCircleText,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _messageCircleText: ImageVector? = null
