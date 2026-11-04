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

val SquareDashedBottomCode: ImageVector
    get() {
        val current = _squareDashedBottomCode
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SquareDashedBottomCode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9.5 8 12 l2 2.5 m4 6.5 h1 M14 9.5 l2 2.5 -2 2.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9.5
                moveTo(x = 10.0f, y = 9.5f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // l 2 2.5
                lineToRelative(dx = 2.0f, dy = 2.5f)
                // m 4 6.5
                moveToRelative(dx = 4.0f, dy = 6.5f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 14 9.5
                moveTo(x = 14.0f, y = 9.5f)
                // l 2 2.5
                lineToRelative(dx = 2.0f, dy = 2.5f)
                // l -2 2.5
                lineToRelative(dx = -2.0f, dy = 2.5f)
            }
            // M5 21 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h14 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 M9 21 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _squareDashedBottomCode = it }
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
                imageVector = SquareDashedBottomCode,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _squareDashedBottomCode: ImageVector? = null
