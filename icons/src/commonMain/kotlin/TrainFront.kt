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

val TrainFront: ImageVector
    get() {
        val current = _trainFront
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.TrainFront",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 3.1 V7 a4 4 0 0 0 8 0 V3.1 M9 15 l-1 -1 m7 1 1 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 3.1
                moveTo(x = 8.0f, y = 3.1f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 4 4 0 0 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // V 3.1
                verticalLineTo(y = 3.1f)
                // M 9 15
                moveTo(x = 9.0f, y = 15.0f)
                // l -1 -1
                lineToRelative(dx = -1.0f, dy = -1.0f)
                // m 7 1
                moveToRelative(dx = 7.0f, dy = 1.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
            }
            // M9 19 c-2.8 0 -5 -2.2 -5 -5 v-4 a8 8 0 0 1 16 0 v4 c0 2.8 -2.2 5 -5 5Z m-1 0 -2 3 m10 -3 2 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
                // c -2.8 0 -5 -2.2 -5 -5
                curveToRelative(
                    dx1 = -2.8f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -2.2f,
                    dx3 = -5.0f,
                    dy3 = -5.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 8 8 0 0 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 2.8 -2.2 5 -5 5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.8f,
                    dx2 = -2.2f,
                    dy2 = 5.0f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                close()
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // l -2 3
                lineToRelative(dx = -2.0f, dy = 3.0f)
                // m 10 -3
                moveToRelative(dx = 10.0f, dy = -3.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
            }
        }.build().also { _trainFront = it }
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
                imageVector = TrainFront,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _trainFront: ImageVector? = null
