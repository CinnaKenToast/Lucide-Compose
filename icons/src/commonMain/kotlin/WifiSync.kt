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

val WifiSync: ImageVector
    get() {
        val current = _wifiSync
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.WifiSync",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.97 10.1 v4 l1.53 -1.6 a5 5 0 0 1 8 1.5 m-9.53 .1 h4 m2 4 h4 l-1.54 1.61 a5 5 0 0 1 -8 -1.5 M2 8.82 a15 15 0 0 1 20 0 m-.04 13.29 v-4 M5 12.86 a10 10 0 0 1 3 -2.03 m.5 5.6z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.97 10.1
                moveTo(x = 11.97f, y = 10.1f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // l 1.53 -1.6
                lineToRelative(dx = 1.53f, dy = -1.6f)
                // a 5 5 0 0 1 8 1.5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 1.5f,
                )
                // m -9.53 0.1
                moveToRelative(dx = -9.53f, dy = 0.1f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 2 4
                moveToRelative(dx = 2.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l -1.54 1.61
                lineToRelative(dx = -1.54f, dy = 1.61f)
                // a 5 5 0 0 1 -8 -1.5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = -1.5f,
                )
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
                // m -0.04 13.29
                moveToRelative(dx = -0.04f, dy = 13.29f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // M 5 12.86
                moveTo(x = 5.0f, y = 12.86f)
                // a 10 10 0 0 1 3 -2.03
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -2.03f,
                )
                // m 0.5 5.6z
                moveToRelative(dx = 0.5f, dy = 5.6f)
                close()
            }
        }.build().also { _wifiSync = it }
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
                imageVector = WifiSync,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wifiSync: ImageVector? = null
