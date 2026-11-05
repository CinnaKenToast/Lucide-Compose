package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ScanText: ImageVector
    get() {
        val current = _scanText
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ScanText",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 7 V5 a2 2 0 0 1 2 -2 h2 m10 0 h2 a2 2 0 0 1 2 2 v2 m0 10 v2 a2 2 0 0 1 -2 2 h-2 M7 21 H5 a2 2 0 0 1 -2 -2 v-2 m4 -9 h8 m-8 4 h10 M7 16 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 7
                moveTo(x = 3.0f, y = 7.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 4 -9
                moveToRelative(dx = 4.0f, dy = -9.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 4
                moveToRelative(dx = -8.0f, dy = 4.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _scanText = it }
    }

@Suppress("ObjectPropertyName")
private var _scanText: ImageVector? = null
