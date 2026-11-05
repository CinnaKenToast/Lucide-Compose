package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bot: ImageVector
    get() {
        val current = _bot
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Bot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 8 V4 H8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
            }
            // <rect width="16" height="12" rx="2.0" x="4.0" y="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 10
                moveTo(x = 4.0f, y = 10.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -12
                horizontalLineToRelative(dx = -12.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M2 14 h2 m16 0 h2 m-7 -1 v2 m-6 -2 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -7 -1
                moveToRelative(dx = -7.0f, dy = -1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -6 -2
                moveToRelative(dx = -6.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _bot = it }
    }

@Suppress("ObjectPropertyName")
private var _bot: ImageVector? = null
