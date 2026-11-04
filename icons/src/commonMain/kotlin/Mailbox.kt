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

val Mailbox: ImageVector
    get() {
        val current = _mailbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Mailbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 17 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 V9.5 C2 7 4 5 6.5 5 H18 c2.2 0 4 1.8 4 4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 9.5
                verticalLineTo(y = 9.5f)
                // C 2 7 4 5 6.5 5
                curveTo(
                    x1 = 2.0f,
                    y1 = 7.0f,
                    x2 = 4.0f,
                    y2 = 5.0f,
                    x3 = 6.5f,
                    y3 = 5.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // c 2.2 0 4 1.8 4 4z
                curveToRelative(
                    dx1 = 2.2f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.8f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // <polyline points="15.0 9.0 18.0 9.0 18.0 11.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // L 18 9
                lineTo(x = 18.0f, y = 9.0f)
                // L 18 11
                lineTo(x = 18.0f, y = 11.0f)
            }
            // M6.5 5 C9 5 11 7 11 9.5 V17 a2 2 0 0 1 -2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.5 5
                moveTo(x = 6.5f, y = 5.0f)
                // C 9 5 11 7 11 9.5
                curveTo(
                    x1 = 9.0f,
                    y1 = 5.0f,
                    x2 = 11.0f,
                    y2 = 7.0f,
                    x3 = 11.0f,
                    y3 = 9.5f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
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
            }
            // <line x1="6.0" y1="10.0" x2="7.0" y2="10.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 10
                moveTo(x = 6.0f, y = 10.0f)
                // L 7 10
                lineTo(x = 7.0f, y = 10.0f)
            }
        }.build().also { _mailbox = it }
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
                imageVector = Mailbox,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mailbox: ImageVector? = null
