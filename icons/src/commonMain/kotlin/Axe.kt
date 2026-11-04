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

val Axe: ImageVector
    get() {
        val current = _axe
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Axe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 12 -8.38 8.38 a1 1 0 0 1 -3 -3 L11 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // l -8.38 8.38
                lineToRelative(dx = -8.38f, dy = 8.38f)
                // a 1 1 0 0 1 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // L 11 9
                lineTo(x = 11.0f, y = 9.0f)
            }
            // M15 15.5 a.5 .5 0 0 0 .5 .5 A6.5 6.5 0 0 0 22 9.5 .5 .5 0 0 0 21.5 9 h-1.67 a2 2 0 0 1 -1.42 -.59 l-5.06 -5.06 a1.2 1.2 0 0 0 -1.7 0 l-2.3 2.3 a1.2 1.2 0 0 0 0 1.7 l5.06 5.06 A2 2 0 0 1 15 13.83z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 15.5
                moveTo(x = 15.0f, y = 15.5f)
                // a 0.5 0.5 0 0 0 0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.5f,
                )
                // A 6.5 6.5 0 0 0 22 9.5
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 9.5f,
                )
                // A 0.5 0.5 0 0 0 21.5 9
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.5f,
                    y1 = 9.0f,
                )
                // h -1.67
                horizontalLineToRelative(dx = -1.67f)
                // a 2 2 0 0 1 -1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = -0.59f,
                )
                // l -5.06 -5.06
                lineToRelative(dx = -5.06f, dy = -5.06f)
                // a 1.2 1.2 0 0 0 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -2.3 2.3
                lineToRelative(dx = -2.3f, dy = 2.3f)
                // a 1.2 1.2 0 0 0 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l 5.06 5.06
                lineToRelative(dx = 5.06f, dy = 5.06f)
                // A 2 2 0 0 1 15 13.83z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 13.83f,
                )
                close()
            }
        }.build().also { _axe = it }
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
                imageVector = Axe,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _axe: ImageVector? = null
