package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FilePlay: ImageVector
    get() {
        val current = _filePlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FilePlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 22 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h8 a2.4 2.4 0 0 1 1.7 .7 l3.6 3.6 A2.4 2.4 0 0 1 20 8 v12 a2 2 0 0 1 -2 2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2.4 2.4 0 0 1 1.7 0.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.7f,
                )
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // A 2.4 2.4 0 0 1 20 8
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 8.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 1 -2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M14 2 v5 a1 1 0 0 0 1 1 h5 m-4.97 5.44 a.65 .65 0 0 1 0 1.12 l-4.06 2.35 A.65 .65 0 0 1 10 16.35 v-4.7 a.65 .65 0 0 1 .97 -.56z
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
                // m -4.97 5.44
                moveToRelative(dx = -4.97f, dy = 5.44f)
                // a 0.65 0.65 0 0 1 0 1.12
                arcToRelative(
                    a = 0.65f,
                    b = 0.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.12f,
                )
                // l -4.06 2.35
                lineToRelative(dx = -4.06f, dy = 2.35f)
                // A 0.65 0.65 0 0 1 10 16.35
                arcTo(
                    horizontalEllipseRadius = 0.65f,
                    verticalEllipseRadius = 0.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 16.35f,
                )
                // v -4.7
                verticalLineToRelative(dy = -4.7f)
                // a 0.65 0.65 0 0 1 0.97 -0.56z
                arcToRelative(
                    a = 0.65f,
                    b = 0.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.97f,
                    dy1 = -0.56f,
                )
                close()
            }
        }.build().also { _filePlay = it }
    }

@Suppress("ObjectPropertyName")
private var _filePlay: ImageVector? = null
