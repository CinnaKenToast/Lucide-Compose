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

val Heater: ImageVector
    get() {
        val current = _heater
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Heater",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 8 c2 -3 -2 -3 0 -6 m4.5 6 c2 -3 -2 -3 0 -6 M6 10z M6 14z M10 16 v-4 m4 4 v-4 m4 4 v-4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 8
                moveTo(x = 11.0f, y = 8.0f)
                // c 2 -3 -2 -3 0 -6
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -3.0f,
                    dx2 = -2.0f,
                    dy2 = -3.0f,
                    dx3 = 0.0f,
                    dy3 = -6.0f,
                )
                // m 4.5 6
                moveToRelative(dx = 4.5f, dy = 6.0f)
                // c 2 -3 -2 -3 0 -6
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -3.0f,
                    dx2 = -2.0f,
                    dy2 = -3.0f,
                    dx3 = 0.0f,
                    dy3 = -6.0f,
                )
                // M 6 10z
                moveTo(x = 6.0f, y = 10.0f)
                close()
                // M 6 14z
                moveTo(x = 6.0f, y = 14.0f)
                close()
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
            }
            // M20 6 a2 2 0 0 1 2 2 v10 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h3 M5 20 v2 m14 -2 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 6
                moveTo(x = 20.0f, y = 6.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 5 20
                moveTo(x = 5.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 14 -2
                moveToRelative(dx = 14.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _heater = it }
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
                imageVector = Heater,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _heater: ImageVector? = null
