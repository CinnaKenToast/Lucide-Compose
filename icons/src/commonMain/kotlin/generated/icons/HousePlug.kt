package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HousePlug: ImageVector
    get() {
        val current = _housePlug
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HousePlug",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 V8.96 M14 12 V8.96 M15 12 a1 1 0 0 1 1 1 v2 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-2 a1 1 0 0 1 1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // V 8.96
                verticalLineTo(y = 8.96f)
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // V 8.96
                verticalLineTo(y = 8.96f)
                // M 15 12
                moveTo(x = 15.0f, y = 12.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
            // M8.5 21 H5 a2 2 0 0 1 -2 -2 v-9 a2 2 0 0 1 .7 -1.53 l7 -6 a2 2 0 0 1 2.6 0 l7 6 A2 2 0 0 1 21 10 v9 a2 2 0 0 1 -2 2 h-5 a2 2 0 0 1 -2 -2 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.5 21
                moveTo(x = 8.5f, y = 21.0f)
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
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // a 2 2 0 0 1 0.7 -1.53
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = -1.53f,
                )
                // l 7 -6
                lineToRelative(dx = 7.0f, dy = -6.0f)
                // a 2 2 0 0 1 2.6 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                )
                // l 7 6
                lineToRelative(dx = 7.0f, dy = 6.0f)
                // A 2 2 0 0 1 21 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 10.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
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
                // h -5
                horizontalLineToRelative(dx = -5.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
        }.build().also { _housePlug = it }
    }

@Suppress("ObjectPropertyName")
private var _housePlug: ImageVector? = null
