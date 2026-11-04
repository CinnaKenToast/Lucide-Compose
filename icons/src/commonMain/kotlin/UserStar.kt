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

val UserStar: ImageVector
    get() {
        val current = _userStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.UserStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16.05 12.62 a1 1 0 0 1 1.91 .02 l.74 1.45 a1 1 0 0 0 .73 .54 l1.64 .25 a1 1 0 0 1 .59 1.8 l-1.18 1.18 a1 1 0 0 0 -.28 .86 l.26 1.62 a1 1 0 0 1 -1.54 1.13 l-1.47 -.75 a1 1 0 0 0 -.9 0 l-1.47 .75 a1 1 0 0 1 -1.54 -1.13 l.26 -1.62 a1 1 0 0 0 -.29 -.86 l-1.15 -1.15 a1 1 0 0 1 .57 -1.83 l1.63 -.25 a1 1 0 0 0 .74 -.54z M8 15 H7 a4 4 0 0 0 -4 4 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.05 12.62
                moveTo(x = 16.05f, y = 12.62f)
                // a 1 1 0 0 1 1.91 0.02
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.91f,
                    dy1 = 0.02f,
                )
                // l 0.74 1.45
                lineToRelative(dx = 0.74f, dy = 1.45f)
                // a 1 1 0 0 0 0.73 0.54
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = 0.54f,
                )
                // l 1.64 0.25
                lineToRelative(dx = 1.64f, dy = 0.25f)
                // a 1 1 0 0 1 0.59 1.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = 1.8f,
                )
                // l -1.18 1.18
                lineToRelative(dx = -1.18f, dy = 1.18f)
                // a 1 1 0 0 0 -0.28 0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.28f,
                    dy1 = 0.86f,
                )
                // l 0.26 1.62
                lineToRelative(dx = 0.26f, dy = 1.62f)
                // a 1 1 0 0 1 -1.54 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.54f,
                    dy1 = 1.13f,
                )
                // l -1.47 -0.75
                lineToRelative(dx = -1.47f, dy = -0.75f)
                // a 1 1 0 0 0 -0.9 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 0.0f,
                )
                // l -1.47 0.75
                lineToRelative(dx = -1.47f, dy = 0.75f)
                // a 1 1 0 0 1 -1.54 -1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.54f,
                    dy1 = -1.13f,
                )
                // l 0.26 -1.62
                lineToRelative(dx = 0.26f, dy = -1.62f)
                // a 1 1 0 0 0 -0.29 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.29f,
                    dy1 = -0.86f,
                )
                // l -1.15 -1.15
                lineToRelative(dx = -1.15f, dy = -1.15f)
                // a 1 1 0 0 1 0.57 -1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.57f,
                    dy1 = -1.83f,
                )
                // l 1.63 -0.25
                lineToRelative(dx = 1.63f, dy = -0.25f)
                // a 1 1 0 0 0 0.74 -0.54z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = -0.54f,
                )
                close()
                // M 8 15
                moveTo(x = 8.0f, y = 15.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
            }
            // <circle cx="10.0" cy="7.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 7
                moveTo(x = 10.0f, y = 7.0f)
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
        }.build().also { _userStar = it }
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
                imageVector = UserStar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _userStar: ImageVector? = null
