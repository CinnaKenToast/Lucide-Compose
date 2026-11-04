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

val WheatOff: ImageVector
    get() {
        val current = _wheatOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.WheatOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 22 10 -10 m4 -4 -1.17 1.17 M3.47 12.53 5 11 l1.53 1.53 a3.5 3.5 0 0 1 0 4.94 L5 19 l-1.53 -1.53 a3.5 3.5 0 0 1 0 -4.94 M8 8 7.47 8.53 a3.5 3.5 0 0 0 0 4.94 L9 15 l1.53 -1.53 a3.5 3.5 0 0 0 .98 -1.97 m-.6 -6.24 a4 4 0 0 1 .56 -.73 L13 3 l1.53 1.53 a3.5 3.5 0 0 1 .28 4.62 M20 2 h2 v2 a4 4 0 0 1 -4 4 h-2 V6 a4 4 0 0 1 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // l 10 -10
                lineToRelative(dx = 10.0f, dy = -10.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // l -1.17 1.17
                lineToRelative(dx = -1.17f, dy = 1.17f)
                // M 3.47 12.53
                moveTo(x = 3.47f, y = 12.53f)
                // L 5 11
                lineTo(x = 5.0f, y = 11.0f)
                // l 1.53 1.53
                lineToRelative(dx = 1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 0 4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.94f,
                )
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // l -1.53 -1.53
                lineToRelative(dx = -1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 0 -4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.94f,
                )
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // L 7.47 8.53
                lineTo(x = 7.47f, y = 8.53f)
                // a 3.5 3.5 0 0 0 0 4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.94f,
                )
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 0 0.98 -1.97
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.98f,
                    dy1 = -1.97f,
                )
                // m -0.6 -6.24
                moveToRelative(dx = -0.6f, dy = -6.24f)
                // a 4 4 0 0 1 0.56 -0.73
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.56f,
                    dy1 = -0.73f,
                )
                // L 13 3
                lineTo(x = 13.0f, y = 3.0f)
                // l 1.53 1.53
                lineToRelative(dx = 1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 0.28 4.62
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.28f,
                    dy1 = 4.62f,
                )
                // M 20 2
                moveTo(x = 20.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
            }
            // M11.47 17.47 13 19 l-1.53 1.53 a3.5 3.5 0 0 1 -4.94 0 L5 19 l1.53 -1.53 a3.5 3.5 0 0 1 4.94 0 M16 16 l-.53 .53 a3.5 3.5 0 0 1 -4.94 0 L9 15 l1.53 -1.53 a3.5 3.5 0 0 1 1.97 -.98 m6.24 .6 a4 4 0 0 0 .73 -.56 L21 11 l-1.53 -1.53 a3.5 3.5 0 0 0 -4.62 -.28
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.47 17.47
                moveTo(x = 11.47f, y = 17.47f)
                // L 13 19
                lineTo(x = 13.0f, y = 19.0f)
                // l -1.53 1.53
                lineToRelative(dx = -1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 -4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.94f,
                    dy1 = 0.0f,
                )
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.94f,
                    dy1 = 0.0f,
                )
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // l -0.53 0.53
                lineToRelative(dx = -0.53f, dy = 0.53f)
                // a 3.5 3.5 0 0 1 -4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.94f,
                    dy1 = 0.0f,
                )
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 1.97 -0.98
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.97f,
                    dy1 = -0.98f,
                )
                // m 6.24 0.6
                moveToRelative(dx = 6.24f, dy = 0.6f)
                // a 4 4 0 0 0 0.73 -0.56
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = -0.56f,
                )
                // L 21 11
                lineTo(x = 21.0f, y = 11.0f)
                // l -1.53 -1.53
                lineToRelative(dx = -1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 0 -4.62 -0.28
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.62f,
                    dy1 = -0.28f,
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
        }.build().also { _wheatOff = it }
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
                imageVector = WheatOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wheatOff: ImageVector? = null
