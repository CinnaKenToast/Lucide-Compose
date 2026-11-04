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

val RollerCoaster: ImageVector
    get() {
        val current = _rollerCoaster
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.RollerCoaster",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 19 V5 m4 14 V6.8 M14 19 v-7.8 M18 5 v4 m0 10 v-6 m4 6 V9 M2 19 V9 a4 4 0 0 1 4 -4 q3 0 6 4 c3 4 4 4 6 4 a4 4 0 1 0 -3 -6.65
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 19
                moveTo(x = 6.0f, y = 19.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 4 14
                moveToRelative(dx = 4.0f, dy = 14.0f)
                // V 6.8
                verticalLineTo(y = 6.8f)
                // M 14 19
                moveTo(x = 14.0f, y = 19.0f)
                // v -7.8
                verticalLineToRelative(dy = -7.8f)
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 4 6
                moveToRelative(dx = 4.0f, dy = 6.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // V 9
                verticalLineTo(y = 9.0f)
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
                // q 3 0 6 4
                quadToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 4.0f,
                )
                // c 3 4 4 4 6 4
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 6.0f,
                    dy3 = 4.0f,
                )
                // a 4 4 0 1 0 -3 -6.65
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -6.65f,
                )
            }
        }.build().also { _rollerCoaster = it }
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
                imageVector = RollerCoaster,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rollerCoaster: ImageVector? = null
