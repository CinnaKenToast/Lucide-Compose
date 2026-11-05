package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListVideo: ImageVector
    get() {
        val current = _listVideo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListVideo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 5 H3 m7 7 H3 m7 7 H3 m12 -7 a1 1 0 0 1 1.52 -.86 l5 3 a1 1 0 0 1 0 1.72 l-5 3 A1 1 0 0 1 15 18z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 7 7
                moveToRelative(dx = 7.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 7 7
                moveToRelative(dx = 7.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 12 -7
                moveToRelative(dx = 12.0f, dy = -7.0f)
                // a 1 1 0 0 1 1.52 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = -0.86f,
                )
                // l 5 3
                lineToRelative(dx = 5.0f, dy = 3.0f)
                // a 1 1 0 0 1 0 1.72
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.72f,
                )
                // l -5 3
                lineToRelative(dx = -5.0f, dy = 3.0f)
                // A 1 1 0 0 1 15 18z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 18.0f,
                )
                close()
            }
        }.build().also { _listVideo = it }
    }

@Suppress("ObjectPropertyName")
private var _listVideo: ImageVector? = null
