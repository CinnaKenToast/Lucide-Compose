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

val SlidersVertical: ImageVector
    get() {
        val current = _slidersVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SlidersVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 8 h4 m-2 13 v-9 m0 -4 V3 m5 13 h4 m-2 -4 V3 m0 18 v-5 M3 14 h4 m-2 -4 V3 m0 18 v-7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 8
                moveTo(x = 10.0f, y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 13
                moveToRelative(dx = -2.0f, dy = 13.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 5 13
                moveToRelative(dx = 5.0f, dy = 13.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -4
                moveToRelative(dx = -2.0f, dy = -4.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 0 18
                moveToRelative(dx = 0.0f, dy = 18.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // M 3 14
                moveTo(x = 3.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -4
                moveToRelative(dx = -2.0f, dy = -4.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 0 18
                moveToRelative(dx = 0.0f, dy = 18.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
            }
        }.build().also { _slidersVertical = it }
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
                imageVector = SlidersVertical,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _slidersVertical: ImageVector? = null
