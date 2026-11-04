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

val PilcrowLeft: ImageVector
    get() {
        val current = _pilcrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PilcrowLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 3 v11 m0 -5 h-3 a3 3 0 0 1 0 -6 h9 m-2 0 v11 m4 4 H2 l4 -4 m0 8 -4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 3
                moveTo(x = 14.0f, y = 3.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 3 3 0 0 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
            }
        }.build().also { _pilcrowLeft = it }
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
                imageVector = PilcrowLeft,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pilcrowLeft: ImageVector? = null
