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

val Feather: ImageVector
    get() {
        val current = _feather
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Feather",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.09 18.41 A2 2 0 0 1 12.67 19 H5 v-7.67 A2 2 0 0 1 5.59 9.9 l6.16 -6.16 a6 6 0 1 1 8.49 8.49z M16 8 2 22 m15.49 -7 H9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.09 18.41
                moveTo(x = 14.09f, y = 18.41f)
                // A 2 2 0 0 1 12.67 19
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.67f,
                    y1 = 19.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -7.67
                verticalLineToRelative(dy = -7.67f)
                // A 2 2 0 0 1 5.59 9.9
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.59f,
                    y1 = 9.9f,
                )
                // l 6.16 -6.16
                lineToRelative(dx = 6.16f, dy = -6.16f)
                // a 6 6 0 1 1 8.49 8.49z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.49f,
                    dy1 = 8.49f,
                )
                close()
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // m 15.49 -7
                moveToRelative(dx = 15.49f, dy = -7.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
            }
        }.build().also { _feather = it }
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
                imageVector = Feather,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _feather: ImageVector? = null
