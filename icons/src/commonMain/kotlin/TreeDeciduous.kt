package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TreeDeciduous: ImageVector
    get() {
        val current = _treeDeciduous
        if (current != null) return current

        return ImageVector.Builder(
            name = "TreeDeciduous",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 19 a4 4 0 0 1 -2.24 -7.32 A3.5 3.5 0 0 1 9 6.03 V6 a3 3 0 1 1 6 0 v.04 a3.5 3.5 0 0 1 3.24 5.65 A4 4 0 0 1 16 19Z m4 0 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // a 4 4 0 0 1 -2.24 -7.32
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.24f,
                    dy1 = -7.32f,
                )
                // A 3.5 3.5 0 0 1 9 6.03
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 6.03f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 0.04
                verticalLineToRelative(dy = 0.04f)
                // a 3.5 3.5 0 0 1 3.24 5.65
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.24f,
                    dy1 = 5.65f,
                )
                // A 4 4 0 0 1 16 19z
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 19.0f,
                )
                close()
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _treeDeciduous = it }
    }


@Suppress("ObjectPropertyName")
private var _treeDeciduous: ImageVector? = null
