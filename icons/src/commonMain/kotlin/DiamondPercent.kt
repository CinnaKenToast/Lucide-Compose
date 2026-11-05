package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiamondPercent: ImageVector
    get() {
        val current = _diamondPercent
        if (current != null) return current

        return ImageVector.Builder(
            name = "DiamondPercent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2.7 10.3 a2.4 2.4 0 0 0 0 3.41 l7.59 7.59 a2.4 2.4 0 0 0 3.41 0 l7.59 -7.59 a2.4 2.4 0 0 0 0 -3.41 L13.7 2.71 a2.4 2.4 0 0 0 -3.41 0Z m6.5 -1.1z m5.29 .3 -5 5 m5.2 .3z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.7 10.3
                moveTo(x = 2.7f, y = 10.3f)
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
                // m 6.5 -1.1z
                moveToRelative(dx = 6.5f, dy = -1.1f)
                close()
                // m 5.29 0.3
                moveToRelative(dx = 5.29f, dy = 0.3f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 5.2 0.3z
                moveToRelative(dx = 5.2f, dy = 0.3f)
                close()
            }
        }.build().also { _diamondPercent = it }
    }


@Suppress("ObjectPropertyName")
private var _diamondPercent: ImageVector? = null
