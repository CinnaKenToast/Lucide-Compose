package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookmarkPlus: ImageVector
    get() {
        val current = _bookmarkPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "BookmarkPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7 v6 m3 -3 H9 m8 -7 a2 2 0 0 1 2 2 v15 a1 1 0 0 1 -1.5 .87 L13 18.29 a2 2 0 0 0 -2 0 l-4.5 2.58 A1 1 0 0 1 5 20 V5 a2 2 0 0 1 2 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 8 -7
                moveToRelative(dx = 8.0f, dy = -7.0f)
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
            }
        }.build().also { _bookmarkPlus = it }
    }


@Suppress("ObjectPropertyName")
private var _bookmarkPlus: ImageVector? = null
