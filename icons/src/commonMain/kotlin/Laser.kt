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

val Laser: ImageVector
    get() {
        val current = _laser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Laser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m13 8 .95 -.95 m0 9.9 L13 16 m9 -4 h-9 m-9 0 H2 m2.05 4.95 L5 16 m0 -8 L4.05 7.05 M9 12z M9 19 v-2 M9 7 V5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 8
                moveTo(x = 13.0f, y = 8.0f)
                // l 0.95 -0.95
                lineToRelative(dx = 0.95f, dy = -0.95f)
                // m 0 9.9
                moveToRelative(dx = 0.0f, dy = 9.9f)
                // L 13 16
                lineTo(x = 13.0f, y = 16.0f)
                // m 9 -4
                moveToRelative(dx = 9.0f, dy = -4.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 2.05 4.95
                moveToRelative(dx = 2.05f, dy = 4.95f)
                // L 5 16
                lineTo(x = 5.0f, y = 16.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // L 4.05 7.05
                lineTo(x = 4.05f, y = 7.05f)
                // M 9 12z
                moveTo(x = 9.0f, y = 12.0f)
                close()
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
            }
        }.build().also { _laser = it }
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
                imageVector = Laser,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _laser: ImageVector? = null
