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

val Radiation: ImageVector
    get() {
        val current = _radiation
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Radiation",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12z M14 15.46 a4 4 0 0 1 -4 0 l-2.47 4.29 a1 1 0 0 0 .46 1.41 10 10 0 0 0 8.02 0 1 1 0 0 0 .46 -1.41z M16 12 a4 4 0 0 0 -2 -3.46 l2.47 -4.29 a1 1 0 0 1 1.46 -.3 10 10 0 0 1 4 6.94 A1 1 0 0 1 21 12z m-8 0 a4 4 0 0 1 2 -3.46 L7.53 4.25 a1 1 0 0 0 -1.46 -.3 10 10 0 0 0 -4 6.94 A1 1 0 0 0 3 12z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12z
                moveTo(x = 12.0f, y = 12.0f)
                close()
                // M 14 15.46
                moveTo(x = 14.0f, y = 15.46f)
                // a 4 4 0 0 1 -4 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // l -2.47 4.29
                lineToRelative(dx = -2.47f, dy = 4.29f)
                // a 1 1 0 0 0 0.46 1.41
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.46f,
                    dy1 = 1.41f,
                )
                // a 10 10 0 0 0 8.02 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.02f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 0.46 -1.41z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.46f,
                    dy1 = -1.41f,
                )
                close()
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // a 4 4 0 0 0 -2 -3.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -3.46f,
                )
                // l 2.47 -4.29
                lineToRelative(dx = 2.47f, dy = -4.29f)
                // a 1 1 0 0 1 1.46 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.46f,
                    dy1 = -0.3f,
                )
                // a 10 10 0 0 1 4 6.94
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 6.94f,
                )
                // A 1 1 0 0 1 21 12z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 12.0f,
                )
                close()
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 4 4 0 0 1 2 -3.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -3.46f,
                )
                // L 7.53 4.25
                lineTo(x = 7.53f, y = 4.25f)
                // a 1 1 0 0 0 -1.46 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.46f,
                    dy1 = -0.3f,
                )
                // a 10 10 0 0 0 -4 6.94
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 6.94f,
                )
                // A 1 1 0 0 0 3 12z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 12.0f,
                )
                close()
            }
        }.build().also { _radiation = it }
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
                imageVector = Radiation,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _radiation: ImageVector? = null
