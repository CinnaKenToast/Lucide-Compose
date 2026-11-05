package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SirenOff: ImageVector
    get() {
        val current = _sirenOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "SirenOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 v6 m0 -16 v1 m.7 4.05 a5 5 0 0 1 4.25 4.24 M17 17 v1 H7 a2 2 0 0 0 -2 2 v1 a1 1 0 0 0 1 1 h12 a1 1 0 0 0 1 -1 v-1 a2 2 0 0 0 -2 -2 m1.5 -13.5 L18 5 M2 12 h1 M2 2 l20 20 m-1 -10 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -16
                moveToRelative(dx = 0.0f, dy = -16.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0.7 4.05
                moveToRelative(dx = 0.7f, dy = 4.05f)
                // a 5 5 0 0 1 4.25 4.24
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.25f,
                    dy1 = 4.24f,
                )
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
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
                // m 1.5 -13.5
                moveToRelative(dx = 1.5f, dy = -13.5f)
                // L 18 5
                lineTo(x = 18.0f, y = 5.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -1 -10
                moveToRelative(dx = -1.0f, dy = -10.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
            // M7 18 v-6 a5 5 0 0 1 1.46 -3.54
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 5 5 0 0 1 1.46 -3.54
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.46f,
                    dy1 = -3.54f,
                )
            }
        }.build().also { _sirenOff = it }
    }


@Suppress("ObjectPropertyName")
private var _sirenOff: ImageVector? = null
