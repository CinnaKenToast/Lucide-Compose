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

val RefreshCcw: ImageVector
    get() {
        val current = _refreshCcw
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.RefreshCcw",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 12 a9 9 0 0 0 -9 -9 9.8 9.8 0 0 0 -6.74 2.74 L3 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // a 9 9 0 0 0 -9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.0f,
                    dy1 = -9.0f,
                )
                // a 9.8 9.8 0 0 0 -6.74 2.74
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.74f,
                    dy1 = 2.74f,
                )
                // L 3 8
                lineTo(x = 3.0f, y = 8.0f)
            }
            // M3 3 v5 h5 m-5 4 a9 9 0 0 0 9 9 9.8 9.8 0 0 0 6.74 -2.74 L21 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m -5 4
                moveToRelative(dx = -5.0f, dy = 4.0f)
                // a 9 9 0 0 0 9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = 9.0f,
                )
                // a 9.8 9.8 0 0 0 6.74 -2.74
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.74f,
                    dy1 = -2.74f,
                )
                // L 21 16
                lineTo(x = 21.0f, y = 16.0f)
            }
            // M16 16 h5 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _refreshCcw = it }
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
                imageVector = RefreshCcw,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _refreshCcw: ImageVector? = null
