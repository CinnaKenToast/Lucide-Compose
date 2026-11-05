package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DiamondPlus: ImageVector
    get() {
        val current = _diamondPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.DiamondPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 8 v8 m-9.3 -5.7 a2.4 2.4 0 0 0 0 3.41 l7.59 7.59 a2.4 2.4 0 0 0 3.41 0 l7.59 -7.59 a2.4 2.4 0 0 0 0 -3.41 L13.7 2.71 a2.4 2.4 0 0 0 -3.41 0z M8 12 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m -9.3 -5.7
                moveToRelative(dx = -9.3f, dy = -5.7f)
                // a 2.4 2.4 0 0 0 0 3.41
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.41f,
                )
                // l 7.59 7.59
                lineToRelative(dx = 7.59f, dy = 7.59f)
                // a 2.4 2.4 0 0 0 3.41 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.41f,
                    dy1 = 0.0f,
                )
                // l 7.59 -7.59
                lineToRelative(dx = 7.59f, dy = -7.59f)
                // a 2.4 2.4 0 0 0 0 -3.41
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.41f,
                )
                // L 13.7 2.71
                lineTo(x = 13.7f, y = 2.71f)
                // a 2.4 2.4 0 0 0 -3.41 0z
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.41f,
                    dy1 = 0.0f,
                )
                close()
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _diamondPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _diamondPlus: ImageVector? = null
