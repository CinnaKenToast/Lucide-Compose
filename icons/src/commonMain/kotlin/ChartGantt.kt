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

val ChartGantt: ImageVector
    get() {
        val current = _chartGantt
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ChartGantt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 6 h8 m-6 10 h6 M3 3 v16 a2 2 0 0 0 2 2 h16 M8 11 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 6
                moveTo(x = 10.0f, y = 6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -6 10
                moveToRelative(dx = -6.0f, dy = 10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 8 11
                moveTo(x = 8.0f, y = 11.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _chartGantt = it }
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
                imageVector = ChartGantt,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chartGantt: ImageVector? = null
