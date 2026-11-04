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

val MilkOff: ImageVector
    get() {
        val current = _milkOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MilkOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 2 h8 M9 2 v1.34 M15 2 v2.79 A4 4 0 0 0 15.67 7 l.66 .98 A4 4 0 0 1 17 10.21 v1.13 M7.8 7.8 7.67 8 A4 4 0 0 0 7 10.2 V20 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // v 1.34
                verticalLineToRelative(dy = 1.34f)
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // v 2.79
                verticalLineToRelative(dy = 2.79f)
                // A 4 4 0 0 0 15.67 7
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.67f,
                    y1 = 7.0f,
                )
                // l 0.66 0.98
                lineToRelative(dx = 0.66f, dy = 0.98f)
                // A 4 4 0 0 1 17 10.21
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 10.21f,
                )
                // v 1.13
                verticalLineToRelative(dy = 1.13f)
                // M 7.8 7.8
                moveTo(x = 7.8f, y = 7.8f)
                // L 7.67 8
                lineTo(x = 7.67f, y = 8.0f)
                // A 4 4 0 0 0 7 10.2
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 10.2f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
            // M7 15 a6.5 6.5 0 0 1 5 0 6.5 6.5 0 0 0 3.44 .44
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // a 6.5 6.5 0 0 1 5 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 0 0 3.44 0.44
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.44f,
                    dy1 = 0.44f,
                )
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _milkOff = it }
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
                imageVector = MilkOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _milkOff: ImageVector? = null
