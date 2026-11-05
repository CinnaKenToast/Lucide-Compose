package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleLetterF: ImageVector
    get() {
        val current = _circleLetterF
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleLetterF",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 16 V8.5 A.5 .5 0 0 1 9.5 8 H15 m-6 4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 16
                moveTo(x = 9.0f, y = 16.0f)
                // V 8.5
                verticalLineTo(y = 8.5f)
                // A 0.5 0.5 0 0 1 9.5 8
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.5f,
                    y1 = 8.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _circleLetterF = it }
    }

@Suppress("ObjectPropertyName")
private var _circleLetterF: ImageVector? = null
