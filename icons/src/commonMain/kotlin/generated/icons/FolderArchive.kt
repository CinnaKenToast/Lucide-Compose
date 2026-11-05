package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderArchive: ImageVector
    get() {
        val current = _folderArchive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FolderArchive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="15.0" cy="19.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 19
                moveTo(x = 15.0f, y = 19.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20.9 19.8 A2 2 0 0 0 22 18 V8 a2 2 0 0 0 -2 -2 h-7.9 a2 2 0 0 1 -1.69 -.9 L9.6 3.9 A2 2 0 0 0 7.93 3 H4 a2 2 0 0 0 -2 2 v13 a2 2 0 0 0 2 2 h5.1 m5.9 -9 v-1 m0 7 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.9 19.8
                moveTo(x = 20.9f, y = 19.8f)
                // A 2 2 0 0 0 22 18
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 18.0f,
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
                // h -7.9
                horizontalLineToRelative(dx = -7.9f)
                // a 2 2 0 0 1 -1.69 -0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.69f,
                    dy1 = -0.9f,
                )
                // L 9.6 3.9
                lineTo(x = 9.6f, y = 3.9f)
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
                // h 5.1
                horizontalLineToRelative(dx = 5.1f)
                // m 5.9 -9
                moveToRelative(dx = 5.9f, dy = -9.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
        }.build().also { _folderArchive = it }
    }

@Suppress("ObjectPropertyName")
private var _folderArchive: ImageVector? = null
