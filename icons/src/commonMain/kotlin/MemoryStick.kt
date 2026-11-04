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

val MemoryStick: ImageVector
    get() {
        val current = _memoryStick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MemoryStick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 v-2 m0 8 v-2 m4 -4 v-2 m0 8 v-2 M2 11 h1.5 M20 18 v-2 m.5 -5 H22 M4 18 v-2 m4 -4 v-2 m0 8 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 2 11
                moveTo(x = 2.0f, y = 11.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // M 20 18
                moveTo(x = 20.0f, y = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0.5 -5
                moveToRelative(dx = 0.5f, dy = -5.0f)
                // H 22
                horizontalLineTo(x = 22.0f)
                // M 4 18
                moveTo(x = 4.0f, y = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
            // <rect width="20" height="10" rx="2.0" x="2.0" y="6.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _memoryStick = it }
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
                imageVector = MemoryStick,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _memoryStick: ImageVector? = null
