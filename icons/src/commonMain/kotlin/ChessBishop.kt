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

val ChessBishop: ImageVector
    get() {
        val current = _chessBishop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ChessBishop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 20 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 v1 a1 1 0 0 1 -1 1 H6 a1 1 0 0 1 -1 -1z m10 -2 c1.5 -.61 3 -2.46 3 -4.92 C18 8.77 14.5 4.46 12 2 9.5 4.46 6 8.77 6 13.08 c0 2.46 1.5 4.3 3 4.92 m7 -11 -2.5 2.5 M9 2 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 20
                moveTo(x = 5.0f, y = 20.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
                // m 10 -2
                moveToRelative(dx = 10.0f, dy = -2.0f)
                // c 1.5 -0.61 3 -2.46 3 -4.92
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.61f,
                    dx2 = 3.0f,
                    dy2 = -2.46f,
                    dx3 = 3.0f,
                    dy3 = -4.92f,
                )
                // C 18 8.77 14.5 4.46 12 2
                curveTo(
                    x1 = 18.0f,
                    y1 = 8.77f,
                    x2 = 14.5f,
                    y2 = 4.46f,
                    x3 = 12.0f,
                    y3 = 2.0f,
                )
                // C 9.5 4.46 6 8.77 6 13.08
                curveTo(
                    x1 = 9.5f,
                    y1 = 4.46f,
                    x2 = 6.0f,
                    y2 = 8.77f,
                    x3 = 6.0f,
                    y3 = 13.08f,
                )
                // c 0 2.46 1.5 4.3 3 4.92
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.46f,
                    dx2 = 1.5f,
                    dy2 = 4.3f,
                    dx3 = 3.0f,
                    dy3 = 4.92f,
                )
                // m 7 -11
                moveToRelative(dx = 7.0f, dy = -11.0f)
                // l -2.5 2.5
                lineToRelative(dx = -2.5f, dy = 2.5f)
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _chessBishop = it }
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
                imageVector = ChessBishop,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chessBishop: ImageVector? = null
