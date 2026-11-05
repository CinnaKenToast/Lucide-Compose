package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScanBarcode: ImageVector
    get() {
        val current = _scanBarcode
        if (current != null) return current

        return ImageVector.Builder(
            name = "ScanBarcode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 7 V5 a2 2 0 0 1 2 -2 h2 m10 0 h2 a2 2 0 0 1 2 2 v2 m0 10 v2 a2 2 0 0 1 -2 2 h-2 M7 21 H5 a2 2 0 0 1 -2 -2 v-2 M8 7 v10 m4 -10 v10 m5 -10 v10
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
                // M 8 7
                moveTo(x = 8.0f, y = 7.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m 4 -10
                moveToRelative(dx = 4.0f, dy = -10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m 5 -10
                moveToRelative(dx = 5.0f, dy = -10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
            }
        }.build().also { _scanBarcode = it }
    }


@Suppress("ObjectPropertyName")
private var _scanBarcode: ImageVector? = null
