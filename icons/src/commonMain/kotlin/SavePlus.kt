package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SavePlus: ImageVector
    get() {
        val current = _savePlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "SavePlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.5 21 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h10.2 a2 2 0 0 1 1.4 .6 l3.8 3.8 A2 2 0 0 1 21 8.8 V12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.5 21
                moveTo(x = 12.5f, y = 21.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 10.2
                horizontalLineToRelative(dx = 10.2f)
                // a 2 2 0 0 1 1.4 0.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.6f,
                )
                // l 3.8 3.8
                lineToRelative(dx = 3.8f, dy = 3.8f)
                // A 2 2 0 0 1 21 8.8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 8.8f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
            }
            // M16 13 H8 a1 1 0 0 0 -1 1 v7 m12 1 v-6 m3 3 h-6 M7 3 v4 a1 1 0 0 0 1 1 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 12 1
                moveToRelative(dx = 12.0f, dy = 1.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 3 3
                moveToRelative(dx = 3.0f, dy = 3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _savePlus = it }
    }


@Suppress("ObjectPropertyName")
private var _savePlus: ImageVector? = null
