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

val ArrowUpZA: ImageVector
    get() {
        val current = _arrowUpZA
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ArrowUpZA",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m3 8 4 -4 4 4 M7 4 v16 m8 -16 h5 l-5 6 h5 m-5 10 v-3.5 a2.5 2.5 0 0 1 5 0 V20 m0 -2 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 8 -16
                moveToRelative(dx = 8.0f, dy = -16.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // l -5 6
                lineToRelative(dx = -5.0f, dy = 6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m -5 10
                moveToRelative(dx = -5.0f, dy = 10.0f)
                // v -3.5
                verticalLineToRelative(dy = -3.5f)
                // a 2.5 2.5 0 0 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
        }.build().also { _arrowUpZA = it }
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
                imageVector = ArrowUpZA,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowUpZA: ImageVector? = null
