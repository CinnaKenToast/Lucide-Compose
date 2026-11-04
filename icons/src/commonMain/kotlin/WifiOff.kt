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

val WifiOff: ImageVector
    get() {
        val current = _wifiOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.WifiOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20z M8.5 16.43 a5 5 0 0 1 7 0 M5 12.86 a10 10 0 0 1 5.17 -2.7 m8.83 2.7 a10 10 0 0 0 -2 -1.52 M2 8.82 a15 15 0 0 1 4.18 -2.64 M22 8.82 a15 15 0 0 0 -11.29 -3.76 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20z
                moveTo(x = 12.0f, y = 20.0f)
                close()
                // M 8.5 16.43
                moveTo(x = 8.5f, y = 16.43f)
                // a 5 5 0 0 1 7 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // M 5 12.86
                moveTo(x = 5.0f, y = 12.86f)
                // a 10 10 0 0 1 5.17 -2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.17f,
                    dy1 = -2.7f,
                )
                // m 8.83 2.7
                moveToRelative(dx = 8.83f, dy = 2.7f)
                // a 10 10 0 0 0 -2 -1.52
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -1.52f,
                )
                // M 2 8.82
                moveTo(x = 2.0f, y = 8.82f)
                // a 15 15 0 0 1 4.18 -2.64
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.18f,
                    dy1 = -2.64f,
                )
                // M 22 8.82
                moveTo(x = 22.0f, y = 8.82f)
                // a 15 15 0 0 0 -11.29 -3.76
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -11.29f,
                    dy1 = -3.76f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _wifiOff = it }
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
                imageVector = WifiOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wifiOff: ImageVector? = null
