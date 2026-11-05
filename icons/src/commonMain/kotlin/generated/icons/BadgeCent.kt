package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BadgeCent: ImageVector
    get() {
        val current = _badgeCent
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BadgeCent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3.85 8.62 a4 4 0 0 1 4.78 -4.77 4 4 0 0 1 6.74 0 4 4 0 0 1 4.78 4.78 4 4 0 0 1 0 6.74 4 4 0 0 1 -4.77 4.78 4 4 0 0 1 -6.75 0 4 4 0 0 1 -4.78 -4.77 4 4 0 0 1 0 -6.76 M12 7 v10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.85 8.62
                moveTo(x = 3.85f, y = 8.62f)
                // a 4 4 0 0 1 4.78 -4.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.78f,
                    dy1 = -4.77f,
                )
                // a 4 4 0 0 1 6.74 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.74f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 0 1 4.78 4.78
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.78f,
                    dy1 = 4.78f,
                )
                // a 4 4 0 0 1 0 6.74
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.74f,
                )
                // a 4 4 0 0 1 -4.77 4.78
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.77f,
                    dy1 = 4.78f,
                )
                // a 4 4 0 0 1 -6.75 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.75f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 0 1 -4.78 -4.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.78f,
                    dy1 = -4.77f,
                )
                // a 4 4 0 0 1 0 -6.76
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.76f,
                )
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
            }
            // M15.4 10 a4 4 0 1 0 0 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.4 10
                moveTo(x = 15.4f, y = 10.0f)
                // a 4 4 0 1 0 0 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
            }
        }.build().also { _badgeCent = it }
    }

@Suppress("ObjectPropertyName")
private var _badgeCent: ImageVector? = null
