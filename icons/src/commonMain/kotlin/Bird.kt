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

val Bird: ImageVector
    get() {
        val current = _bird
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Bird",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 7 h.01 M3.4 18 H12 a8 8 0 0 0 8 -8 V7 a4 4 0 0 0 -7.28 -2.3 L2 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 3.4 18
                moveTo(x = 3.4f, y = 18.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // a 8 8 0 0 0 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 4 4 0 0 0 -7.28 -2.3
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.28f,
                    dy1 = -2.3f,
                )
                // L 2 20
                lineTo(x = 2.0f, y = 20.0f)
            }
            // m20 7 2 .5 L20 8 M10 18 v3 m4 -3.25 V21 m-7 -3 a6 6 0 0 0 3.84 -10.61
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 7
                moveTo(x = 20.0f, y = 7.0f)
                // l 2 0.5
                lineToRelative(dx = 2.0f, dy = 0.5f)
                // L 20 8
                lineTo(x = 20.0f, y = 8.0f)
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 4 -3.25
                moveToRelative(dx = 4.0f, dy = -3.25f)
                // V 21
                verticalLineTo(y = 21.0f)
                // m -7 -3
                moveToRelative(dx = -7.0f, dy = -3.0f)
                // a 6 6 0 0 0 3.84 -10.61
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.84f,
                    dy1 = -10.61f,
                )
            }
        }.build().also { _bird = it }
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
                imageVector = Bird,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bird: ImageVector? = null
