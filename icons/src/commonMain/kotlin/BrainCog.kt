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

val BrainCog: ImageVector
    get() {
        val current = _brainCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BrainCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.85 14.77 -.38 .93 m.38 -6.47 L10.47 8.3 m2.68 6.47 .38 .93 m0 -7.4 -.38 .93 m1.62 1.62 .93 -.38 m-.93 2.68 .93 .38 m2.3 -8.4 a4 4 0 0 1 2.52 5.77
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.85 14.77
                moveTo(x = 10.85f, y = 14.77f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // m 0.38 -6.47
                moveToRelative(dx = 0.38f, dy = -6.47f)
                // L 10.47 8.3
                lineTo(x = 10.47f, y = 8.3f)
                // m 2.68 6.47
                moveToRelative(dx = 2.68f, dy = 6.47f)
                // l 0.38 0.93
                lineToRelative(dx = 0.38f, dy = 0.93f)
                // m 0 -7.4
                moveToRelative(dx = 0.0f, dy = -7.4f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // m 1.62 1.62
                moveToRelative(dx = 1.62f, dy = 1.62f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m -0.93 2.68
                moveToRelative(dx = -0.93f, dy = 2.68f)
                // l 0.93 0.38
                lineToRelative(dx = 0.93f, dy = 0.38f)
                // m 2.3 -8.4
                moveToRelative(dx = 2.3f, dy = -8.4f)
                // a 4 4 0 0 1 2.52 5.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.52f,
                    dy1 = 5.77f,
                )
            }
            // M18 18 a4 4 0 0 0 2 -7.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // a 4 4 0 0 0 2 -7.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -7.46f,
                )
            }
            // M4.03 17.48 A4 4 0 0 0 11.46 20 c.18 -.31 .9 -.31 1.08 0 a4 4 0 0 0 7.43 -2.52
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.03 17.48
                moveTo(x = 4.03f, y = 17.48f)
                // A 4 4 0 0 0 11.46 20
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.46f,
                    y1 = 20.0f,
                )
                // c 0.18 -0.31 0.9 -0.31 1.08 0
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = -0.31f,
                    dx2 = 0.9f,
                    dy2 = -0.31f,
                    dx3 = 1.08f,
                    dy3 = 0.0f,
                )
                // a 4 4 0 0 0 7.43 -2.52
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.43f,
                    dy1 = -2.52f,
                )
            }
            // M6 18 a4 4 0 0 1 -2 -7.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // a 4 4 0 0 1 -2 -7.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -7.46f,
                )
            }
            // M6 5.13 a4 4 0 0 0 -2.52 5.77
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 5.13
                moveTo(x = 6.0f, y = 5.13f)
                // a 4 4 0 0 0 -2.52 5.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.52f,
                    dy1 = 5.77f,
                )
            }
            // M6.3 6.3 A3 3 0 0 1 6 5.2 V5.13 a3 3 0 0 1 5.97 -.55 q.07 .02 .06 0 A3 3 0 0 1 18 5.12 V5.2 a3 3 0 0 1 -.3 1.1 m-8.47 4.55 L8.3 10.47 m.93 2.68 L8.3 13.53
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.3 6.3
                moveTo(x = 6.3f, y = 6.3f)
                // A 3 3 0 0 1 6 5.2
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 5.2f,
                )
                // V 5.13
                verticalLineTo(y = 5.13f)
                // a 3 3 0 0 1 5.97 -0.55
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.97f,
                    dy1 = -0.55f,
                )
                // q 0.07 0.02 0.06 0
                quadToRelative(
                    dx1 = 0.07f,
                    dy1 = 0.02f,
                    dx2 = 0.06f,
                    dy2 = 0.0f,
                )
                // A 3 3 0 0 1 18 5.12
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 5.12f,
                )
                // V 5.2
                verticalLineTo(y = 5.2f)
                // a 3 3 0 0 1 -0.3 1.1
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.3f,
                    dy1 = 1.1f,
                )
                // m -8.47 4.55
                moveToRelative(dx = -8.47f, dy = 4.55f)
                // L 8.3 10.47
                lineTo(x = 8.3f, y = 10.47f)
                // m 0.93 2.68
                moveToRelative(dx = 0.93f, dy = 2.68f)
                // L 8.3 13.53
                lineTo(x = 8.3f, y = 13.53f)
            }
            // <circle cx="12.0" cy="12.0" radius="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _brainCog = it }
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
                imageVector = BrainCog,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brainCog: ImageVector? = null
