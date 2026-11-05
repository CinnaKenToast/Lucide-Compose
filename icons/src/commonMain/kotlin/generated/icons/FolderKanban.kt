package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderKanban: ImageVector
    get() {
        val current = _folderKanban
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FolderKanban",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 20 h16 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 h-7.93 a2 2 0 0 1 -1.66 -.9 L9.59 3.9 A2 2 0 0 0 7.93 3 H4 a2 2 0 0 0 -2 2 v13 a2 2 0 0 0 2 2 m4 -10 v4 m4 -4 v2 m4 -2 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h -7.93
                horizontalLineToRelative(dx = -7.93f)
                // a 2 2 0 0 1 -1.66 -0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.66f,
                    dy1 = -0.9f,
                )
                // L 9.59 3.9
                lineTo(x = 9.59f, y = 3.9f)
                // A 2 2 0 0 0 7.93 3
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.93f,
                    y1 = 3.0f,
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
                // v 13
                verticalLineToRelative(dy = 13.0f)
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
                // m 4 -10
                moveToRelative(dx = 4.0f, dy = -10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _folderKanban = it }
    }

@Suppress("ObjectPropertyName")
private var _folderKanban: ImageVector? = null
