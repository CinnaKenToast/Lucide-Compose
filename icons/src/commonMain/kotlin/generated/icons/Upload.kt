package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Upload: ImageVector
    get() {
        val current = _upload
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Upload",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v12 m5 -7 -5 -5 -5 5 m14 7 v4 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2 v-4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // m 5 -7
                moveToRelative(dx = 5.0f, dy = -7.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 14 7
                moveToRelative(dx = 14.0f, dy = 7.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
            }
        }.build().also { _upload = it }
    }

@Suppress("ObjectPropertyName")
private var _upload: ImageVector? = null
