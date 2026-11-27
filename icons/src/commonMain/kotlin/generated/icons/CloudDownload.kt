package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudDownload: ImageVector
    get() {
        val current = _cloudDownload
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudDownload",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 21 v-8 m-7 3.75 A7 7 0 1 1 15.71 9 h1.79 a4.5 4.5 0 0 1 1.5 8.74 M9 18 l3 3 3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 21
                moveTo(x = 12.0f, y = 21.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // m -7 3.75
                moveToRelative(dx = -7.0f, dy = 3.75f)
                // A 7 7 0 1 1 15.71 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 15.71f,
                    y1 = 9.0f,
                )
                // h 1.79
                horizontalLineToRelative(dx = 1.79f)
                // a 4.5 4.5 0 0 1 1.5 8.74
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = 8.74f,
                )
                // M 9 18
                moveTo(x = 9.0f, y = 18.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
            }
        }.build().also { _cloudDownload = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudDownload: ImageVector? = null
