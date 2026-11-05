package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserLock: ImageVector
    get() {
        val current = _userLock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserLock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 16 v-2 a2 2 0 0 0 -4 0 v2 m-5.5 -1 H7 a4 4 0 0 0 -4 4 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 16
                moveTo(x = 19.0f, y = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -5.5 -1
                moveToRelative(dx = -5.5f, dy = -1.0f)
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
            // <rect width="8" height="5" rx="0.899" x="13.0" y="16.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 16.899
                moveTo(x = 13.0f, y = 16.899f)
                // a 0.899 0.899 0 0 1 0.899 -0.899
                arcToRelative(
                    a = 0.899f,
                    b = 0.899f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.899f,
                    dy1 = -0.899f,
                )
                // h 6.202
                horizontalLineToRelative(dx = 6.202f)
                // a 0.899 0.899 0 0 1 0.899 0.899
                arcToRelative(
                    a = 0.899f,
                    b = 0.899f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.899f,
                    dy1 = 0.899f,
                )
                // v 3.202
                verticalLineToRelative(dy = 3.202f)
                // a 0.899 0.899 0 0 1 -0.899 0.899
                arcToRelative(
                    a = 0.899f,
                    b = 0.899f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.899f,
                    dy1 = 0.899f,
                )
                // h -6.202
                horizontalLineToRelative(dx = -6.202f)
                // a 0.899 0.899 0 0 1 -0.899 -0.899z
                arcToRelative(
                    a = 0.899f,
                    b = 0.899f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.899f,
                    dy1 = -0.899f,
                )
                close()
            }
        }.build().also { _userLock = it }
    }

@Suppress("ObjectPropertyName")
private var _userLock: ImageVector? = null
