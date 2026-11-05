package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HardDrive: ImageVector
    get() {
        val current = _hardDrive
        if (current != null) return current

        return ImageVector.Builder(
            name = "HardDrive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 16z m-7.8 -4.42 A2 2 0 0 0 2 12.48 V18 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-5.53 a2 2 0 0 0 -.21 -.9 l-3.24 -6.46 A2 2 0 0 0 16.76 4 H7.24 a2 2 0 0 0 -1.79 1.11z M21.95 12 H2.05 M6 16z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 16z
                moveTo(x = 10.0f, y = 16.0f)
                close()
                // m -7.8 -4.42
                moveToRelative(dx = -7.8f, dy = -4.42f)
                // A 2 2 0 0 0 2 12.48
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 12.48f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -5.53
                verticalLineToRelative(dy = -5.53f)
                // a 2 2 0 0 0 -0.21 -0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.21f,
                    dy1 = -0.9f,
                )
                // l -3.24 -6.46
                lineToRelative(dx = -3.24f, dy = -6.46f)
                // A 2 2 0 0 0 16.76 4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.76f,
                    y1 = 4.0f,
                )
                // H 7.24
                horizontalLineTo(x = 7.24f)
                // a 2 2 0 0 0 -1.79 1.11z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.79f,
                    dy1 = 1.11f,
                )
                close()
                // M 21.95 12
                moveTo(x = 21.95f, y = 12.0f)
                // H 2.05
                horizontalLineTo(x = 2.05f)
                // M 6 16z
                moveTo(x = 6.0f, y = 16.0f)
                close()
            }
        }.build().also { _hardDrive = it }
    }


@Suppress("ObjectPropertyName")
private var _hardDrive: ImageVector? = null
