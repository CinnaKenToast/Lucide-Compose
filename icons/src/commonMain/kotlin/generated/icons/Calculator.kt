package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Calculator: ImageVector
    get() {
        val current = _calculator
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Calculator",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <rect width="16" height="20" rx="2.0" x="4.0" y="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
            // <line x1="8.0" y1="6.0" x2="16.0" y2="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // L 16 6
                lineTo(x = 16.0f, y = 6.0f)
            }
            // <line x1="16.0" y1="14.0" x2="16.0" y2="18.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // L 16 18
                lineTo(x = 16.0f, y = 18.0f)
            }
            // M16 10 h.01 M12 10z M8 10z M12 14z M8 14z M12 18z M8 18z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 12 10z
                moveTo(x = 12.0f, y = 10.0f)
                close()
                // M 8 10z
                moveTo(x = 8.0f, y = 10.0f)
                close()
                // M 12 14z
                moveTo(x = 12.0f, y = 14.0f)
                close()
                // M 8 14z
                moveTo(x = 8.0f, y = 14.0f)
                close()
                // M 12 18z
                moveTo(x = 12.0f, y = 18.0f)
                close()
                // M 8 18z
                moveTo(x = 8.0f, y = 18.0f)
                close()
            }
        }.build().also { _calculator = it }
    }

@Suppress("ObjectPropertyName")
private var _calculator: ImageVector? = null
