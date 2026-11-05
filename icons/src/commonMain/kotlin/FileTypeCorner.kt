package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FileTypeCorner: ImageVector
    get() {
        val current = _fileTypeCorner
        if (current != null) return current

        return ImageVector.Builder(
            name = "FileTypeCorner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 h6 a2 2 0 0 0 2 -2 V8 a2.4 2.4 0 0 0 -.7 -1.7 l-3.6 -3.6 A2.4 2.4 0 0 0 14 2 H6 a2 2 0 0 0 -2 2 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // a 2.4 2.4 0 0 0 -0.7 -1.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.7f,
                    dy1 = -1.7f,
                )
                // l -3.6 -3.6
                lineToRelative(dx = -3.6f, dy = -3.6f)
                // A 2.4 2.4 0 0 0 14 2
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // M14 2 v5 a1 1 0 0 0 1 1 h5 M3 16 v-1.5 A.5 .5 0 0 1 3.5 14 h7 a.5 .5 0 0 1 .5 .5 V16 m-5 6 h2 m-1 -8 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // v -1.5
                verticalLineToRelative(dy = -1.5f)
                // A 0.5 0.5 0 0 1 3.5 14
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.5f,
                    y1 = 14.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // a 0.5 0.5 0 0 1 0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 0.5f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // m -5 6
                moveToRelative(dx = -5.0f, dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -1 -8
                moveToRelative(dx = -1.0f, dy = -8.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _fileTypeCorner = it }
    }


@Suppress("ObjectPropertyName")
private var _fileTypeCorner: ImageVector? = null
