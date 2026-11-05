package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoveDiagonal2: ImageVector
    get() {
        val current = _moveDiagonal2
        if (current != null) return current

        return ImageVector.Builder(
            name = "MoveDiagonal2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 13 v6 h-6 m-8 -8 V5 h6 M5 5 l14 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 13
                moveTo(x = 19.0f, y = 13.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // m -8 -8
                moveToRelative(dx = -8.0f, dy = -8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 5 5
                moveTo(x = 5.0f, y = 5.0f)
                // l 14 14
                lineToRelative(dx = 14.0f, dy = 14.0f)
            }
        }.build().also { _moveDiagonal2 = it }
    }


@Suppress("ObjectPropertyName")
private var _moveDiagonal2: ImageVector? = null
