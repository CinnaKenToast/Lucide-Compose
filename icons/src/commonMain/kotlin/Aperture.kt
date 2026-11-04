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

val Aperture: ImageVector
    get() {
        val current = _aperture
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Aperture",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m14.31 8 5.74 9.94 M9.69 8 h11.48 M7.38 12 l5.74 -9.94 M9.69 16 3.95 6.06 M14.31 16 H2.83 m13.79 -4 -5.74 9.94
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.31 8
                moveTo(x = 14.31f, y = 8.0f)
                // l 5.74 9.94
                lineToRelative(dx = 5.74f, dy = 9.94f)
                // M 9.69 8
                moveTo(x = 9.69f, y = 8.0f)
                // h 11.48
                horizontalLineToRelative(dx = 11.48f)
                // M 7.38 12
                moveTo(x = 7.38f, y = 12.0f)
                // l 5.74 -9.94
                lineToRelative(dx = 5.74f, dy = -9.94f)
                // M 9.69 16
                moveTo(x = 9.69f, y = 16.0f)
                // L 3.95 6.06
                lineTo(x = 3.95f, y = 6.06f)
                // M 14.31 16
                moveTo(x = 14.31f, y = 16.0f)
                // H 2.83
                horizontalLineTo(x = 2.83f)
                // m 13.79 -4
                moveToRelative(dx = 13.79f, dy = -4.0f)
                // l -5.74 9.94
                lineToRelative(dx = -5.74f, dy = 9.94f)
            }
        }.build().also { _aperture = it }
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
                imageVector = Aperture,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _aperture: ImageVector? = null
