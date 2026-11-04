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

val MessageCircleDashedCheck: ImageVector
    get() {
        val current = _messageCircleDashedCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MessageCircleDashedCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.1 2.18 a10 10 0 0 1 3.8 0 m0 19.64 a10 10 0 0 1 -3.8 0 m7.5 -18.1 a10 10 0 0 1 2.7 2.7 M2.18 13.9 a10 10 0 0 1 0 -3.8 m18.1 7.51 a10 10 0 0 1 -2.7 2.69 m4.24 -10.2 a10 10 0 0 1 0 3.8 M3.72 6.4 a10 10 0 0 1 2.7 -2.7 M6.16 21.12 l-2.9 .85 a1 1 0 0 1 -1.24 -1.17 L3 17.82 M16 9 l-5.5 5.5 L8 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.1 2.18
                moveTo(x = 10.1f, y = 2.18f)
                // a 10 10 0 0 1 3.8 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.8f,
                    dy1 = 0.0f,
                )
                // m 0 19.64
                moveToRelative(dx = 0.0f, dy = 19.64f)
                // a 10 10 0 0 1 -3.8 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.8f,
                    dy1 = 0.0f,
                )
                // m 7.5 -18.1
                moveToRelative(dx = 7.5f, dy = -18.1f)
                // a 10 10 0 0 1 2.7 2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = 2.7f,
                )
                // M 2.18 13.9
                moveTo(x = 2.18f, y = 13.9f)
                // a 10 10 0 0 1 0 -3.8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.8f,
                )
                // m 18.1 7.51
                moveToRelative(dx = 18.1f, dy = 7.51f)
                // a 10 10 0 0 1 -2.7 2.69
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.7f,
                    dy1 = 2.69f,
                )
                // m 4.24 -10.2
                moveToRelative(dx = 4.24f, dy = -10.2f)
                // a 10 10 0 0 1 0 3.8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.8f,
                )
                // M 3.72 6.4
                moveTo(x = 3.72f, y = 6.4f)
                // a 10 10 0 0 1 2.7 -2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = -2.7f,
                )
                // M 6.16 21.12
                moveTo(x = 6.16f, y = 21.12f)
                // l -2.9 0.85
                lineToRelative(dx = -2.9f, dy = 0.85f)
                // a 1 1 0 0 1 -1.24 -1.17
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.24f,
                    dy1 = -1.17f,
                )
                // L 3 17.82
                lineTo(x = 3.0f, y = 17.82f)
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // l -5.5 5.5
                lineToRelative(dx = -5.5f, dy = 5.5f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
            }
        }.build().also { _messageCircleDashedCheck = it }
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
                imageVector = MessageCircleDashedCheck,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _messageCircleDashedCheck: ImageVector? = null
