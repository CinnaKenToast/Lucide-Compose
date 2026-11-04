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

val Landmark: ImageVector
    get() {
        val current = _landmark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Landmark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 18 v-7 m1.12 -8.8 a2 2 0 0 1 1.76 0 l7.84 3.85 A.5 .5 0 0 1 20.5 7 h-17 a.5 .5 0 0 1 -.22 -.95z M14 18 v-7 m4 7 v-7 M3 22 h18 M6 18 v-7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // m 1.12 -8.8
                moveToRelative(dx = 1.12f, dy = -8.8f)
                // a 2 2 0 0 1 1.76 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.76f,
                    dy1 = 0.0f,
                )
                // l 7.84 3.85
                lineToRelative(dx = 7.84f, dy = 3.85f)
                // A 0.5 0.5 0 0 1 20.5 7
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.5f,
                    y1 = 7.0f,
                )
                // h -17
                horizontalLineToRelative(dx = -17.0f)
                // a 0.5 0.5 0 0 1 -0.22 -0.95z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.22f,
                    dy1 = -0.95f,
                )
                close()
                // M 14 18
                moveTo(x = 14.0f, y = 18.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // M 3 22
                moveTo(x = 3.0f, y = 22.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
            }
        }.build().also { _landmark = it }
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
                imageVector = Landmark,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _landmark: ImageVector? = null
