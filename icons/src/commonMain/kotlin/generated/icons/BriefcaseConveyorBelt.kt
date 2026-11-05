package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BriefcaseConveyorBelt: ImageVector
    get() {
        val current = _briefcaseConveyorBelt
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BriefcaseConveyorBelt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 20 v2 m4 -2 v2 m4 -2 v2 m3 -2 H3 m3 0 v2 m2 -6 V4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 3 -2
                moveToRelative(dx = 3.0f, dy = -2.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 3 0
                moveToRelative(dx = 3.0f, dy = 0.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 2 -6
                moveToRelative(dx = 2.0f, dy = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
            }
            // <rect width="16" height="10" rx="2.0" x="4.0" y="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h -12
                horizontalLineToRelative(dx = -12.0f)
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
        }.build().also { _briefcaseConveyorBelt = it }
    }

@Suppress("ObjectPropertyName")
private var _briefcaseConveyorBelt: ImageVector? = null
