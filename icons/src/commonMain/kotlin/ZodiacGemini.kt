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

val ZodiacGemini: ImageVector
    get() {
        val current = _zodiacGemini
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ZodiacGemini",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 4.53 v14.94 M20 3 A17 17 0 0 1 4 3 m0 18 a17 17 0 0 1 16 0 M8 4.52 v14.95
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 4.53
                moveTo(x = 16.0f, y = 4.53f)
                // v 14.94
                verticalLineToRelative(dy = 14.94f)
                // M 20 3
                moveTo(x = 20.0f, y = 3.0f)
                // A 17 17 0 0 1 4 3
                arcTo(
                    horizontalEllipseRadius = 17.0f,
                    verticalEllipseRadius = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 3.0f,
                )
                // m 0 18
                moveToRelative(dx = 0.0f, dy = 18.0f)
                // a 17 17 0 0 1 16 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // M 8 4.52
                moveTo(x = 8.0f, y = 4.52f)
                // v 14.95
                verticalLineToRelative(dy = 14.95f)
            }
        }.build().also { _zodiacGemini = it }
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
                imageVector = ZodiacGemini,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _zodiacGemini: ImageVector? = null
