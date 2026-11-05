package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DatabaseArrowUp: ImageVector
    get() {
        val current = _databaseArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.DatabaseArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 22 v-6 m2 -3.46 V5 m1 14 -3 -3 -3 3 M3 12 a9 3 0 0 0 11.46 2.89
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 22
                moveTo(x = 19.0f, y = 22.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 2 -3.46
                moveToRelative(dx = 2.0f, dy = -3.46f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 1 14
                moveToRelative(dx = 1.0f, dy = 14.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 3 0 0 0 11.46 2.89
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 11.46f,
                    dy1 = 2.89f,
                )
            }
            // M3 5 v14 a9 3 0 0 0 10.32 2.97
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 9 3 0 0 0 10.32 2.97
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.32f,
                    dy1 = 2.97f,
                )
            }
            // <ellipse cx="12.0" cy="5.0" rx="9.0" ry="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // A 9 3 0 1 0 12 8
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 8.0f,
                )
                // A 9 3 0 1 0 12 2z
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
                close()
            }
        }.build().also { _databaseArrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseArrowUp: ImageVector? = null
