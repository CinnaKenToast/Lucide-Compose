package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.NotepadTextDashed: ImageVector
    get() {
        val current = _notepadTextDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.NotepadTextDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 2 v4 m4 -4 v4 m4 -4 v4 m0 -2 h2 a2 2 0 0 1 2 2 v2 m0 4 v2 m0 4 v2 a2 2 0 0 1 -2 2 h-1 m-4 0 h-2 m-4 0 H6 a2 2 0 0 1 -2 -2 v-2 m0 -4 v-2 m0 -4 V6 a2 2 0 0 1 2 -2 h2 m0 6 h6 m-6 4 h8 m-8 4 h5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 4
                moveToRelative(dx = -8.0f, dy = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _notepadTextDashed = it }
    }

@Suppress("ObjectPropertyName")
private var _notepadTextDashed: ImageVector? = null
