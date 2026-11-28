package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Balcony: ImageVector
    get() {
        val current = _balcony
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Balcony",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 8 v14 m4 -7 v7 m2 -7 V8 A6 6 0 0 0 6 8 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m 4 -7
                moveToRelative(dx = 4.0f, dy = -7.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 2 -7
                moveToRelative(dx = 2.0f, dy = -7.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // A 6 6 0 0 0 6 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 8.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
            // M20 15 v5 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 v-5 m-1 0 h18 M6 8 v7 m2 0 v7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 15
                moveTo(x = 20.0f, y = 15.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
            }
        }.build().also { _balcony = it }
    }

@Suppress("ObjectPropertyName")
private var _balcony: ImageVector? = null
