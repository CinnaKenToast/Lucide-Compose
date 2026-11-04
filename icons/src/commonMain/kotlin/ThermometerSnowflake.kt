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

val ThermometerSnowflake: ImageVector
    get() {
        val current = _thermometerSnowflake
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ThermometerSnowflake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 20 -1.25 -2.5 L6 18 m4 -14 L8.75 6.5 6 6 m4.59 9 H10 m-8 -3 h6.5 L10 9 m10 5.54 a4 4 0 1 1 -4 0 V4 a2 2 0 0 1 4 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // l -1.25 -2.5
                lineToRelative(dx = -1.25f, dy = -2.5f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // L 8.75 6.5
                lineTo(x = 8.75f, y = 6.5f)
                // L 6 6
                lineTo(x = 6.0f, y = 6.0f)
                // m 4.59 9
                moveToRelative(dx = 4.59f, dy = 9.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // m -8 -3
                moveToRelative(dx = -8.0f, dy = -3.0f)
                // h 6.5
                horizontalLineToRelative(dx = 6.5f)
                // L 10 9
                lineTo(x = 10.0f, y = 9.0f)
                // m 10 5.54
                moveToRelative(dx = 10.0f, dy = 5.54f)
                // a 4 4 0 1 1 -4 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m4 10 1.5 2 L4 14 m3 7 3 -6 -1.5 -3 M7 3 l3 6 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 10
                moveTo(x = 4.0f, y = 10.0f)
                // l 1.5 2
                lineToRelative(dx = 1.5f, dy = 2.0f)
                // L 4 14
                lineTo(x = 4.0f, y = 14.0f)
                // m 3 7
                moveToRelative(dx = 3.0f, dy = 7.0f)
                // l 3 -6
                lineToRelative(dx = 3.0f, dy = -6.0f)
                // l -1.5 -3
                lineToRelative(dx = -1.5f, dy = -3.0f)
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // l 3 6
                lineToRelative(dx = 3.0f, dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _thermometerSnowflake = it }
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
                imageVector = ThermometerSnowflake,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _thermometerSnowflake: ImageVector? = null
