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

val UserShield: ImageVector
    get() {
        val current = _userShield
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.UserShield",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 15 H6 a4 4 0 0 0 -4 4 v2 m20 -3.5 c0 2.5 -1.75 3.75 -3.83 4.47 a.5 .5 0 0 1 -.33 0 C15.75 21.25 14 20 14 17.5 V14 a.5 .5 0 0 1 .5 -.5 c1 0 2.25 -.6 3.12 -1.36 a.6 .6 0 0 1 .76 0 5.3 5.3 0 0 0 3.12 1.36 A.5 .5 0 0 1 22 14z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 15
                moveTo(x = 10.0f, y = 15.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 20 -3.5
                moveToRelative(dx = 20.0f, dy = -3.5f)
                // c 0 2.5 -1.75 3.75 -3.83 4.47
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.5f,
                    dx2 = -1.75f,
                    dy2 = 3.75f,
                    dx3 = -3.83f,
                    dy3 = 4.47f,
                )
                // a 0.5 0.5 0 0 1 -0.33 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.33f,
                    dy1 = 0.0f,
                )
                // C 15.75 21.25 14 20 14 17.5
                curveTo(
                    x1 = 15.75f,
                    y1 = 21.25f,
                    x2 = 14.0f,
                    y2 = 20.0f,
                    x3 = 14.0f,
                    y3 = 17.5f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // a 0.5 0.5 0 0 1 0.5 -0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = -0.5f,
                )
                // c 1 0 2.25 -0.6 3.12 -1.36
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.25f,
                    dy2 = -0.6f,
                    dx3 = 3.12f,
                    dy3 = -1.36f,
                )
                // a 0.6 0.6 0 0 1 0.76 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.76f,
                    dy1 = 0.0f,
                )
                // a 5.3 5.3 0 0 0 3.12 1.36
                arcToRelative(
                    a = 5.3f,
                    b = 5.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.12f,
                    dy1 = 1.36f,
                )
                // A 0.5 0.5 0 0 1 22 14z
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                close()
            }
            // <circle cx="9.0" cy="7.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
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
        }.build().also { _userShield = it }
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
                imageVector = UserShield,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _userShield: ImageVector? = null
