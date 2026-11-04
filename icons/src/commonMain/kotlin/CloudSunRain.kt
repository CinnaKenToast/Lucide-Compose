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

val CloudSunRain: ImageVector
    get() {
        val current = _cloudSunRain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CloudSunRain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v2 M4.93 4.93 l1.41 1.41 M20 12 h2 m-2.93 -7.07 -1.41 1.41 m-1.71 6.31 a4 4 0 0 0 -5.93 -4.13 M3 20 a5 5 0 1 1 8.9 -4 H13 a3 3 0 0 1 2 5.24 M11 20 v2 m-4 -3 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // M 20 12
                moveTo(x = 20.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2.93 -7.07
                moveToRelative(dx = -2.93f, dy = -7.07f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // m -1.71 6.31
                moveToRelative(dx = -1.71f, dy = 6.31f)
                // a 4 4 0 0 0 -5.93 -4.13
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.93f,
                    dy1 = -4.13f,
                )
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // a 5 5 0 1 1 8.9 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.9f,
                    dy1 = -4.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // a 3 3 0 0 1 2 5.24
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 5.24f,
                )
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -4 -3
                moveToRelative(dx = -4.0f, dy = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _cloudSunRain = it }
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
                imageVector = CloudSunRain,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cloudSunRain: ImageVector? = null
