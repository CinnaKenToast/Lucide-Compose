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

val Cctv: ImageVector
    get() {
        val current = _cctv
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Cctv",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16.75 12 h3.63 a1 1 0 0 1 .9 1.45 l-2.04 4.07 a1 1 0 0 1 -1.7 .13 l-2.13 -2.97 m1.7 -5.63 a1 1 0 0 1 .44 1.34 l-3.1 6.22 a1 1 0 0 1 -1.34 .44 L3.6 12.3 a2.9 2.9 0 0 1 -1.3 -3.91 L3.69 5.6 a2.9 2.9 0 0 1 3.92 -1.3z M2 19 h3.76 a2 2 0 0 0 1.8 -1.1 L9 15 m-7 6 v-4 m5 -8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.75 12
                moveTo(x = 16.75f, y = 12.0f)
                // h 3.63
                horizontalLineToRelative(dx = 3.63f)
                // a 1 1 0 0 1 0.9 1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = 1.45f,
                )
                // l -2.04 4.07
                lineToRelative(dx = -2.04f, dy = 4.07f)
                // a 1 1 0 0 1 -1.7 0.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.13f,
                )
                // l -2.13 -2.97
                lineToRelative(dx = -2.13f, dy = -2.97f)
                // m 1.7 -5.63
                moveToRelative(dx = 1.7f, dy = -5.63f)
                // a 1 1 0 0 1 0.44 1.34
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.44f,
                    dy1 = 1.34f,
                )
                // l -3.1 6.22
                lineToRelative(dx = -3.1f, dy = 6.22f)
                // a 1 1 0 0 1 -1.34 0.44
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.34f,
                    dy1 = 0.44f,
                )
                // L 3.6 12.3
                lineTo(x = 3.6f, y = 12.3f)
                // a 2.9 2.9 0 0 1 -1.3 -3.91
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = -3.91f,
                )
                // L 3.69 5.6
                lineTo(x = 3.69f, y = 5.6f)
                // a 2.9 2.9 0 0 1 3.92 -1.3z
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.92f,
                    dy1 = -1.3f,
                )
                close()
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // h 3.76
                horizontalLineToRelative(dx = 3.76f)
                // a 2 2 0 0 0 1.8 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = -1.1f,
                )
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // m -7 6
                moveToRelative(dx = -7.0f, dy = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 5 -8z
                moveToRelative(dx = 5.0f, dy = -8.0f)
                close()
            }
        }.build().also { _cctv = it }
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
                imageVector = Cctv,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cctv: ImageVector? = null
