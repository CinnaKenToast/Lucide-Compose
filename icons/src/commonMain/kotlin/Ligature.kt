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

val Ligature: ImageVector
    get() {
        val current = _ligature
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Ligature",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 12 h2 v8 m-2 0 h4 M6 12 h4 m-4 8 h4 m-2 0 V8 a4 4 0 0 1 7.46 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 8
                moveToRelative(dx = -4.0f, dy = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 4 4 0 0 1 7.46 -2
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.46f,
                    dy1 = -2.0f,
                )
            }
        }.build().also { _ligature = it }
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
                imageVector = Ligature,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _ligature: ImageVector? = null
