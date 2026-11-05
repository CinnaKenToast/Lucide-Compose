package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserPlus: ImageVector
    get() {
        val current = _userPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 21 v-2 a4 4 0 0 0 -4 -4 H6 a4 4 0 0 0 -4 4 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
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
            }
            // <circle cx="9.0" cy="7.0" radius="4.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
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
            // <line x1="19.0" y1="8.0" x2="19.0" y2="14.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 8
                moveTo(x = 19.0f, y = 8.0f)
                // L 19 14
                lineTo(x = 19.0f, y = 14.0f)
            }
            // <line x1="22.0" y1="11.0" x2="16.0" y2="11.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 11
                moveTo(x = 22.0f, y = 11.0f)
                // L 16 11
                lineTo(x = 16.0f, y = 11.0f)
            }
        }.build().also { _userPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _userPlus: ImageVector? = null
