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

val Clapperboard: ImageVector
    get() {
        val current = _clapperboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Clapperboard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12.3 3.46 3.02 3.96 M20.2 6 3 11 2.1 8.6 a2 2 0 0 1 1.3 -2.5 l13.5 -4 c1.1 -.3 2.2 .3 2.5 1.3z M3 11 h18 v8 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2z m3.18 -5.72 3.1 3.9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.3 3.46
                moveTo(x = 12.3f, y = 3.46f)
                // l 3.02 3.96
                lineToRelative(dx = 3.02f, dy = 3.96f)
                // M 20.2 6
                moveTo(x = 20.2f, y = 6.0f)
                // L 3 11
                lineTo(x = 3.0f, y = 11.0f)
                // L 2.1 8.6
                lineTo(x = 2.1f, y = 8.6f)
                // a 2 2 0 0 1 1.3 -2.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.3f,
                    dy1 = -2.5f,
                )
                // l 13.5 -4
                lineToRelative(dx = 13.5f, dy = -4.0f)
                // c 1.1 -0.3 2.2 0.3 2.5 1.3z
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = -0.3f,
                    dx2 = 2.2f,
                    dy2 = 0.3f,
                    dx3 = 2.5f,
                    dy3 = 1.3f,
                )
                close()
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
                // m 3.18 -5.72
                moveToRelative(dx = 3.18f, dy = -5.72f)
                // l 3.1 3.9
                lineToRelative(dx = 3.1f, dy = 3.9f)
            }
        }.build().also { _clapperboard = it }
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
                imageVector = Clapperboard,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _clapperboard: ImageVector? = null
