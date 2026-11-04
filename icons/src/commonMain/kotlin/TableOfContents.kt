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

val TableOfContents: ImageVector
    get() {
        val current = _tableOfContents
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.TableOfContents",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 5 H3 m13 7 H3 m13 7 H3 M21 5 h.01 M21 12 h.01 M21 19 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 13 7
                moveToRelative(dx = 13.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 13 7
                moveToRelative(dx = 13.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 21 19
                moveTo(x = 21.0f, y = 19.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _tableOfContents = it }
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
                imageVector = TableOfContents,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tableOfContents: ImageVector? = null
