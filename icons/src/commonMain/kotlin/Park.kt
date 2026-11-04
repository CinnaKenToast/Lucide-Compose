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

val Park: ImageVector
    get() {
        val current = _park
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Park",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 h10 m-8.75 -8 a4.5 4.5 0 0 0 -1.5 -1.4 V8 a1 1 0 0 0 -7.5 0 4.9 4.9 0 0 0 2.25 9 H8 m7 -3 -2 6 m6 -6 2 6 m0 -6 h-8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m -8.75 -8
                moveToRelative(dx = -8.75f, dy = -8.0f)
                // a 4.5 4.5 0 0 0 -1.5 -1.4
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = -1.4f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 -7.5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.5f,
                    dy1 = 0.0f,
                )
                // a 4.9 4.9 0 0 0 2.25 9
                arcToRelative(
                    a = 4.9f,
                    b = 4.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.25f,
                    dy1 = 9.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 7 -3
                moveToRelative(dx = 7.0f, dy = -3.0f)
                // l -2 6
                lineToRelative(dx = -2.0f, dy = 6.0f)
                // m 6 -6
                moveToRelative(dx = 6.0f, dy = -6.0f)
                // l 2 6
                lineToRelative(dx = 2.0f, dy = 6.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
            }
            // M8 20 v-5.92 a2 2 0 0 0 -.59 -1.42 L6.5 11.75 m2.7 1.05 L8 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 20
                moveTo(x = 8.0f, y = 20.0f)
                // v -5.92
                verticalLineToRelative(dy = -5.92f)
                // a 2 2 0 0 0 -0.59 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -1.42f,
                )
                // L 6.5 11.75
                lineTo(x = 6.5f, y = 11.75f)
                // m 2.7 1.05
                moveToRelative(dx = 2.7f, dy = 1.05f)
                // L 8 14
                lineTo(x = 8.0f, y = 14.0f)
            }
            // <circle cx="19.0" cy="6.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 6
                moveTo(x = 19.0f, y = 6.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _park = it }
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
                imageVector = Park,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _park: ImageVector? = null
