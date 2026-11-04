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

val MapPinned: ImageVector
    get() {
        val current = _mapPinned
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MapPinned",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 8 c0 3.61 -3.87 7.43 -5.4 8.8 a1 1 0 0 1 -1.2 0 C9.86 15.43 6 11.6 6 8 a6 6 0 0 1 12 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // c 0 3.61 -3.87 7.43 -5.4 8.8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.61f,
                    dx2 = -3.87f,
                    dy2 = 7.43f,
                    dx3 = -5.4f,
                    dy3 = 8.8f,
                )
                // a 1 1 0 0 1 -1.2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.2f,
                    dy1 = 0.0f,
                )
                // C 9.86 15.43 6 11.6 6 8
                curveTo(
                    x1 = 9.86f,
                    y1 = 15.43f,
                    x2 = 6.0f,
                    y2 = 11.6f,
                    x3 = 6.0f,
                    y3 = 8.0f,
                )
                // a 6 6 0 0 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
            }
            // M4.47 15 h-.2 a1 1 0 0 0 -.96 .75 L2.2 20.1 A1.5 1.5 0 0 0 3.66 22 h16.68 a1.5 1.5 0 0 0 1.45 -1.9 l-1.1 -4.35 A1 1 0 0 0 19.72 15 h-.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.47 15
                moveTo(x = 4.47f, y = 15.0f)
                // h -0.2
                horizontalLineToRelative(dx = -0.2f)
                // a 1 1 0 0 0 -0.96 0.75
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = 0.75f,
                )
                // L 2.2 20.1
                lineTo(x = 2.2f, y = 20.1f)
                // A 1.5 1.5 0 0 0 3.66 22
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.66f,
                    y1 = 22.0f,
                )
                // h 16.68
                horizontalLineToRelative(dx = 16.68f)
                // a 1.5 1.5 0 0 0 1.45 -1.9
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.45f,
                    dy1 = -1.9f,
                )
                // l -1.1 -4.35
                lineToRelative(dx = -1.1f, dy = -4.35f)
                // A 1 1 0 0 0 19.72 15
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.72f,
                    y1 = 15.0f,
                )
                // h -0.2
                horizontalLineToRelative(dx = -0.2f)
            }
            // <circle cx="12.0" cy="8.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _mapPinned = it }
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
                imageVector = MapPinned,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mapPinned: ImageVector? = null
