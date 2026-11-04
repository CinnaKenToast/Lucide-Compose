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

val SavePen: ImageVector
    get() {
        val current = _savePen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SavePen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.33 13 H8 a1 1 0 0 0 -1 1 v7 m7.36 -3.37 a2 2 0 0 0 -.5 .86 l-.84 2.87 a.5 .5 0 0 0 .62 .62 l2.87 -.84 a2 2 0 0 0 .85 -.5 l4.02 -4.01 a1 1 0 1 0 -3 -3z M7 3 v4 a1 1 0 0 0 1 1 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.33 13
                moveTo(x = 13.33f, y = 13.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 7.36 -3.37
                moveToRelative(dx = 7.36f, dy = -3.37f)
                // a 2 2 0 0 0 -0.5 0.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 0.86f,
                )
                // l -0.84 2.87
                lineToRelative(dx = -0.84f, dy = 2.87f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // l 2.87 -0.84
                lineToRelative(dx = 2.87f, dy = -0.84f)
                // a 2 2 0 0 0 0.85 -0.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.85f,
                    dy1 = -0.5f,
                )
                // l 4.02 -4.01
                lineToRelative(dx = 4.02f, dy = -4.01f)
                // a 1 1 0 1 0 -3 -3z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                close()
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
            // M9 21 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h10.2 a2 2 0 0 1 1.4 .6 l3.8 3.8 A2 2 0 0 1 21 8.8 v.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 10.2
                horizontalLineToRelative(dx = 10.2f)
                // a 2 2 0 0 1 1.4 0.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.6f,
                )
                // l 3.8 3.8
                lineToRelative(dx = 3.8f, dy = 3.8f)
                // A 2 2 0 0 1 21 8.8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 8.8f,
                )
                // v 0.3
                verticalLineToRelative(dy = 0.3f)
            }
        }.build().also { _savePen = it }
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
                imageVector = SavePen,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _savePen: ImageVector? = null
