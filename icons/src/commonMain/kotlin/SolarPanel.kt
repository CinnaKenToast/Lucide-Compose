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

val SolarPanel: ImageVector
    get() {
        val current = _solarPanel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SolarPanel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 2 h2 m1.28 12 -4.56 8 M21 22 l-1.56 -4 H4.56 M3 10 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 2
                moveTo(x = 11.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 1.28 12
                moveToRelative(dx = 1.28f, dy = 12.0f)
                // l -4.56 8
                lineToRelative(dx = -4.56f, dy = 8.0f)
                // M 21 22
                moveTo(x = 21.0f, y = 22.0f)
                // l -1.56 -4
                lineToRelative(dx = -1.56f, dy = -4.0f)
                // H 4.56
                horizontalLineTo(x = 4.56f)
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
            // M6.25 15.04 A2 2 0 0 1 8 14 h12 a1 1 0 0 1 .86 1.5 l-3.1 5.46 A2 2 0 0 1 16 22 H4 a1 1 0 0 1 -.86 -1.5z M7 2 a4 4 0 0 1 -4 4 m5.66 1.66 1.41 1.41
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.25 15.04
                moveTo(x = 6.25f, y = 15.04f)
                // A 2 2 0 0 1 8 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 14.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 1 1 0 0 1 0.86 1.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.86f,
                    dy1 = 1.5f,
                )
                // l -3.1 5.46
                lineToRelative(dx = -3.1f, dy = 5.46f)
                // A 2 2 0 0 1 16 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 22.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 1 1 0 0 1 -0.86 -1.5z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.86f,
                    dy1 = -1.5f,
                )
                close()
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // m 5.66 1.66
                moveToRelative(dx = 5.66f, dy = 1.66f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
            }
        }.build().also { _solarPanel = it }
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
                imageVector = SolarPanel,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _solarPanel: ImageVector? = null
