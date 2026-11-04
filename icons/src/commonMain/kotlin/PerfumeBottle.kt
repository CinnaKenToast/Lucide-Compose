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

val PerfumeBottle: ImageVector
    get() {
        val current = _perfumeBottle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PerfumeBottle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 22 h6.07 M15 5 c8 -1 8.33 7.68 5 9.54 m-4.2 -4.23 C14.78 9.46 14 8.5 14 7 M2 2z M2 7z M5 4.5z M8.13 22 A8 8 0 0 1 4 15 a3 3 0 0 1 .88 -2.12 C6.88 10.88 10 10 10 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // h 6.07
                horizontalLineToRelative(dx = 6.07f)
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // c 8 -1 8.33 7.68 5 9.54
                curveToRelative(
                    dx1 = 8.0f,
                    dy1 = -1.0f,
                    dx2 = 8.33f,
                    dy2 = 7.68f,
                    dx3 = 5.0f,
                    dy3 = 9.54f,
                )
                // m -4.2 -4.23
                moveToRelative(dx = -4.2f, dy = -4.23f)
                // C 14.78 9.46 14 8.5 14 7
                curveTo(
                    x1 = 14.78f,
                    y1 = 9.46f,
                    x2 = 14.0f,
                    y2 = 8.5f,
                    x3 = 14.0f,
                    y3 = 7.0f,
                )
                // M 2 2z
                moveTo(x = 2.0f, y = 2.0f)
                close()
                // M 2 7z
                moveTo(x = 2.0f, y = 7.0f)
                close()
                // M 5 4.5z
                moveTo(x = 5.0f, y = 4.5f)
                close()
                // M 8.13 22
                moveTo(x = 8.13f, y = 22.0f)
                // A 8 8 0 0 1 4 15
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 15.0f,
                )
                // a 3 3 0 0 1 0.88 -2.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.88f,
                    dy1 = -2.12f,
                )
                // C 6.88 10.88 10 10 10 7
                curveTo(
                    x1 = 6.88f,
                    y1 = 10.88f,
                    x2 = 10.0f,
                    y2 = 10.0f,
                    x3 = 10.0f,
                    y3 = 7.0f,
                )
            }
            // <circle cx="18.0" cy="18.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
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
            // <rect width="6" height="5" rx="1.0" x="9.0" y="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _perfumeBottle = it }
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
                imageVector = PerfumeBottle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _perfumeBottle: ImageVector? = null
