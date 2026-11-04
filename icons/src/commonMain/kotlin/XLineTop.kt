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

val XLineTop: ImageVector
    get() {
        val current = _xLineTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.XLineTop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 4 H6 m12 4 L6 20 M6 8 l12 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 12 4
                moveToRelative(dx = 12.0f, dy = 4.0f)
                // L 6 20
                lineTo(x = 6.0f, y = 20.0f)
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // l 12 12
                lineToRelative(dx = 12.0f, dy = 12.0f)
            }
        }.build().also { _xLineTop = it }
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
                imageVector = XLineTop,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _xLineTop: ImageVector? = null
