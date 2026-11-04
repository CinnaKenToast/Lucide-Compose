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

val ParkingMeter: ImageVector
    get() {
        val current = _parkingMeter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ParkingMeter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 15 h2 m-1 -3 v3 m0 4 v3 m3.28 -3 a1 1 0 0 0 .95 -.68 l2.37 -6.99 a7 7 0 1 0 -13.2 0 l2.37 6.99 A1 1 0 0 0 8.72 19z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 15
                moveTo(x = 11.0f, y = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -1 -3
                moveToRelative(dx = -1.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 3.28 -3
                moveToRelative(dx = 3.28f, dy = -3.0f)
                // a 1 1 0 0 0 0.95 -0.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.95f,
                    dy1 = -0.68f,
                )
                // l 2.37 -6.99
                lineToRelative(dx = 2.37f, dy = -6.99f)
                // a 7 7 0 1 0 -13.2 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -13.2f,
                    dy1 = 0.0f,
                )
                // l 2.37 6.99
                lineToRelative(dx = 2.37f, dy = 6.99f)
                // A 1 1 0 0 0 8.72 19z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.72f,
                    y1 = 19.0f,
                )
                close()
            }
            // M9 9 a3 3 0 1 1 6 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _parkingMeter = it }
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
                imageVector = ParkingMeter,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _parkingMeter: ImageVector? = null
