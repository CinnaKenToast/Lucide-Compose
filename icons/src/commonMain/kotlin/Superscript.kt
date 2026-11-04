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

val Superscript: ImageVector
    get() {
        val current = _superscript
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Superscript",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m4 19 8 -8 m0 8 -8 -8 m16 1 h-4 c0 -1.5 .44 -2 1.5 -2.5 S20 8.33 20 7 a2 2 0 0 0 -.48 -1.29 2.1 2.1 0 0 0 -2.62 -.43 A2 2 0 0 0 16 6.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 19
                moveTo(x = 4.0f, y = 19.0f)
                // l 8 -8
                lineToRelative(dx = 8.0f, dy = -8.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // l -8 -8
                lineToRelative(dx = -8.0f, dy = -8.0f)
                // m 16 1
                moveToRelative(dx = 16.0f, dy = 1.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c 0 -1.5 0.44 -2 1.5 -2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.5f,
                    dx2 = 0.44f,
                    dy2 = -2.0f,
                    dx3 = 1.5f,
                    dy3 = -2.5f,
                )
                // S 20 8.33 20 7
                reflectiveCurveTo(
                    x1 = 20.0f,
                    y1 = 8.33f,
                    x2 = 20.0f,
                    y2 = 7.0f,
                )
                // a 2 2 0 0 0 -0.48 -1.29
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.48f,
                    dy1 = -1.29f,
                )
                // a 2.1 2.1 0 0 0 -2.62 -0.43
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.62f,
                    dy1 = -0.43f,
                )
                // A 2 2 0 0 0 16 6.34
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 6.34f,
                )
            }
        }.build().also { _superscript = it }
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
                imageVector = Superscript,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _superscript: ImageVector? = null
