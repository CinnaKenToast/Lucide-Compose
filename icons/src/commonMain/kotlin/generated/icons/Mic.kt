package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Mic: ImageVector
    get() {
        val current = _mic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Mic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 19 v3 m7 -12 v2 a7 7 0 0 1 -14 0 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 7 -12
                moveToRelative(dx = 7.0f, dy = -12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 7 7 0 0 1 -14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
            // <rect width="6" height="13" rx="3.0" x="9.0" y="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 0
                horizontalLineToRelative(dx = 0.0f)
                // a 3 3 0 0 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // h -0
                horizontalLineToRelative(dx = -0.0f)
                // a 3 3 0 0 1 -3 -3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                close()
            }
        }.build().also { _mic = it }
    }

@Suppress("ObjectPropertyName")
private var _mic: ImageVector? = null
