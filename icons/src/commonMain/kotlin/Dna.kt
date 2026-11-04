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

val Dna: ImageVector
    get() {
        val current = _dna
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Dna",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 16 1.5 1.5 M14 8 l-1.5 -1.5 M15 2 c-1.8 2 -2.52 4 -2.8 6 m4.3 2.5 1 1 M17 6 l-2.9 -2.9 M2 15 c6.67 -6 13.33 0 20 -6 m-2 0 .9 .9 M3.1 14.1 4 15 m2.5 -2.5 1 1 M7 18 l2.9 2.9 M9 22 c1.8 -2 2.52 -4 2.8 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // l 1.5 1.5
                lineToRelative(dx = 1.5f, dy = 1.5f)
                // M 14 8
                moveTo(x = 14.0f, y = 8.0f)
                // l -1.5 -1.5
                lineToRelative(dx = -1.5f, dy = -1.5f)
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // c -1.8 2 -2.52 4 -2.8 6
                curveToRelative(
                    dx1 = -1.8f,
                    dy1 = 2.0f,
                    dx2 = -2.52f,
                    dy2 = 4.0f,
                    dx3 = -2.8f,
                    dy3 = 6.0f,
                )
                // m 4.3 2.5
                moveToRelative(dx = 4.3f, dy = 2.5f)
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // M 17 6
                moveTo(x = 17.0f, y = 6.0f)
                // l -2.9 -2.9
                lineToRelative(dx = -2.9f, dy = -2.9f)
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // c 6.67 -6 13.33 0 20 -6
                curveToRelative(
                    dx1 = 6.67f,
                    dy1 = -6.0f,
                    dx2 = 13.33f,
                    dy2 = 0.0f,
                    dx3 = 20.0f,
                    dy3 = -6.0f,
                )
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // l 0.9 0.9
                lineToRelative(dx = 0.9f, dy = 0.9f)
                // M 3.1 14.1
                moveTo(x = 3.1f, y = 14.1f)
                // L 4 15
                lineTo(x = 4.0f, y = 15.0f)
                // m 2.5 -2.5
                moveToRelative(dx = 2.5f, dy = -2.5f)
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // l 2.9 2.9
                lineToRelative(dx = 2.9f, dy = 2.9f)
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // c 1.8 -2 2.52 -4 2.8 -6
                curveToRelative(
                    dx1 = 1.8f,
                    dy1 = -2.0f,
                    dx2 = 2.52f,
                    dy2 = -4.0f,
                    dx3 = 2.8f,
                    dy3 = -6.0f,
                )
            }
        }.build().also { _dna = it }
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
                imageVector = Dna,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _dna: ImageVector? = null
