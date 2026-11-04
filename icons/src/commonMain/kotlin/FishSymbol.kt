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

val FishSymbol: ImageVector
    get() {
        val current = _fishSymbol
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.FishSymbol",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 16 s9 -15 20 -4 C11 23 2 8 2 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // s 9 -15 20 -4
                reflectiveCurveToRelative(
                    dx1 = 9.0f,
                    dy1 = -15.0f,
                    dx2 = 20.0f,
                    dy2 = -4.0f,
                )
                // C 11 23 2 8 2 8
                curveTo(
                    x1 = 11.0f,
                    y1 = 23.0f,
                    x2 = 2.0f,
                    y2 = 8.0f,
                    x3 = 2.0f,
                    y3 = 8.0f,
                )
            }
        }.build().also { _fishSymbol = it }
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
                imageVector = FishSymbol,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _fishSymbol: ImageVector? = null
