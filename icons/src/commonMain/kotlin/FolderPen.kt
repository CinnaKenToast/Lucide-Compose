package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderPen: ImageVector
    get() {
        val current = _folderPen
        if (current != null) return current

        return ImageVector.Builder(
            name = "FolderPen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 11.5 V5 a2 2 0 0 1 2 -2 h3.9 c.7 0 1.3 .3 1.7 .9 l.8 1.2 c.4 .6 1 .9 1.7 .9 H20 a2 2 0 0 1 2 2 v10 a2 2 0 0 1 -2 2 h-9.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 11.5
                moveTo(x = 2.0f, y = 11.5f)
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
                // h 3.9
                horizontalLineToRelative(dx = 3.9f)
                // c 0.7 0 1.3 0.3 1.7 0.9
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 0.0f,
                    dx2 = 1.3f,
                    dy2 = 0.3f,
                    dx3 = 1.7f,
                    dy3 = 0.9f,
                )
                // l 0.8 1.2
                lineToRelative(dx = 0.8f, dy = 1.2f)
                // c 0.4 0.6 1 0.9 1.7 0.9
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.6f,
                    dx2 = 1.0f,
                    dy2 = 0.9f,
                    dx3 = 1.7f,
                    dy3 = 0.9f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h -9.5
                horizontalLineToRelative(dx = -9.5f)
            }
            // M11.38 13.63 a1 1 0 1 0 -3 -3 l-5.02 5 a2 2 0 0 0 -.5 .86 l-.84 2.87 a.5 .5 0 0 0 .62 .62 l2.87 -.84 a2 2 0 0 0 .86 -.5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.38 13.63
                moveTo(x = 11.38f, y = 13.63f)
                // a 1 1 0 1 0 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // l -5.02 5
                lineToRelative(dx = -5.02f, dy = 5.0f)
                // a 2 2 0 0 0 -0.5 0.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 0.86f,
                )
                // l -0.84 2.87
                lineToRelative(dx = -0.84f, dy = 2.87f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // l 2.87 -0.84
                lineToRelative(dx = 2.87f, dy = -0.84f)
                // a 2 2 0 0 0 0.86 -0.5z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.86f,
                    dy1 = -0.5f,
                )
                close()
            }
        }.build().also { _folderPen = it }
    }


@Suppress("ObjectPropertyName")
private var _folderPen: ImageVector? = null
