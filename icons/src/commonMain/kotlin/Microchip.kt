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

val Microchip: ImageVector
    get() {
        val current = _microchip
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Microchip",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 h4 m-4 5 h4 M10 7 h4 m4 5 h2 m-2 6 h2 M18 6 h2 M4 12 h2 m-2 6 h2 M4 6 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 5
                moveToRelative(dx = -4.0f, dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 10 7
                moveTo(x = 10.0f, y = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 4 5
                moveToRelative(dx = 4.0f, dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 6
                moveToRelative(dx = -2.0f, dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 6
                moveToRelative(dx = -2.0f, dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
            // <rect width="12" height="20" rx="2.0" x="6.0" y="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
            }
        }.build().also { _microchip = it }
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
                imageVector = Microchip,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _microchip: ImageVector? = null
