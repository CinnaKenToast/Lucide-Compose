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

val Church: ImageVector
    get() {
        val current = _church
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Church",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9 h4 m-2 -2 v5 m2 9 v-3 a2 2 0 0 0 -4 0 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 2 9
                moveToRelative(dx = 2.0f, dy = 9.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
            // m18 9 3.52 2.15 A1 1 0 0 1 22 12 v7 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 v-7 a1 1 0 0 1 .48 -.85 L6 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // l 3.52 2.15
                lineToRelative(dx = 3.52f, dy = 2.15f)
                // A 1 1 0 0 1 22 12
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 12.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 1 1 0 0 1 0.48 -0.85
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.48f,
                    dy1 = -0.85f,
                )
                // L 6 9
                lineTo(x = 6.0f, y = 9.0f)
            }
            // M6 21 V7 a1 1 0 0 1 .38 -.78 l5 -4 a1 1 0 0 1 1.25 0 l5 4 A1 1 0 0 1 18 7 v14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 21
                moveTo(x = 6.0f, y = 21.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 1 1 0 0 1 0.38 -0.78
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.38f,
                    dy1 = -0.78f,
                )
                // l 5 -4
                lineToRelative(dx = 5.0f, dy = -4.0f)
                // a 1 1 0 0 1 1.25 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.25f,
                    dy1 = 0.0f,
                )
                // l 5 4
                lineToRelative(dx = 5.0f, dy = 4.0f)
                // A 1 1 0 0 1 18 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 7.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
            }
        }.build().also { _church = it }
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
                imageVector = Church,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _church: ImageVector? = null
