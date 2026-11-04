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

val RadioOff: ImageVector
    get() {
        val current = _radioOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.RadioOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.41 13.41 a2 2 0 1 1 -2.82 -2.82 m5.66 -2.83 a6 6 0 0 1 1.74 4.57 m1.09 -7.4 a10 10 0 0 1 2.23 10.72 M2 2 l20 20 M4.93 19.07 a10 10 0 0 1 0 -14.14 m2.82 11.3 a6 6 0 0 1 0 -8.47
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.41 13.41
                moveTo(x = 13.41f, y = 13.41f)
                // a 2 2 0 1 1 -2.82 -2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.82f,
                    dy1 = -2.82f,
                )
                // m 5.66 -2.83
                moveToRelative(dx = 5.66f, dy = -2.83f)
                // a 6 6 0 0 1 1.74 4.57
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.74f,
                    dy1 = 4.57f,
                )
                // m 1.09 -7.4
                moveToRelative(dx = 1.09f, dy = -7.4f)
                // a 10 10 0 0 1 2.23 10.72
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.23f,
                    dy1 = 10.72f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 4.93 19.07
                moveTo(x = 4.93f, y = 19.07f)
                // a 10 10 0 0 1 0 -14.14
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -14.14f,
                )
                // m 2.82 11.3
                moveToRelative(dx = 2.82f, dy = 11.3f)
                // a 6 6 0 0 1 0 -8.47
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -8.47f,
                )
            }
        }.build().also { _radioOff = it }
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
                imageVector = RadioOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _radioOff: ImageVector? = null
