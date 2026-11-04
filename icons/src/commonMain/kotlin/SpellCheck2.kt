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

val SpellCheck2: ImageVector
    get() {
        val current = _spellCheck2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SpellCheck2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m6 16 6 -12 6 12 M8 12 h8 M4 21 c1.1 0 1.1 -1 2.3 -1 s1.1 1 2.3 1 c1.1 0 1.1 -1 2.3 -1 1.1 0 1.1 1 2.3 1 1.1 0 1.1 -1 2.3 -1 1.1 0 1.1 1 2.3 1 1.1 0 1.1 -1 2.3 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // l 6 -12
                lineToRelative(dx = 6.0f, dy = -12.0f)
                // l 6 12
                lineToRelative(dx = 6.0f, dy = 12.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 4 21
                moveTo(x = 4.0f, y = 21.0f)
                // c 1.1 0 1.1 -1 2.3 -1
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.1f,
                    dy2 = -1.0f,
                    dx3 = 2.3f,
                    dy3 = -1.0f,
                )
                // s 1.1 1 2.3 1
                reflectiveCurveToRelative(
                    dx1 = 1.1f,
                    dy1 = 1.0f,
                    dx2 = 2.3f,
                    dy2 = 1.0f,
                )
                // c 1.1 0 1.1 -1 2.3 -1
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.1f,
                    dy2 = -1.0f,
                    dx3 = 2.3f,
                    dy3 = -1.0f,
                )
                // c 1.1 0 1.1 1 2.3 1
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.1f,
                    dy2 = 1.0f,
                    dx3 = 2.3f,
                    dy3 = 1.0f,
                )
                // c 1.1 0 1.1 -1 2.3 -1
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.1f,
                    dy2 = -1.0f,
                    dx3 = 2.3f,
                    dy3 = -1.0f,
                )
                // c 1.1 0 1.1 1 2.3 1
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.1f,
                    dy2 = 1.0f,
                    dx3 = 2.3f,
                    dy3 = 1.0f,
                )
                // c 1.1 0 1.1 -1 2.3 -1
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.1f,
                    dy2 = -1.0f,
                    dx3 = 2.3f,
                    dy3 = -1.0f,
                )
            }
        }.build().also { _spellCheck2 = it }
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
                imageVector = SpellCheck2,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _spellCheck2: ImageVector? = null
