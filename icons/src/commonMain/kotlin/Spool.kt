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

val Spool: ImageVector
    get() {
        val current = _spool
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Spool",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 13.44 4.44 17.08 A2 2 0 0 0 4.98 21 H19 a2 2 0 0 0 .56 -3.92 l-1.12 -.32 A2 2 0 0 1 17 14.84 V7.66
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 13.44
                moveTo(x = 17.0f, y = 13.44f)
                // L 4.44 17.08
                lineTo(x = 4.44f, y = 17.08f)
                // A 2 2 0 0 0 4.98 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.98f,
                    y1 = 21.0f,
                )
                // H 19
                horizontalLineTo(x = 19.0f)
                // a 2 2 0 0 0 0.56 -3.92
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.56f,
                    dy1 = -3.92f,
                )
                // l -1.12 -0.32
                lineToRelative(dx = -1.12f, dy = -0.32f)
                // A 2 2 0 0 1 17 14.84
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 14.84f,
                )
                // V 7.66
                verticalLineTo(y = 7.66f)
            }
            // m7 10.56 12.56 -3.64 A2 2 0 0 0 19.02 3 H5 a2 2 0 0 0 -.56 3.92 l1.12 .32 A2 2 0 0 1 7 9.16 v7.18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 10.56
                moveTo(x = 7.0f, y = 10.56f)
                // l 12.56 -3.64
                lineToRelative(dx = 12.56f, dy = -3.64f)
                // A 2 2 0 0 0 19.02 3
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.02f,
                    y1 = 3.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -0.56 3.92
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.56f,
                    dy1 = 3.92f,
                )
                // l 1.12 0.32
                lineToRelative(dx = 1.12f, dy = 0.32f)
                // A 2 2 0 0 1 7 9.16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 9.16f,
                )
                // v 7.18
                verticalLineToRelative(dy = 7.18f)
            }
        }.build().also { _spool = it }
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
                imageVector = Spool,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _spool: ImageVector? = null
