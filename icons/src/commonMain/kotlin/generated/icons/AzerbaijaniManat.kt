package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AzerbaijaniManat: ImageVector
    get() {
        val current = _azerbaijaniManat
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.AzerbaijaniManat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 4 v16 m6 0 v-8 a6 6 0 0 0 -12 0 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 6 6 0 0 0 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _azerbaijaniManat = it }
    }

@Suppress("ObjectPropertyName")
private var _azerbaijaniManat: ImageVector? = null
