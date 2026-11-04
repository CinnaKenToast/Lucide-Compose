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

val Tornado: ImageVector
    get() {
        val current = _tornado
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Tornado",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 4 H3 m15 4 H6 m13 4 H9 m7 4 h-6 m1 4 H9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 15 4
                moveToRelative(dx = 15.0f, dy = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 13 4
                moveToRelative(dx = 13.0f, dy = 4.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 7 4
                moveToRelative(dx = 7.0f, dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // m 1 4
                moveToRelative(dx = 1.0f, dy = 4.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
            }
        }.build().also { _tornado = it }
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
                imageVector = Tornado,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tornado: ImageVector? = null
