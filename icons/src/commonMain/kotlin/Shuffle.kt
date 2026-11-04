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

val Shuffle: ImageVector
    get() {
        val current = _shuffle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Shuffle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 14 4 4 -4 4 m0 -20 4 4 -4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 14
                moveTo(x = 18.0f, y = 14.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
            }
            // M2 18 h1.97 a4 4 0 0 0 3.3 -1.7 l5.46 -8.6 a4 4 0 0 1 3.3 -1.7 H22 M2 6 h1.97 a4 4 0 0 1 3.6 2.2 M22 18 h-6.04 a4 4 0 0 1 -3.3 -1.8 l-.36 -.45
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // h 1.97
                horizontalLineToRelative(dx = 1.97f)
                // a 4 4 0 0 0 3.3 -1.7
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.3f,
                    dy1 = -1.7f,
                )
                // l 5.46 -8.6
                lineToRelative(dx = 5.46f, dy = -8.6f)
                // a 4 4 0 0 1 3.3 -1.7
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.3f,
                    dy1 = -1.7f,
                )
                // H 22
                horizontalLineTo(x = 22.0f)
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
                // h 1.97
                horizontalLineToRelative(dx = 1.97f)
                // a 4 4 0 0 1 3.6 2.2
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.6f,
                    dy1 = 2.2f,
                )
                // M 22 18
                moveTo(x = 22.0f, y = 18.0f)
                // h -6.04
                horizontalLineToRelative(dx = -6.04f)
                // a 4 4 0 0 1 -3.3 -1.8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.3f,
                    dy1 = -1.8f,
                )
                // l -0.36 -0.45
                lineToRelative(dx = -0.36f, dy = -0.45f)
            }
        }.build().also { _shuffle = it }
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
                imageVector = Shuffle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shuffle: ImageVector? = null
