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

val Kayak: ImageVector
    get() {
        val current = _kayak
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Kayak",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 17 a1 1 0 0 0 -1 1 v1 a2 2 0 1 0 2 -2z m2.97 -13.39 a.45 .45 0 0 0 -.58 -.58 C10.2 6.6 6.6 10.2 3.03 20.39 a.45 .45 0 0 0 .58 .58 C13.8 17.4 17.4 13.8 20.97 3.61 M6.71 6.71 l10.58 10.58 M7 5 a2 2 0 1 0 -2 2 h1 a1 1 0 0 0 1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 17
                moveTo(x = 18.0f, y = 17.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 2 2 0 1 0 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
                // m 2.97 -13.39
                moveToRelative(dx = 2.97f, dy = -13.39f)
                // a 0.45 0.45 0 0 0 -0.58 -0.58
                arcToRelative(
                    a = 0.45f,
                    b = 0.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.58f,
                    dy1 = -0.58f,
                )
                // C 10.2 6.6 6.6 10.2 3.03 20.39
                curveTo(
                    x1 = 10.2f,
                    y1 = 6.6f,
                    x2 = 6.6f,
                    y2 = 10.2f,
                    x3 = 3.03f,
                    y3 = 20.39f,
                )
                // a 0.45 0.45 0 0 0 0.58 0.58
                arcToRelative(
                    a = 0.45f,
                    b = 0.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.58f,
                    dy1 = 0.58f,
                )
                // C 13.8 17.4 17.4 13.8 20.97 3.61
                curveTo(
                    x1 = 13.8f,
                    y1 = 17.4f,
                    x2 = 17.4f,
                    y2 = 13.8f,
                    x3 = 20.97f,
                    y3 = 3.61f,
                )
                // M 6.71 6.71
                moveTo(x = 6.71f, y = 6.71f)
                // l 10.58 10.58
                lineToRelative(dx = 10.58f, dy = 10.58f)
                // M 7 5
                moveTo(x = 7.0f, y = 5.0f)
                // a 2 2 0 1 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _kayak = it }
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
                imageVector = Kayak,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _kayak: ImageVector? = null
