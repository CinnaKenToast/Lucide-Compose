package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Link2Off: ImageVector
    get() {
        val current = _link2Off
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Link2Off",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 17 H7 A5 5 0 0 1 7 7 m8 0 h2 a5 5 0 0 1 4 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 17
                moveTo(x = 9.0f, y = 17.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // A 5 5 0 0 1 7 7
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 7.0f,
                )
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 5 5 0 0 1 4 8
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 8.0f,
                )
            }
            // <line x1="8.0" y1="12.0" x2="12.0" y2="12.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _link2Off = it }
    }

@Suppress("ObjectPropertyName")
private var _link2Off: ImageVector? = null
