package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FerrisWheel: ImageVector
    get() {
        val current = _ferrisWheel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FerrisWheel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
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
            // M12 2 v4 m-5.2 9 -3.5 2 M20.7 7 l-3.5 2 M6.8 9 3.3 7 m17.4 10 -3.5 -2 M9 22 l3 -8 3 8 m-7 0 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m -5.2 9
                moveToRelative(dx = -5.2f, dy = 9.0f)
                // l -3.5 2
                lineToRelative(dx = -3.5f, dy = 2.0f)
                // M 20.7 7
                moveTo(x = 20.7f, y = 7.0f)
                // l -3.5 2
                lineToRelative(dx = -3.5f, dy = 2.0f)
                // M 6.8 9
                moveTo(x = 6.8f, y = 9.0f)
                // L 3.3 7
                lineTo(x = 3.3f, y = 7.0f)
                // m 17.4 10
                moveToRelative(dx = 17.4f, dy = 10.0f)
                // l -3.5 -2
                lineToRelative(dx = -3.5f, dy = -2.0f)
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // l 3 -8
                lineToRelative(dx = 3.0f, dy = -8.0f)
                // l 3 8
                lineToRelative(dx = 3.0f, dy = 8.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
            // M18 18.7 a9 9 0 1 0 -12 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18.7
                moveTo(x = 18.0f, y = 18.7f)
                // a 9 9 0 1 0 -12 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _ferrisWheel = it }
    }

@Suppress("ObjectPropertyName")
private var _ferrisWheel: ImageVector? = null
