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

val Bridge: ImageVector
    get() {
        val current = _bridge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Bridge",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9.73 V16 m4 -6.27 V16 m4 4 V4 m4 7 -4 -4 A7.5 7.5 0 0 1 6 7 l-4 4 m20 5 H2 m4 4 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9.73
                moveTo(x = 10.0f, y = 9.73f)
                // V 16
                verticalLineTo(y = 16.0f)
                // m 4 -6.27
                moveToRelative(dx = 4.0f, dy = -6.27f)
                // V 16
                verticalLineTo(y = 16.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // A 7.5 7.5 0 0 1 6 7
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 7.0f,
                )
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // m 20 5
                moveToRelative(dx = 20.0f, dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _bridge = it }
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
                imageVector = Bridge,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bridge: ImageVector? = null
