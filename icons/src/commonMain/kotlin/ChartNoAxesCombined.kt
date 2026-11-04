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

val ChartNoAxesCombined: ImageVector
    get() {
        val current = _chartNoAxesCombined
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ChartNoAxesCombined",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 16 v5 m4 -6.36 V21 m4 -10.34 V21 m2 -18 -8.65 8.65 a.5 .5 0 0 1 -.7 0 l-3.3 -3.3 a.5 .5 0 0 0 -.7 0 L2 15 m2 3.46 V21 m4 -6.34 V21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 4 -6.36
                moveToRelative(dx = 4.0f, dy = -6.36f)
                // V 21
                verticalLineTo(y = 21.0f)
                // m 4 -10.34
                moveToRelative(dx = 4.0f, dy = -10.34f)
                // V 21
                verticalLineTo(y = 21.0f)
                // m 2 -18
                moveToRelative(dx = 2.0f, dy = -18.0f)
                // l -8.65 8.65
                lineToRelative(dx = -8.65f, dy = 8.65f)
                // a 0.5 0.5 0 0 1 -0.7 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 0.0f,
                )
                // l -3.3 -3.3
                lineToRelative(dx = -3.3f, dy = -3.3f)
                // a 0.5 0.5 0 0 0 -0.7 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.7f,
                    dy1 = 0.0f,
                )
                // L 2 15
                lineTo(x = 2.0f, y = 15.0f)
                // m 2 3.46
                moveToRelative(dx = 2.0f, dy = 3.46f)
                // V 21
                verticalLineTo(y = 21.0f)
                // m 4 -6.34
                moveToRelative(dx = 4.0f, dy = -6.34f)
                // V 21
                verticalLineTo(y = 21.0f)
            }
        }.build().also { _chartNoAxesCombined = it }
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
                imageVector = ChartNoAxesCombined,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chartNoAxesCombined: ImageVector? = null
