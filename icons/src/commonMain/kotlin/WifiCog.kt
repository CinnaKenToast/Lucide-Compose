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

val WifiCog: ImageVector
    get() {
        val current = _wifiCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.WifiCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14.3 19.53 .93 -.38 m0 -2.3 -.93 -.38 m2.55 -1.24 -.38 -.93 m.38 6.47 -.38 .93 m2.68 -6.47 .38 -.93 m0 7.4 -.38 -.93 M2 8.82 a15 15 0 0 1 20 0 m-1.23 8.03 .93 -.38 m-.93 2.68 .93 .38 M5 12.86 a10 10 0 0 1 10.18 -2.34 m-6.68 5.9 a5 5 0 0 1 2 -1.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.3 19.53
                moveTo(x = 14.3f, y = 19.53f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m 0 -2.3
                moveToRelative(dx = 0.0f, dy = -2.3f)
                // l -0.93 -0.38
                lineToRelative(dx = -0.93f, dy = -0.38f)
                // m 2.55 -1.24
                moveToRelative(dx = 2.55f, dy = -1.24f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // m 0.38 6.47
                moveToRelative(dx = 0.38f, dy = 6.47f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // m 2.68 -6.47
                moveToRelative(dx = 2.68f, dy = -6.47f)
                // l 0.38 -0.93
                lineToRelative(dx = 0.38f, dy = -0.93f)
                // m 0 7.4
                moveToRelative(dx = 0.0f, dy = 7.4f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // M 2 8.82
                moveTo(x = 2.0f, y = 8.82f)
                // a 15 15 0 0 1 20 0
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // m -1.23 8.03
                moveToRelative(dx = -1.23f, dy = 8.03f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m -0.93 2.68
                moveToRelative(dx = -0.93f, dy = 2.68f)
                // l 0.93 0.38
                lineToRelative(dx = 0.93f, dy = 0.38f)
                // M 5 12.86
                moveTo(x = 5.0f, y = 12.86f)
                // a 10 10 0 0 1 10.18 -2.34
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.18f,
                    dy1 = -2.34f,
                )
                // m -6.68 5.9
                moveToRelative(dx = -6.68f, dy = 5.9f)
                // a 5 5 0 0 1 2 -1.2
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -1.2f,
                )
            }
            // <circle cx="18.0" cy="18.0" radius="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _wifiCog = it }
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
                imageVector = WifiCog,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wifiCog: ImageVector? = null
