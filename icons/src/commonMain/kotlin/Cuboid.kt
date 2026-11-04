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

val Cuboid: ImageVector
    get() {
        val current = _cuboid
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Cuboid",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 22 v-8 M2.34 8.89 10 14 l11.72 -7.03
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 22
                moveTo(x = 10.0f, y = 22.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // M 2.34 8.89
                moveTo(x = 2.34f, y = 8.89f)
                // L 10 14
                lineTo(x = 10.0f, y = 14.0f)
                // l 11.72 -7.03
                lineToRelative(dx = 11.72f, dy = -7.03f)
            }
            // M22 14 a2 2 0 0 1 -.97 1.72 l-10 6 a2 2 0 0 1 -2.14 -.05 l-6 -4 A2 2 0 0 1 2 16 v-6 a2 2 0 0 1 .97 -1.71 l10 -6 a2 2 0 0 1 2.14 .05 l6 4 A2 2 0 0 1 22 8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 14
                moveTo(x = 22.0f, y = 14.0f)
                // a 2 2 0 0 1 -0.97 1.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.97f,
                    dy1 = 1.72f,
                )
                // l -10 6
                lineToRelative(dx = -10.0f, dy = 6.0f)
                // a 2 2 0 0 1 -2.14 -0.05
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.14f,
                    dy1 = -0.05f,
                )
                // l -6 -4
                lineToRelative(dx = -6.0f, dy = -4.0f)
                // A 2 2 0 0 1 2 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 0 0 1 0.97 -1.71
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.97f,
                    dy1 = -1.71f,
                )
                // l 10 -6
                lineToRelative(dx = 10.0f, dy = -6.0f)
                // a 2 2 0 0 1 2.14 0.05
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.14f,
                    dy1 = 0.05f,
                )
                // l 6 4
                lineToRelative(dx = 6.0f, dy = 4.0f)
                // A 2 2 0 0 1 22 8z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 8.0f,
                )
                close()
            }
        }.build().also { _cuboid = it }
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
                imageVector = Cuboid,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cuboid: ImageVector? = null
