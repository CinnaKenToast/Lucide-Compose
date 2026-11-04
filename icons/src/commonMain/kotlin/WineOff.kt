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

val WineOff: ImageVector
    get() {
        val current = _wineOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.WineOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 22 h8 M7 10 h3 m7 0 h-1.34 M12 15 v7 M7.3 7.3 A12 12 0 0 0 7 10 a5 5 0 0 0 7.4 4.4 M8.63 2.97 9 2 h6 c1.5 4 2 6 2 8 q0 .6 -.14 1.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 7 10
                moveTo(x = 7.0f, y = 10.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m 7 0
                moveToRelative(dx = 7.0f, dy = 0.0f)
                // h -1.34
                horizontalLineToRelative(dx = -1.34f)
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // M 7.3 7.3
                moveTo(x = 7.3f, y = 7.3f)
                // A 12 12 0 0 0 7 10
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 10.0f,
                )
                // a 5 5 0 0 0 7.4 4.4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.4f,
                    dy1 = 4.4f,
                )
                // M 8.63 2.97
                moveTo(x = 8.63f, y = 2.97f)
                // L 9 2
                lineTo(x = 9.0f, y = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 1.5 4 2 6 2 8
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 4.0f,
                    dx2 = 2.0f,
                    dy2 = 6.0f,
                    dx3 = 2.0f,
                    dy3 = 8.0f,
                )
                // q 0 0.6 -0.14 1.2
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = -0.14f,
                    dy2 = 1.2f,
                )
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _wineOff = it }
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
                imageVector = WineOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wineOff: ImageVector? = null
