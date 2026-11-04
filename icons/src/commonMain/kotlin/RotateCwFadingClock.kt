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

val RotateCwFadingClock: ImageVector
    get() {
        val current = _rotateCwFadingClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.RotateCwFadingClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 a9.8 9.8 0 0 1 6.74 2.74 m0 0 L21 8 m0 0 V3 M7.5 19.8 a9 9 0 0 1 0 -15.6 m0 0 A9 9 0 0 1 12 3 m0 4 v5 l4 2 m-2 6.77 A9 9 0 0 1 12 21 m7 -3.34 a9 9 0 0 1 -1.5 1.45 M21 12 a9 9 0 0 1 -.23 2 M21 8 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // a 9.8 9.8 0 0 1 6.74 2.74
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.74f,
                    dy1 = 2.74f,
                )
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // L 21 8
                lineTo(x = 21.0f, y = 8.0f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // M 7.5 19.8
                moveTo(x = 7.5f, y = 19.8f)
                // a 9 9 0 0 1 0 -15.6
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -15.6f,
                )
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // A 9 9 0 0 1 12 3
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 3.0f,
                )
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l 4 2
                lineToRelative(dx = 4.0f, dy = 2.0f)
                // m -2 6.77
                moveToRelative(dx = -2.0f, dy = 6.77f)
                // A 9 9 0 0 1 12 21
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // m 7 -3.34
                moveToRelative(dx = 7.0f, dy = -3.34f)
                // a 9 9 0 0 1 -1.5 1.45
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 1.45f,
                )
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // a 9 9 0 0 1 -0.23 2
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.23f,
                    dy1 = 2.0f,
                )
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
        }.build().also { _rotateCwFadingClock = it }
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
                imageVector = RotateCwFadingClock,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rotateCwFadingClock: ImageVector? = null
