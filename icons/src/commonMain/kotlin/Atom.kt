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

val Atom: ImageVector
    get() {
        val current = _atom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Atom",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="1.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20.2 20.2 c2.04 -2.03 .02 -7.36 -4.5 -11.9 -4.54 -4.52 -9.87 -6.54 -11.9 -4.5 -2.04 2.03 -.02 7.36 4.5 11.9 4.54 4.52 9.87 6.54 11.9 4.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.2 20.2
                moveTo(x = 20.2f, y = 20.2f)
                // c 2.04 -2.03 0.02 -7.36 -4.5 -11.9
                curveToRelative(
                    dx1 = 2.04f,
                    dy1 = -2.03f,
                    dx2 = 0.02f,
                    dy2 = -7.36f,
                    dx3 = -4.5f,
                    dy3 = -11.9f,
                )
                // c -4.54 -4.52 -9.87 -6.54 -11.9 -4.5
                curveToRelative(
                    dx1 = -4.54f,
                    dy1 = -4.52f,
                    dx2 = -9.87f,
                    dy2 = -6.54f,
                    dx3 = -11.9f,
                    dy3 = -4.5f,
                )
                // c -2.04 2.03 -0.02 7.36 4.5 11.9
                curveToRelative(
                    dx1 = -2.04f,
                    dy1 = 2.03f,
                    dx2 = -0.02f,
                    dy2 = 7.36f,
                    dx3 = 4.5f,
                    dy3 = 11.9f,
                )
                // c 4.54 4.52 9.87 6.54 11.9 4.5
                curveToRelative(
                    dx1 = 4.54f,
                    dy1 = 4.52f,
                    dx2 = 9.87f,
                    dy2 = 6.54f,
                    dx3 = 11.9f,
                    dy3 = 4.5f,
                )
            }
            // M15.7 15.7 c4.52 -4.54 6.54 -9.87 4.5 -11.9 -2.03 -2.04 -7.36 -.02 -11.9 4.5 -4.52 4.54 -6.54 9.87 -4.5 11.9 2.03 2.04 7.36 .02 11.9 -4.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.7 15.7
                moveTo(x = 15.7f, y = 15.7f)
                // c 4.52 -4.54 6.54 -9.87 4.5 -11.9
                curveToRelative(
                    dx1 = 4.52f,
                    dy1 = -4.54f,
                    dx2 = 6.54f,
                    dy2 = -9.87f,
                    dx3 = 4.5f,
                    dy3 = -11.9f,
                )
                // c -2.03 -2.04 -7.36 -0.02 -11.9 4.5
                curveToRelative(
                    dx1 = -2.03f,
                    dy1 = -2.04f,
                    dx2 = -7.36f,
                    dy2 = -0.02f,
                    dx3 = -11.9f,
                    dy3 = 4.5f,
                )
                // c -4.52 4.54 -6.54 9.87 -4.5 11.9
                curveToRelative(
                    dx1 = -4.52f,
                    dy1 = 4.54f,
                    dx2 = -6.54f,
                    dy2 = 9.87f,
                    dx3 = -4.5f,
                    dy3 = 11.9f,
                )
                // c 2.03 2.04 7.36 0.02 11.9 -4.5
                curveToRelative(
                    dx1 = 2.03f,
                    dy1 = 2.04f,
                    dx2 = 7.36f,
                    dy2 = 0.02f,
                    dx3 = 11.9f,
                    dy3 = -4.5f,
                )
            }
        }.build().also { _atom = it }
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
                imageVector = Atom,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _atom: ImageVector? = null
