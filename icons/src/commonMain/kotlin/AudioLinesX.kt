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

val AudioLinesX: ImageVector
    get() {
        val current = _audioLinesX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.AudioLinesX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 v18 m4 -13 v6.35 M17 17 l5 5 M18 5 v8.1 M2 10 v3 m20 -3 v3 m0 4 -5 5 M6 6 v11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 4 -13
                moveToRelative(dx = 4.0f, dy = -13.0f)
                // v 6.35
                verticalLineToRelative(dy = 6.35f)
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // v 8.1
                verticalLineToRelative(dy = 8.1f)
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 20 -3
                moveToRelative(dx = 20.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
            }
        }.build().also { _audioLinesX = it }
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
                imageVector = AudioLinesX,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _audioLinesX: ImageVector? = null
