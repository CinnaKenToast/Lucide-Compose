package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AppWindowPlus: ImageVector
    get() {
        val current = _appWindowPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.AppWindowPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 4 v4 m2 9 h6 M18 4 v4 m1 6 v6 M2 8 h20 m0 3 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 9
                moveToRelative(dx = 2.0f, dy = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 1 6
                moveToRelative(dx = 1.0f, dy = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // m 0 3
                moveToRelative(dx = 0.0f, dy = 3.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
            }
        }.build().also { _appWindowPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _appWindowPlus: ImageVector? = null
