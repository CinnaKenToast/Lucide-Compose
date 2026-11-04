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

val Highlighter: ImageVector
    get() {
        val current = _highlighter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Highlighter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m9 11 -6 6 v3 h9 l3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 11
                moveTo(x = 9.0f, y = 11.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
            }
            // m22 12 -4.6 4.6 a2 2 0 0 1 -2.8 0 l-5.2 -5.2 a2 2 0 0 1 0 -2.8 L14 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // l -4.6 4.6
                lineToRelative(dx = -4.6f, dy = 4.6f)
                // a 2 2 0 0 1 -2.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.8f,
                    dy1 = 0.0f,
                )
                // l -5.2 -5.2
                lineToRelative(dx = -5.2f, dy = -5.2f)
                // a 2 2 0 0 1 0 -2.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.8f,
                )
                // L 14 4
                lineTo(x = 14.0f, y = 4.0f)
            }
        }.build().also { _highlighter = it }
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
                imageVector = Highlighter,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _highlighter: ImageVector? = null
