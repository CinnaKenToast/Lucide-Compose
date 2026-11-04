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

val BotOff: ImageVector
    get() {
        val current = _botOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BotOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.67 8 H18 a2 2 0 0 1 2 2 v4.33 M2 14 h2 m16 0 h2 m0 8 L2 2 m6 6 H6 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 1.41 -.59 M9 13 v2 M9.67 4 H12 v2.33
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.67 8
                moveTo(x = 13.67f, y = 8.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
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
                // v 4.33
                verticalLineToRelative(dy = 4.33f)
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // L 2 2
                lineTo(x = 2.0f, y = 2.0f)
                // m 6 6
                moveToRelative(dx = 6.0f, dy = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 0 1.41 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.41f,
                    dy1 = -0.59f,
                )
                // M 9 13
                moveTo(x = 9.0f, y = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 9.67 4
                moveTo(x = 9.67f, y = 4.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 2.33
                verticalLineToRelative(dy = 2.33f)
            }
        }.build().also { _botOff = it }
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
                imageVector = BotOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _botOff: ImageVector? = null
