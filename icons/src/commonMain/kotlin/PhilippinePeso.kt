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

val PhilippinePeso: ImageVector
    get() {
        val current = _philippinePeso
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PhilippinePeso",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 12 h16 M4 8 h16 M6 20 V5 a1 1 0 0 1 1 -1 h5 a6 6 0 0 1 0 12 H6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 6 6 0 0 1 0 12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 12.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
            }
        }.build().also { _philippinePeso = it }
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
                imageVector = PhilippinePeso,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _philippinePeso: ImageVector? = null
