package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BookExclamationPoint: ImageVector
    get() {
        val current = _bookExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BookExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 13z M12 6 v3 M4 19.5 v-15 A2.5 2.5 0 0 1 6.5 2 H19 a1 1 0 0 1 1 1 v18 a1 1 0 0 1 -1 1 H6.5 a1 1 0 0 1 0 -5 H20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13z
                moveTo(x = 12.0f, y = 13.0f)
                close()
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 4 19.5
                moveTo(x = 4.0f, y = 19.5f)
                // v -15
                verticalLineToRelative(dy = -15.0f)
                // A 2.5 2.5 0 0 1 6.5 2
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.5f,
                    y1 = 2.0f,
                )
                // H 19
                horizontalLineTo(x = 19.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 6.5
                horizontalLineTo(x = 6.5f)
                // a 1 1 0 0 1 0 -5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
            }
        }.build().also { _bookExclamationPoint = it }
    }

@Suppress("ObjectPropertyName")
private var _bookExclamationPoint: ImageVector? = null
