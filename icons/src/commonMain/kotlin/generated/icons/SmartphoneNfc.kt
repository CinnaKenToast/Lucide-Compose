package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SmartphoneNfc: ImageVector
    get() {
        val current = _smartphoneNfc
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SmartphoneNfc",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <rect width="7" height="12" rx="1.0" x="2.0" y="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
            // M13 8.32 a7.4 7.4 0 0 1 0 7.36 m3.46 -9.47 a11.8 11.8 0 0 1 0 11.58 M19.91 4.1 a15.9 15.9 0 0 1 .01 15.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 8.32
                moveTo(x = 13.0f, y = 8.32f)
                // a 7.4 7.4 0 0 1 0 7.36
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 7.36f,
                )
                // m 3.46 -9.47
                moveToRelative(dx = 3.46f, dy = -9.47f)
                // a 11.8 11.8 0 0 1 0 11.58
                arcToRelative(
                    a = 11.8f,
                    b = 11.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 11.58f,
                )
                // M 19.91 4.1
                moveTo(x = 19.91f, y = 4.1f)
                // a 15.9 15.9 0 0 1 0.01 15.8
                arcToRelative(
                    a = 15.9f,
                    b = 15.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.01f,
                    dy1 = 15.8f,
                )
            }
        }.build().also { _smartphoneNfc = it }
    }

@Suppress("ObjectPropertyName")
private var _smartphoneNfc: ImageVector? = null
