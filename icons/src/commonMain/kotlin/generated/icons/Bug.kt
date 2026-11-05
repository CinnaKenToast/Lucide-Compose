package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bug: ImageVector
    get() {
        val current = _bug
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Bug",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20 v-9 m2 -4 a4 4 0 0 1 4 4 v3 a6 6 0 0 1 -12 0 v-3 a4 4 0 0 1 4 -4z m.12 -3.12 L16 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // m 2 -4
                moveToRelative(dx = 2.0f, dy = -4.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 6 6 0 0 1 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 4 4 0 0 1 4 -4z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                close()
                // m 0.12 -3.12
                moveToRelative(dx = 0.12f, dy = -3.12f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
            }
            // M21 21 a4 4 0 0 0 -3.81 -4 M21 5 a4 4 0 0 1 -3.55 3.97 M22 13 h-4 M3 21 a4 4 0 0 1 3.81 -4 M3 5 a4 4 0 0 0 3.55 3.97 M6 13 H2 M8 2 l1.88 1.88 M9 7.13 V6 a3 3 0 1 1 6 0 v1.13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // a 4 4 0 0 0 -3.81 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.81f,
                    dy1 = -4.0f,
                )
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // a 4 4 0 0 1 -3.55 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.55f,
                    dy1 = 3.97f,
                )
                // M 22 13
                moveTo(x = 22.0f, y = 13.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // a 4 4 0 0 1 3.81 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.81f,
                    dy1 = -4.0f,
                )
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // a 4 4 0 0 0 3.55 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.55f,
                    dy1 = 3.97f,
                )
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // l 1.88 1.88
                lineToRelative(dx = 1.88f, dy = 1.88f)
                // M 9 7.13
                moveTo(x = 9.0f, y = 7.13f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 1.13
                verticalLineToRelative(dy = 1.13f)
            }
        }.build().also { _bug = it }
    }

@Suppress("ObjectPropertyName")
private var _bug: ImageVector? = null
