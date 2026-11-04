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

val Minimize2: ImageVector
    get() {
        val current = _minimize2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Minimize2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 10 7 -7 m-1 7 h-6 V4 M3 21 l7 -7 m-6 0 h6 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 10
                moveTo(x = 14.0f, y = 10.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // m -1 7
                moveToRelative(dx = -1.0f, dy = 7.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _minimize2 = it }
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
                imageVector = Minimize2,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _minimize2: ImageVector? = null
