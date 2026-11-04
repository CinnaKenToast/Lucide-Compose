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

val ZodiacAquarius: ImageVector
    get() {
        val current = _zodiacAquarius
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ZodiacAquarius",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 10 2.46 -3.68 a.7 .7 0 0 1 1.1 -.02 l2.4 3.42 a.7 .7 0 0 0 1.09 0 l2.4 -3.44 a.7 .7 0 0 1 1.1 0 l2.4 3.43 a.7 .7 0 0 0 1.1 0 l2.39 -3.4 a.7 .7 0 0 1 1.1 0 L22 10 M2 18 l2.46 -3.68 a.7 .7 0 0 1 1.1 -.02 l2.4 3.42 a.7 .7 0 0 0 1.09 0 l2.4 -3.43 a.7 .7 0 0 1 1.1 0 l2.4 3.43 a.7 .7 0 0 0 1.1 0 l2.39 -3.42 a.7 .7 0 0 1 1.1 .02 L22 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // l 2.46 -3.68
                lineToRelative(dx = 2.46f, dy = -3.68f)
                // a 0.7 0.7 0 0 1 1.1 -0.02
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = -0.02f,
                )
                // l 2.4 3.42
                lineToRelative(dx = 2.4f, dy = 3.42f)
                // a 0.7 0.7 0 0 0 1.09 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.09f,
                    dy1 = 0.0f,
                )
                // l 2.4 -3.44
                lineToRelative(dx = 2.4f, dy = -3.44f)
                // a 0.7 0.7 0 0 1 1.1 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // l 2.4 3.43
                lineToRelative(dx = 2.4f, dy = 3.43f)
                // a 0.7 0.7 0 0 0 1.1 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // l 2.39 -3.4
                lineToRelative(dx = 2.39f, dy = -3.4f)
                // a 0.7 0.7 0 0 1 1.1 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // L 22 10
                lineTo(x = 22.0f, y = 10.0f)
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // l 2.46 -3.68
                lineToRelative(dx = 2.46f, dy = -3.68f)
                // a 0.7 0.7 0 0 1 1.1 -0.02
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = -0.02f,
                )
                // l 2.4 3.42
                lineToRelative(dx = 2.4f, dy = 3.42f)
                // a 0.7 0.7 0 0 0 1.09 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.09f,
                    dy1 = 0.0f,
                )
                // l 2.4 -3.43
                lineToRelative(dx = 2.4f, dy = -3.43f)
                // a 0.7 0.7 0 0 1 1.1 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // l 2.4 3.43
                lineToRelative(dx = 2.4f, dy = 3.43f)
                // a 0.7 0.7 0 0 0 1.1 0
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // l 2.39 -3.42
                lineToRelative(dx = 2.39f, dy = -3.42f)
                // a 0.7 0.7 0 0 1 1.1 0.02
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.02f,
                )
                // L 22 18
                lineTo(x = 22.0f, y = 18.0f)
            }
        }.build().also { _zodiacAquarius = it }
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
                imageVector = ZodiacAquarius,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _zodiacAquarius: ImageVector? = null
