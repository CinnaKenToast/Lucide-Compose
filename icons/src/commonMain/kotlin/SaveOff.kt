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

val SaveOff: ImageVector
    get() {
        val current = _saveOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SaveOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 13 H8 a1 1 0 0 0 -1 1 v7 m7 -13 h1 m2 13 v-4 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 13
                moveTo(x = 13.0f, y = 13.0f)
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
                // m 7 -13
                moveToRelative(dx = 7.0f, dy = -13.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 2 13
                moveToRelative(dx = 2.0f, dy = 13.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M20.41 20.41 A2 2 0 0 1 19 21 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 .59 -1.41 M9 3 h6.2 a2 2 0 0 1 1.4 .6 l3.8 3.8 A2 2 0 0 1 21 8.8 V15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.41 20.41
                moveTo(x = 20.41f, y = 20.41f)
                // A 2 2 0 0 1 19 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 21.0f,
                )
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
                // a 2 2 0 0 1 0.59 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.41f,
                )
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // h 6.2
                horizontalLineToRelative(dx = 6.2f)
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
                // V 15
                verticalLineTo(y = 15.0f)
            }
        }.build().also { _saveOff = it }
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
                imageVector = SaveOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _saveOff: ImageVector? = null
