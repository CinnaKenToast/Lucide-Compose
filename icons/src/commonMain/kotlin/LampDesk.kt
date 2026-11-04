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

val LampDesk: ImageVector
    get() {
        val current = _lampDesk
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LampDesk",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.3 2.3 a1 1 0 0 1 1.4 0 l2.5 2.5 6 1.22 a1 1 0 0 1 .5 1.69 l-7 7 a1 1 0 0 1 -1.68 -.5 l-1.23 -6 -2.5 -2.5 a1 1 0 0 1 0 -1.42z m3.9 2.5 -3.4 3.4 M3 20 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v1 a1 1 0 0 1 -1 1 H4 a1 1 0 0 1 -1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.3 2.3
                moveTo(x = 10.3f, y = 2.3f)
                // a 1 1 0 0 1 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 2.5 2.5
                lineToRelative(dx = 2.5f, dy = 2.5f)
                // l 6 1.22
                lineToRelative(dx = 6.0f, dy = 1.22f)
                // a 1 1 0 0 1 0.5 1.69
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 1.69f,
                )
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // a 1 1 0 0 1 -1.68 -0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.68f,
                    dy1 = -0.5f,
                )
                // l -1.23 -6
                lineToRelative(dx = -1.23f, dy = -6.0f)
                // l -2.5 -2.5
                lineToRelative(dx = -2.5f, dy = -2.5f)
                // a 1 1 0 0 1 0 -1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.42f,
                )
                close()
                // m 3.9 2.5
                moveToRelative(dx = 3.9f, dy = 2.5f)
                // l -3.4 3.4
                lineToRelative(dx = -3.4f, dy = 3.4f)
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
            // m9.09 6.5 -4.8 4.8 a1 1 0 0 0 -.18 1.16 L7 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.09 6.5
                moveTo(x = 9.09f, y = 6.5f)
                // l -4.8 4.8
                lineToRelative(dx = -4.8f, dy = 4.8f)
                // a 1 1 0 0 0 -0.18 1.16
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.18f,
                    dy1 = 1.16f,
                )
                // L 7 18
                lineTo(x = 7.0f, y = 18.0f)
            }
        }.build().also { _lampDesk = it }
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
                imageVector = LampDesk,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lampDesk: ImageVector? = null
