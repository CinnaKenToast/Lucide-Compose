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

val EggOff: ImageVector
    get() {
        val current = _eggOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.EggOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 2 20 20 m-2 -7.65 V14 c0 -6 -4 -12 -8 -12 a5.3 5.3 0 0 0 -3.16 1.19 M6.21 6.21 A15.3 15.3 0 0 0 4 14 a8 8 0 0 0 14.57 4.57
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -2 -7.65
                moveToRelative(dx = -2.0f, dy = -7.65f)
                // V 14
                verticalLineTo(y = 14.0f)
                // c 0 -6 -4 -12 -8 -12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                    dx2 = -4.0f,
                    dy2 = -12.0f,
                    dx3 = -8.0f,
                    dy3 = -12.0f,
                )
                // a 5.3 5.3 0 0 0 -3.16 1.19
                arcToRelative(
                    a = 5.3f,
                    b = 5.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.16f,
                    dy1 = 1.19f,
                )
                // M 6.21 6.21
                moveTo(x = 6.21f, y = 6.21f)
                // A 15.3 15.3 0 0 0 4 14
                arcTo(
                    horizontalEllipseRadius = 15.3f,
                    verticalEllipseRadius = 15.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 14.0f,
                )
                // a 8 8 0 0 0 14.57 4.57
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.57f,
                    dy1 = 4.57f,
                )
            }
        }.build().also { _eggOff = it }
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
                imageVector = EggOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _eggOff: ImageVector? = null
