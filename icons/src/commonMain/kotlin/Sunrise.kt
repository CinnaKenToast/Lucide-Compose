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

val Sunrise: ImageVector
    get() {
        val current = _sunrise
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Sunrise",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v8 m-7.07 .93 1.41 1.41 M2 18 h2 m16 0 h2 m-2.93 -7.07 -1.41 1.41 M22 22 H2 M8 6 l4 -4 4 4 m0 12 a4 4 0 0 0 -8 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m -7.07 0.93
                moveToRelative(dx = -7.07f, dy = 0.93f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2.93 -7.07
                moveToRelative(dx = -2.93f, dy = -7.07f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m 0 12
                moveToRelative(dx = 0.0f, dy = 12.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _sunrise = it }
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
                imageVector = Sunrise,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sunrise: ImageVector? = null
