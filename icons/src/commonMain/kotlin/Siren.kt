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

val Siren: ImageVector
    get() {
        val current = _siren
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Siren",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 18 v-6 a5 5 0 1 1 10 0 v6 M5 21 a1 1 0 0 0 1 1 h12 a1 1 0 0 0 1 -1 v-1 a2 2 0 0 0 -2 -2 H7 a2 2 0 0 0 -2 2z m16 -9 h1 m-3.5 -7.5 L18 5 M2 12 h1 m9 -10 v1 M4.93 4.93 l.7 .7 M12 12 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 0 -2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 16 -9
                moveToRelative(dx = 16.0f, dy = -9.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -3.5 -7.5
                moveToRelative(dx = -3.5f, dy = -7.5f)
                // L 18 5
                lineTo(x = 18.0f, y = 5.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 9 -10
                moveToRelative(dx = 9.0f, dy = -10.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // l 0.7 0.7
                lineToRelative(dx = 0.7f, dy = 0.7f)
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _siren = it }
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
                imageVector = Siren,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _siren: ImageVector? = null
