package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BookOpenText: ImageVector
    get() {
        val current = _bookOpenText
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BookOpenText",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 5 v16 m4 -8 h2 m-2 -4 h2 m2 10 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 h-4 a5 5 0 0 0 -4 2 5 5 0 0 0 -4 -2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h4 a5 5 0 0 1 4 2 5 5 0 0 1 4 -2z M6 13 h2 M6 9 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 4 -8
                moveToRelative(dx = 4.0f, dy = -8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 -4
                moveToRelative(dx = -2.0f, dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 2 10
                moveToRelative(dx = 2.0f, dy = 10.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 5 5 0 0 0 -4 2
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 2.0f,
                )
                // a 5 5 0 0 0 -4 -2
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 5 5 0 0 1 4 2
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 2.0f,
                )
                // a 5 5 0 0 1 4 -2z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -2.0f,
                )
                close()
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 6 9
                moveTo(x = 6.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _bookOpenText = it }
    }

@Suppress("ObjectPropertyName")
private var _bookOpenText: ImageVector? = null
