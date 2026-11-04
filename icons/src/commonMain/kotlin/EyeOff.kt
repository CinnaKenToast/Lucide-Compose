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

val EyeOff: ImageVector
    get() {
        val current = _eyeOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.EyeOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.73 5.08 a10.74 10.74 0 0 1 11.2 6.57 1 1 0 0 1 0 .7 11 11 0 0 1 -1.44 2.49 m-6.4 -.68 a3 3 0 0 1 -4.25 -4.24
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.73 5.08
                moveTo(x = 10.73f, y = 5.08f)
                // a 10.74 10.74 0 0 1 11.2 6.57
                arcToRelative(
                    a = 10.74f,
                    b = 10.74f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 11.2f,
                    dy1 = 6.57f,
                )
                // a 1 1 0 0 1 0 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 0.7f,
                )
                // a 11 11 0 0 1 -1.44 2.49
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.44f,
                    dy1 = 2.49f,
                )
                // m -6.4 -0.68
                moveToRelative(dx = -6.4f, dy = -0.68f)
                // a 3 3 0 0 1 -4.25 -4.24
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.25f,
                    dy1 = -4.24f,
                )
            }
            // M17.48 17.5 a10.75 10.75 0 0 1 -15.42 -5.15 1 1 0 0 1 0 -.7 10.8 10.8 0 0 1 4.45 -5.14 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.48 17.5
                moveTo(x = 17.48f, y = 17.5f)
                // a 10.75 10.75 0 0 1 -15.42 -5.15
                arcToRelative(
                    a = 10.75f,
                    b = 10.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -15.42f,
                    dy1 = -5.15f,
                )
                // a 1 1 0 0 1 0 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                )
                // a 10.8 10.8 0 0 1 4.45 -5.14
                arcToRelative(
                    a = 10.8f,
                    b = 10.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.45f,
                    dy1 = -5.14f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _eyeOff = it }
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
                imageVector = EyeOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _eyeOff: ImageVector? = null
