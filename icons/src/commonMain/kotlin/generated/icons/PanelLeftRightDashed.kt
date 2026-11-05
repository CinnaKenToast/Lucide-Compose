package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PanelLeftRightDashed: ImageVector
    get() {
        val current = _panelLeftRightDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PanelLeftRightDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 10 V9 m0 6 v-1 m0 7 v-2 m0 -14 V3 m-6 7 V9 m0 6 v-1 m0 7 v-2 M9 5 V3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 10
                moveTo(x = 15.0f, y = 10.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -14
                moveToRelative(dx = 0.0f, dy = -14.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m -6 7
                moveToRelative(dx = -6.0f, dy = 7.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // V 3
                verticalLineTo(y = 3.0f)
            }
            // <rect width="18" height="18" rx="2.0" x="3.0" y="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h -14
                horizontalLineToRelative(dx = -14.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _panelLeftRightDashed = it }
    }

@Suppress("ObjectPropertyName")
private var _panelLeftRightDashed: ImageVector? = null
