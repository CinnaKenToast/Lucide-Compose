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

val MountainSnow: ImageVector
    get() {
        val current = _mountainSnow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MountainSnow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m8 3 4 8 5 -5 5 15 H2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // l 4 8
                lineToRelative(dx = 4.0f, dy = 8.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l 5 15
                lineToRelative(dx = 5.0f, dy = 15.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
            // M4.14 15.08 Q8.07 12.73 12 15.5 q4.12 2.9 8.23 .19
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.14 15.08
                moveTo(x = 4.14f, y = 15.08f)
                // Q 8.07 12.73 12 15.5
                quadTo(
                    x1 = 8.07f,
                    y1 = 12.73f,
                    x2 = 12.0f,
                    y2 = 15.5f,
                )
                // q 4.12 2.9 8.23 0.19
                quadToRelative(
                    dx1 = 4.12f,
                    dy1 = 2.9f,
                    dx2 = 8.23f,
                    dy2 = 0.19f,
                )
            }
        }.build().also { _mountainSnow = it }
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
                imageVector = MountainSnow,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mountainSnow: ImageVector? = null
