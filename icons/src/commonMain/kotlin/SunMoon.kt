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

val SunMoon: ImageVector
    get() {
        val current = _sunMoon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SunMoon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v2 m2.84 12.39 A6 6 0 1 1 7.6 9.16 c.63 -.14 .97 .66 .72 1.25 a4 4 0 0 0 5.26 5.26 c.59 -.25 1.4 .09 1.25 .72 M16 12 a4 4 0 0 0 -4 -4 m7 -3 -1.26 1.26 M20 12 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 2.84 12.39
                moveToRelative(dx = 2.84f, dy = 12.39f)
                // A 6 6 0 1 1 7.6 9.16
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 7.6f,
                    y1 = 9.16f,
                )
                // c 0.63 -0.14 0.97 0.66 0.72 1.25
                curveToRelative(
                    dx1 = 0.63f,
                    dy1 = -0.14f,
                    dx2 = 0.97f,
                    dy2 = 0.66f,
                    dx3 = 0.72f,
                    dy3 = 1.25f,
                )
                // a 4 4 0 0 0 5.26 5.26
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.26f,
                    dy1 = 5.26f,
                )
                // c 0.59 -0.25 1.4 0.09 1.25 0.72
                curveToRelative(
                    dx1 = 0.59f,
                    dy1 = -0.25f,
                    dx2 = 1.4f,
                    dy2 = 0.09f,
                    dx3 = 1.25f,
                    dy3 = 0.72f,
                )
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // m 7 -3
                moveToRelative(dx = 7.0f, dy = -3.0f)
                // l -1.26 1.26
                lineToRelative(dx = -1.26f, dy = 1.26f)
                // M 20 12
                moveTo(x = 20.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _sunMoon = it }
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
                imageVector = SunMoon,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sunMoon: ImageVector? = null
