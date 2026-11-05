package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListRestart: ImageVector
    get() {
        val current = _listRestart
        if (current != null) return current

        return ImageVector.Builder(
            name = "ListRestart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 5 H3 m4 7 H3 m4 7 H3 m9 -1 a5 5 0 0 0 9 -3 4.5 4.5 0 0 0 -4.5 -4.5 4.8 4.8 0 0 0 -3.41 1.41 L11 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 9 -1
                moveToRelative(dx = 9.0f, dy = -1.0f)
                // a 5 5 0 0 0 9 -3
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = -3.0f,
                )
                // a 4.5 4.5 0 0 0 -4.5 -4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.5f,
                    dy1 = -4.5f,
                )
                // a 4.8 4.8 0 0 0 -3.41 1.41
                arcToRelative(
                    a = 4.8f,
                    b = 4.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.41f,
                    dy1 = 1.41f,
                )
                // L 11 14
                lineTo(x = 11.0f, y = 14.0f)
            }
            // M11 10 v4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _listRestart = it }
    }


@Suppress("ObjectPropertyName")
private var _listRestart: ImageVector? = null
