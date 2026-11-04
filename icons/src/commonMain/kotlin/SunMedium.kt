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

val SunMedium: ImageVector
    get() {
        val current = _sunMedium
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.SunMedium",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 3 v1 m0 16 v1 m-9 -9 h1 m16 0 h1 m-2.64 -6.36 -.7 .7 M6.34 17.66 l-.7 .7 m0 -12.72 .7 .7 m11.32 11.32 .7 .7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m -9 -9
                moveToRelative(dx = -9.0f, dy = -9.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -2.64 -6.36
                moveToRelative(dx = -2.64f, dy = -6.36f)
                // l -0.7 0.7
                lineToRelative(dx = -0.7f, dy = 0.7f)
                // M 6.34 17.66
                moveTo(x = 6.34f, y = 17.66f)
                // l -0.7 0.7
                lineToRelative(dx = -0.7f, dy = 0.7f)
                // m 0 -12.72
                moveToRelative(dx = 0.0f, dy = -12.72f)
                // l 0.7 0.7
                lineToRelative(dx = 0.7f, dy = 0.7f)
                // m 11.32 11.32
                moveToRelative(dx = 11.32f, dy = 11.32f)
                // l 0.7 0.7
                lineToRelative(dx = 0.7f, dy = 0.7f)
            }
        }.build().also { _sunMedium = it }
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
                imageVector = SunMedium,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sunMedium: ImageVector? = null
