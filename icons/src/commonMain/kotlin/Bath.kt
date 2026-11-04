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

val Bath: ImageVector
    get() {
        val current = _bath
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Bath",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 4 8 6 m9 13 v2 M2 12 h20 M7 19 v2 M9 5 7.62 3.62 A2.12 2.12 0 0 0 4 5 v12 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 v-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // L 8 6
                lineTo(x = 8.0f, y = 6.0f)
                // m 9 13
                moveToRelative(dx = 9.0f, dy = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // L 7.62 3.62
                lineTo(x = 7.62f, y = 3.62f)
                // A 2.12 2.12 0 0 0 4 5
                arcTo(
                    horizontalEllipseRadius = 2.12f,
                    verticalEllipseRadius = 2.12f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 5.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
            }
        }.build().also { _bath = it }
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
                imageVector = Bath,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bath: ImageVector? = null
