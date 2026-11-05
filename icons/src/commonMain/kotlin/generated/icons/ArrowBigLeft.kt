package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowBigLeft: ImageVector
    get() {
        val current = _arrowBigLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowBigLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.8 19.8 a.7 .7 0 0 0 1.2 -.5 V16 a1 1 0 0 1 1 -1 h6 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1 h-6 a1 1 0 0 1 -1 -1 V4.7 a.7 .7 0 0 0 -1.2 -.5 l-6.95 6.95 a1.2 1.2 0 0 0 0 1.7z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.8 19.8
                moveTo(x = 10.8f, y = 19.8f)
                // a 0.7 0.7 0 0 0 1.2 -0.5
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.2f,
                    dy1 = -0.5f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 4.7
                verticalLineTo(y = 4.7f)
                // a 0.7 0.7 0 0 0 -1.2 -0.5
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.2f,
                    dy1 = -0.5f,
                )
                // l -6.95 6.95
                lineToRelative(dx = -6.95f, dy = 6.95f)
                // a 1.2 1.2 0 0 0 0 1.7z
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                close()
            }
        }.build().also { _arrowBigLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowBigLeft: ImageVector? = null
