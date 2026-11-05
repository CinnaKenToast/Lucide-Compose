package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pill: ImageVector
    get() {
        val current = _pill
        if (current != null) return current

        return ImageVector.Builder(
            name = "Pill",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.5 20.5 10 -10 a4.95 4.95 0 1 0 -7 -7 l-10 10 a4.95 4.95 0 1 0 7 7 m-2 -12 7 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 20.5
                moveTo(x = 10.5f, y = 20.5f)
                // l 10 -10
                lineToRelative(dx = 10.0f, dy = -10.0f)
                // a 4.95 4.95 0 1 0 -7 -7
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // l -10 10
                lineToRelative(dx = -10.0f, dy = 10.0f)
                // a 4.95 4.95 0 1 0 7 7
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // m -2 -12
                moveToRelative(dx = -2.0f, dy = -12.0f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
            }
        }.build().also { _pill = it }
    }


@Suppress("ObjectPropertyName")
private var _pill: ImageVector? = null
