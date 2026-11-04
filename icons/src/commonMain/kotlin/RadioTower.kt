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

val RadioTower: ImageVector
    get() {
        val current = _radioTower
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.RadioTower",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4.9 16.1 C1 12.2 1 5.8 4.9 1.9 m2.9 2.8 A6.14 6.14 0 0 0 7 12.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.9 16.1
                moveTo(x = 4.9f, y = 16.1f)
                // C 1 12.2 1 5.8 4.9 1.9
                curveTo(
                    x1 = 1.0f,
                    y1 = 12.2f,
                    x2 = 1.0f,
                    y2 = 5.8f,
                    x3 = 4.9f,
                    y3 = 1.9f,
                )
                // m 2.9 2.8
                moveToRelative(dx = 2.9f, dy = 2.8f)
                // A 6.14 6.14 0 0 0 7 12.2
                arcTo(
                    horizontalEllipseRadius = 6.14f,
                    verticalEllipseRadius = 6.14f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 12.2f,
                )
            }
            // <circle cx="12.0" cy="9.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
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
            // M16.2 4.8 c2 2 2.26 5.11 .8 7.47 M19.1 1.9 a9.96 9.96 0 0 1 0 14.1 m-9.6 2 h5 M8 22 l4 -11 4 11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.2 4.8
                moveTo(x = 16.2f, y = 4.8f)
                // c 2 2 2.26 5.11 0.8 7.47
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.26f,
                    dy2 = 5.11f,
                    dx3 = 0.8f,
                    dy3 = 7.47f,
                )
                // M 19.1 1.9
                moveTo(x = 19.1f, y = 1.9f)
                // a 9.96 9.96 0 0 1 0 14.1
                arcToRelative(
                    a = 9.96f,
                    b = 9.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 14.1f,
                )
                // m -9.6 2
                moveToRelative(dx = -9.6f, dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // l 4 -11
                lineToRelative(dx = 4.0f, dy = -11.0f)
                // l 4 11
                lineToRelative(dx = 4.0f, dy = 11.0f)
            }
        }.build().also { _radioTower = it }
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
                imageVector = RadioTower,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _radioTower: ImageVector? = null
