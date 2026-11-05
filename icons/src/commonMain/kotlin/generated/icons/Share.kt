package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Share: ImageVector
    get() {
        val current = _share
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Share",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v13 m4 -9 -4 -4 -4 4 m-4 6 v8 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 v-8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // m 4 -9
                moveToRelative(dx = 4.0f, dy = -9.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // m -4 6
                moveToRelative(dx = -4.0f, dy = 6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
            }
        }.build().also { _share = it }
    }

@Suppress("ObjectPropertyName")
private var _share: ImageVector? = null
