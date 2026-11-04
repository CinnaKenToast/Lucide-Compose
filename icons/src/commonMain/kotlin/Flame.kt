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

val Flame: ImageVector
    get() {
        val current = _flame
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Flame",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 q1 4 4 6.5 t3 5.5 a1 1 0 0 1 -14 0 5 5 0 0 1 1 -3 1 1 0 0 0 5 0 c0 -2 -1.5 -3 -1.5 -5 q0 -2 2.5 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // q 1 4 4 6.5
                quadToRelative(
                    dx1 = 1.0f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 6.5f,
                )
                // t 3 5.5
                reflectiveQuadToRelative(
                    dx1 = 3.0f,
                    dy1 = 5.5f,
                )
                // a 1 1 0 0 1 -14 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 0 1 1 -3
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -3.0f,
                )
                // a 1 1 0 0 0 5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // c 0 -2 -1.5 -3 -1.5 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -1.5f,
                    dy2 = -3.0f,
                    dx3 = -1.5f,
                    dy3 = -5.0f,
                )
                // q 0 -2 2.5 -4
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.5f,
                    dy2 = -4.0f,
                )
            }
        }.build().also { _flame = it }
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
                imageVector = Flame,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _flame: ImageVector? = null
