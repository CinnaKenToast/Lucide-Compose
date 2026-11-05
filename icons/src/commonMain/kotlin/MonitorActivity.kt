package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MonitorActivity: ImageVector
    get() {
        val current = _monitorActivity
        if (current != null) return current

        return ImageVector.Builder(
            name = "MonitorActivity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 v4 m6 -11 h-2.31 a1 1 0 0 0 -.94 .64 l-.78 2.03 a.5 .5 0 0 1 -.94 0 l-2.06 -5.34 a.5 .5 0 0 0 -.94 0 L9.25 9.36 A1 1 0 0 1 8.3 10 H6 m2 11 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 6 -11
                moveToRelative(dx = 6.0f, dy = -11.0f)
                // h -2.31
                horizontalLineToRelative(dx = -2.31f)
                // a 1 1 0 0 0 -0.94 0.64
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.94f,
                    dy1 = 0.64f,
                )
                // l -0.78 2.03
                lineToRelative(dx = -0.78f, dy = 2.03f)
                // a 0.5 0.5 0 0 1 -0.94 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.94f,
                    dy1 = 0.0f,
                )
                // l -2.06 -5.34
                lineToRelative(dx = -2.06f, dy = -5.34f)
                // a 0.5 0.5 0 0 0 -0.94 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.94f,
                    dy1 = 0.0f,
                )
                // L 9.25 9.36
                lineTo(x = 9.25f, y = 9.36f)
                // A 1 1 0 0 1 8.3 10
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.3f,
                    y1 = 10.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 2 11
                moveToRelative(dx = 2.0f, dy = 11.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
            // <rect width="20" height="14" rx="2.0" x="2.0" y="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h -16
                horizontalLineToRelative(dx = -16.0f)
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
        }.build().also { _monitorActivity = it }
    }


@Suppress("ObjectPropertyName")
private var _monitorActivity: ImageVector? = null
