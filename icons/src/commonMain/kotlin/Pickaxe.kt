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

val Pickaxe: ImageVector
    get() {
        val current = _pickaxe
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Pickaxe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 13 -8.38 8.38 a1 1 0 0 1 -3 -3 L11 10 m4.97 -5.97 A13 13 0 0 0 5.9 2.37 c-1.4 .35 -1.09 2.16 .28 2.6 A20 20 0 0 1 12 8 m4 4 a20 20 0 0 1 3.03 5.82 c.44 1.37 2.26 1.68 2.6 .28 A13 13 0 0 0 20 8.07
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 13
                moveTo(x = 14.0f, y = 13.0f)
                // l -8.38 8.38
                lineToRelative(dx = -8.38f, dy = 8.38f)
                // a 1 1 0 0 1 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // L 11 10
                lineTo(x = 11.0f, y = 10.0f)
                // m 4.97 -5.97
                moveToRelative(dx = 4.97f, dy = -5.97f)
                // A 13 13 0 0 0 5.9 2.37
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.9f,
                    y1 = 2.37f,
                )
                // c -1.4 0.35 -1.09 2.16 0.28 2.6
                curveToRelative(
                    dx1 = -1.4f,
                    dy1 = 0.35f,
                    dx2 = -1.09f,
                    dy2 = 2.16f,
                    dx3 = 0.28f,
                    dy3 = 2.6f,
                )
                // A 20 20 0 0 1 12 8
                arcTo(
                    horizontalEllipseRadius = 20.0f,
                    verticalEllipseRadius = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 8.0f,
                )
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // a 20 20 0 0 1 3.03 5.82
                arcToRelative(
                    a = 20.0f,
                    b = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.03f,
                    dy1 = 5.82f,
                )
                // c 0.44 1.37 2.26 1.68 2.6 0.28
                curveToRelative(
                    dx1 = 0.44f,
                    dy1 = 1.37f,
                    dx2 = 2.26f,
                    dy2 = 1.68f,
                    dx3 = 2.6f,
                    dy3 = 0.28f,
                )
                // A 13 13 0 0 0 20 8.07
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 8.07f,
                )
            }
            // M18.35 3.35 a1.2 1.2 0 0 0 -1.7 0 l-5.3 5.3 a1.2 1.2 0 0 0 0 1.7 l2.3 2.3 a1.2 1.2 0 0 0 1.7 0 l5.3 -5.3 a1.2 1.2 0 0 0 0 -1.7z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.35 3.35
                moveTo(x = 18.35f, y = 3.35f)
                // a 1.2 1.2 0 0 0 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -5.3 5.3
                lineToRelative(dx = -5.3f, dy = 5.3f)
                // a 1.2 1.2 0 0 0 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l 2.3 2.3
                lineToRelative(dx = 2.3f, dy = 2.3f)
                // a 1.2 1.2 0 0 0 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 5.3 -5.3
                lineToRelative(dx = 5.3f, dy = -5.3f)
                // a 1.2 1.2 0 0 0 0 -1.7z
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                close()
            }
        }.build().also { _pickaxe = it }
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
                imageVector = Pickaxe,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pickaxe: ImageVector? = null
