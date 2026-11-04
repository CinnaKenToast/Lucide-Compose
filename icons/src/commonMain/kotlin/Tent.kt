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

val Tent: ImageVector
    get() {
        val current = _tent
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Tent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3.5 21 14 3 m6.5 18 L10 3 m5.5 18 L12 15 l-3.5 6 M2 21 h20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.5 21
                moveTo(x = 3.5f, y = 21.0f)
                // L 14 3
                lineTo(x = 14.0f, y = 3.0f)
                // m 6.5 18
                moveToRelative(dx = 6.5f, dy = 18.0f)
                // L 10 3
                lineTo(x = 10.0f, y = 3.0f)
                // m 5.5 18
                moveToRelative(dx = 5.5f, dy = 18.0f)
                // L 12 15
                lineTo(x = 12.0f, y = 15.0f)
                // l -3.5 6
                lineToRelative(dx = -3.5f, dy = 6.0f)
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
            }
        }.build().also { _tent = it }
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
                imageVector = Tent,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tent: ImageVector? = null
