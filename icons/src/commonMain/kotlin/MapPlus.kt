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

val MapPlus: ImageVector
    get() {
        val current = _mapPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MapPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 19 -1.1 -.55 a2 2 0 0 0 -1.8 0 l-3.65 1.83 A1 1 0 0 1 3 19.38 V6.62 a1 1 0 0 1 .55 -.9 l4.56 -2.27 a2 2 0 0 1 1.78 0 l4.22 2.1 a2 2 0 0 0 1.78 0 l3.66 -1.83 A1 1 0 0 1 21 4.62 V12 m-6 -6.24 V12 m3 3 v6 m3 -3 h-6 M9 3.24 v15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // l -1.1 -0.55
                lineToRelative(dx = -1.1f, dy = -0.55f)
                // a 2 2 0 0 0 -1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
                // l -3.65 1.83
                lineToRelative(dx = -3.65f, dy = 1.83f)
                // A 1 1 0 0 1 3 19.38
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 19.38f,
                )
                // V 6.62
                verticalLineTo(y = 6.62f)
                // a 1 1 0 0 1 0.55 -0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = -0.9f,
                )
                // l 4.56 -2.27
                lineToRelative(dx = 4.56f, dy = -2.27f)
                // a 2 2 0 0 1 1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                // l 4.22 2.1
                lineToRelative(dx = 4.22f, dy = 2.1f)
                // a 2 2 0 0 0 1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                // l 3.66 -1.83
                lineToRelative(dx = 3.66f, dy = -1.83f)
                // A 1 1 0 0 1 21 4.62
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 4.62f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // m -6 -6.24
                moveToRelative(dx = -6.0f, dy = -6.24f)
                // V 12
                verticalLineTo(y = 12.0f)
                // m 3 3
                moveToRelative(dx = 3.0f, dy = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // M 9 3.24
                moveTo(x = 9.0f, y = 3.24f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
            }
        }.build().also { _mapPlus = it }
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
                imageVector = MapPlus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mapPlus: ImageVector? = null
