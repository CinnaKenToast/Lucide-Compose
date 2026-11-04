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

val LineStyle: ImageVector
    get() {
        val current = _lineStyle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LineStyle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 5 h2 m2 7 h6 m-2 -7 h2 M3 12 h6 m-6 7 h18 M3 5 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 2 7
                moveToRelative(dx = 2.0f, dy = 7.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -2 -7
                moveToRelative(dx = -2.0f, dy = -7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -6 7
                moveToRelative(dx = -6.0f, dy = 7.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _lineStyle = it }
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
                imageVector = LineStyle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lineStyle: ImageVector? = null
