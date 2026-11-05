package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserKey: ImageVector
    get() {
        val current = _userKey
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserKey",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 11 v6 m0 -4 h2 M3 21 v-2 a4 4 0 0 1 4 -4 h6 a4 4 0 0 1 2.07 .58
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 4 4 0 0 1 2.07 0.58
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.07f,
                    dy1 = 0.58f,
                )
            }
            // <circle cx="10.0" cy="7.0" radius="4.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
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
            // <circle cx="20.0" cy="19.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 19
                moveTo(x = 20.0f, y = 19.0f)
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
        }.build().also { _userKey = it }
    }

@Suppress("ObjectPropertyName")
private var _userKey: ImageVector? = null
