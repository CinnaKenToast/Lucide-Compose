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

val Sword: ImageVector
    get() {
        val current = _sword
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Sword",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 19 -6 -6 m0 8 -2 -2 m5 -3 -4 4 m5.5 -2.5 L20.41 6.59 A2 2 0 0 0 21 5.17 V3 h-2.17 a2 2 0 0 0 -1.42 .59 L6.5 14.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // l -2 -2
                lineToRelative(dx = -2.0f, dy = -2.0f)
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // m 5.5 -2.5
                moveToRelative(dx = 5.5f, dy = -2.5f)
                // L 20.41 6.59
                lineTo(x = 20.41f, y = 6.59f)
                // A 2 2 0 0 0 21 5.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 5.17f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // h -2.17
                horizontalLineToRelative(dx = -2.17f)
                // a 2 2 0 0 0 -1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.59f,
                )
                // L 6.5 14.5
                lineTo(x = 6.5f, y = 14.5f)
            }
        }.build().also { _sword = it }
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
                imageVector = Sword,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sword: ImageVector? = null
