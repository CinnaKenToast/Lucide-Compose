package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterM: ImageVector
    get() {
        val current = _letterM
        if (current != null) return current

        return ImageVector.Builder(
            name = "LetterM",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 20 V4.25 a.25 .25 0 0 1 .45 -.14 l6.73 9.47 a1 1 0 0 0 1.63 0 l6.74 -9.47 A.25 .25 0 0 1 20 4.25 V20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // V 4.25
                verticalLineTo(y = 4.25f)
                // a 0.25 0.25 0 0 1 0.45 -0.14
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.45f,
                    dy1 = -0.14f,
                )
                // l 6.73 9.47
                lineToRelative(dx = 6.73f, dy = 9.47f)
                // a 1 1 0 0 0 1.63 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.63f,
                    dy1 = 0.0f,
                )
                // l 6.74 -9.47
                lineToRelative(dx = 6.74f, dy = -9.47f)
                // A 0.25 0.25 0 0 1 20 4.25
                arcTo(
                    horizontalEllipseRadius = 0.25f,
                    verticalEllipseRadius = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 4.25f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
            }
        }.build().also { _letterM = it }
    }


@Suppress("ObjectPropertyName")
private var _letterM: ImageVector? = null
