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

val ShipWheel: ImageVector
    get() {
        val current = _shipWheel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ShipWheel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="8.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 2 v7.5 M19 5 l-5.23 5.23 M22 12 h-7.5 m4.5 7 -5.23 -5.23 M12 14.5 V22 m-1.77 -8.23 L5 19 m4.5 -7 H2 m8.23 -1.77 L5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 7.5
                verticalLineToRelative(dy = 7.5f)
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
                // l -5.23 5.23
                lineToRelative(dx = -5.23f, dy = 5.23f)
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // h -7.5
                horizontalLineToRelative(dx = -7.5f)
                // m 4.5 7
                moveToRelative(dx = 4.5f, dy = 7.0f)
                // l -5.23 -5.23
                lineToRelative(dx = -5.23f, dy = -5.23f)
                // M 12 14.5
                moveTo(x = 12.0f, y = 14.5f)
                // V 22
                verticalLineTo(y = 22.0f)
                // m -1.77 -8.23
                moveToRelative(dx = -1.77f, dy = -8.23f)
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // m 4.5 -7
                moveToRelative(dx = 4.5f, dy = -7.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 8.23 -1.77
                moveToRelative(dx = 8.23f, dy = -1.77f)
                // L 5 5
                lineTo(x = 5.0f, y = 5.0f)
            }
            // <circle cx="12.0" cy="12.0" radius="2.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _shipWheel = it }
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
                imageVector = ShipWheel,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shipWheel: ImageVector? = null
