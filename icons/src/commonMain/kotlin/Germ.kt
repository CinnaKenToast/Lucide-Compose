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

val Germ: ImageVector
    get() {
        val current = _germ
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Germ",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 2 .93 1.85 M13 15z M16 21 l-1 -2.47 M19 2 l-1 1.8 M2 19 l2.75 -1.37 M22 16 l-2.47 -2.13 M22 5 l-1.8 1 M3 10 l2 2 m4 4z M9 20 v2 M9.33 7.04 a8 8 0 0 1 -3.09 3.79 A5 5 0 0 0 9 20 a12.1 12.1 0 0 0 11.9 -9.92 A6 6 0 0 0 9.33 7.04
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 2
                moveTo(x = 11.0f, y = 2.0f)
                // l 0.93 1.85
                lineToRelative(dx = 0.93f, dy = 1.85f)
                // M 13 15z
                moveTo(x = 13.0f, y = 15.0f)
                close()
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // l -1 -2.47
                lineToRelative(dx = -1.0f, dy = -2.47f)
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // l -1 1.8
                lineToRelative(dx = -1.0f, dy = 1.8f)
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // l 2.75 -1.37
                lineToRelative(dx = 2.75f, dy = -1.37f)
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
                // l -2.47 -2.13
                lineToRelative(dx = -2.47f, dy = -2.13f)
                // M 22 5
                moveTo(x = 22.0f, y = 5.0f)
                // l -1.8 1
                lineToRelative(dx = -1.8f, dy = 1.0f)
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // m 4 4z
                moveToRelative(dx = 4.0f, dy = 4.0f)
                close()
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 9.33 7.04
                moveTo(x = 9.33f, y = 7.04f)
                // a 8 8 0 0 1 -3.09 3.79
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.09f,
                    dy1 = 3.79f,
                )
                // A 5 5 0 0 0 9 20
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 20.0f,
                )
                // a 12.1 12.1 0 0 0 11.9 -9.92
                arcToRelative(
                    a = 12.1f,
                    b = 12.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 11.9f,
                    dy1 = -9.92f,
                )
                // A 6 6 0 0 0 9.33 7.04
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.33f,
                    y1 = 7.04f,
                )
            }
            // <circle cx="15.0" cy="9.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _germ = it }
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
                imageVector = Germ,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _germ: ImageVector? = null
