package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BookmarkX: ImageVector
    get() {
        val current = _bookmarkX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BookmarkX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14.5 7.5 -5 5 M17 3 a2 2 0 0 1 2 2 v15 a1 1 0 0 1 -1.5 .87 L13 18.29 a2 2 0 0 0 -2 0 l-4.5 2.58 A1 1 0 0 1 5 20 V5 a2 2 0 0 1 2 -2z M9.5 7.5 l5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.5 7.5
                moveTo(x = 14.5f, y = 7.5f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
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
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // a 1 1 0 0 1 -1.5 0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 0.87f,
                )
                // L 13 18.29
                lineTo(x = 13.0f, y = 18.29f)
                // a 2 2 0 0 0 -2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // l -4.5 2.58
                lineToRelative(dx = -4.5f, dy = 2.58f)
                // A 1 1 0 0 1 5 20
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 20.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
                // M 9.5 7.5
                moveTo(x = 9.5f, y = 7.5f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
            }
        }.build().also { _bookmarkX = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmarkX: ImageVector? = null
