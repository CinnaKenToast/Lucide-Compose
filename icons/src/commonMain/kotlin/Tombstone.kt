package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tombstone: ImageVector
    get() {
        val current = _tombstone
        if (current != null) return current

        return ImageVector.Builder(
            name = "Tombstone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 10 h2 m6 11 V10 a7 7 0 0 0 -14 0 v11 m-3 0 h20 M9 14 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 6 11
                moveToRelative(dx = 6.0f, dy = 11.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 7 7 0 0 0 -14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _tombstone = it }
    }


@Suppress("ObjectPropertyName")
private var _tombstone: ImageVector? = null
