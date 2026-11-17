package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WarehouseWaves: ImageVector
    get() {
        val current = _warehouseWaves
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WarehouseWaves",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 11 V8 a2 2 0 0 1 1.13 -1.8 l7.95 -3.98 a2 2 0 0 1 1.84 0 l7.95 3.98 A2 2 0 0 1 22 8 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 11
                moveTo(x = 2.0f, y = 11.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 1.13 -1.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.13f,
                    dy1 = -1.8f,
                )
                // l 7.95 -3.98
                lineToRelative(dx = 7.95f, dy = -3.98f)
                // a 2 2 0 0 1 1.84 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.84f,
                    dy1 = 0.0f,
                )
                // l 7.95 3.98
                lineToRelative(dx = 7.95f, dy = 3.98f)
                // A 2 2 0 0 1 22 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 8.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
            // M6 11 v-1 a1 1 0 0 1 1 -1 h10 a1 1 0 0 1 1 1 v1 M2 16 q2.5 2 5 0 t5 0 5 0 5 0 M2 21 q2.5 2 5 0 t5 0 5 0 5 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // q 2.5 2 5 0
                quadToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // q 2.5 2 5 0
                quadToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _warehouseWaves = it }
    }

@Suppress("ObjectPropertyName")
private var _warehouseWaves: ImageVector? = null
