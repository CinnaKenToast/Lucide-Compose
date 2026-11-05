package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShelvingUnit: ImageVector
    get() {
        val current = _shelvingUnit
        if (current != null) return current

        return ImageVector.Builder(
            name = "ShelvingUnit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 V9 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -1 1 v3 m8 8 v-3 a1 1 0 0 0 -1 -1 h-2 a1 1 0 0 0 -1 1 v3 m8 2 V2 M4 12 h16 M4 20 h16 M4 2 v20 M4 4 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 8 8
                moveToRelative(dx = 8.0f, dy = 8.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 8 2
                moveToRelative(dx = 8.0f, dy = 2.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
        }.build().also { _shelvingUnit = it }
    }


@Suppress("ObjectPropertyName")
private var _shelvingUnit: ImageVector? = null
