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

val AudioLinesOff: ImageVector
    get() {
        val current = _audioLinesOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.AudioLinesOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 v11 m0 -18 v1.35 M14 14 v1 m0 -7 v.35 M18 5 v7.35 M2 10 v3 M2 2 l20 20 m0 -12 v3 M6 6 v11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 0 -18
                moveToRelative(dx = 0.0f, dy = -18.0f)
                // v 1.35
                verticalLineToRelative(dy = 1.35f)
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // v 0.35
                verticalLineToRelative(dy = 0.35f)
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // v 7.35
                verticalLineToRelative(dy = 7.35f)
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
            }
        }.build().also { _audioLinesOff = it }
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
                imageVector = AudioLinesOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _audioLinesOff: ImageVector? = null
