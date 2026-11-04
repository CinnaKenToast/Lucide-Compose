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

val Gamepad2: ImageVector
    get() {
        val current = _gamepad2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Gamepad2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <line x1="6.0" y1="11.0" x2="10.0" y2="11.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // L 10 11
                lineTo(x = 10.0f, y = 11.0f)
            }
            // <line x1="8.0" y1="9.0" x2="8.0" y2="13.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 9
                moveTo(x = 8.0f, y = 9.0f)
                // L 8 13
                lineTo(x = 8.0f, y = 13.0f)
            }
            // <line x1="15.0" y1="12.0" x2="15.01" y2="12.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 12
                moveTo(x = 15.0f, y = 12.0f)
                // L 15.01 12
                lineTo(x = 15.01f, y = 12.0f)
            }
            // <line x1="18.0" y1="10.0" x2="18.01" y2="10.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // L 18.01 10
                lineTo(x = 18.01f, y = 10.0f)
            }
            // M17.32 5 H6.68 A4 4 0 0 0 2.7 8.59 q0 .07 -.02 .15 A108 108 0 0 0 2 16 a3 3 0 0 0 3 3 c1 0 1.5 -.5 2 -1 l1.41 -1.41 A2 2 0 0 1 9.83 16 h4.34 a2 2 0 0 1 1.42 .59 L17 18 c.5 .5 1 1 2 1 a3 3 0 0 0 3 -3 c0 -1.54 -.6 -6.58 -.68 -7.26 L21.3 8.6 A4 4 0 0 0 17.32 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.32 5
                moveTo(x = 17.32f, y = 5.0f)
                // H 6.68
                horizontalLineTo(x = 6.68f)
                // A 4 4 0 0 0 2.7 8.59
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.7f,
                    y1 = 8.59f,
                )
                // q 0 0.07 -0.02 0.15
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.07f,
                    dx2 = -0.02f,
                    dy2 = 0.15f,
                )
                // A 108 108 0 0 0 2 16
                arcTo(
                    horizontalEllipseRadius = 108.0f,
                    verticalEllipseRadius = 108.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // a 3 3 0 0 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // c 1 0 1.5 -0.5 2 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.5f,
                    dx3 = 2.0f,
                    dy3 = -1.0f,
                )
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // A 2 2 0 0 1 9.83 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.83f,
                    y1 = 16.0f,
                )
                // h 4.34
                horizontalLineToRelative(dx = 4.34f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // L 17 18
                lineTo(x = 17.0f, y = 18.0f)
                // c 0.5 0.5 1 1 2 1
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.5f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                    dx3 = 2.0f,
                    dy3 = 1.0f,
                )
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // c 0 -1.54 -0.6 -6.58 -0.68 -7.26
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.54f,
                    dx2 = -0.6f,
                    dy2 = -6.58f,
                    dx3 = -0.68f,
                    dy3 = -7.26f,
                )
                // L 21.3 8.6
                lineTo(x = 21.3f, y = 8.6f)
                // A 4 4 0 0 0 17.32 5
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.32f,
                    y1 = 5.0f,
                )
            }
        }.build().also { _gamepad2 = it }
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
                imageVector = Gamepad2,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _gamepad2: ImageVector? = null
