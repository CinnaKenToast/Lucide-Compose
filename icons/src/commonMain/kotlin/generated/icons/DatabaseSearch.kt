package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DatabaseSearch: ImageVector
    get() {
        val current = _databaseSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.DatabaseSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 11.7 V5 m1 17 -1.87 -1.87 M3 12 a9 3 0 0 0 8.7 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 11.7
                moveTo(x = 21.0f, y = 11.7f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 1 17
                moveToRelative(dx = 1.0f, dy = 17.0f)
                // l -1.87 -1.87
                lineToRelative(dx = -1.87f, dy = -1.87f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 3 0 0 0 8.7 3
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.7f,
                    dy1 = 3.0f,
                )
            }
            // M3 5 v14 a9 3 0 0 0 9.28 3
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
                // a 9 3 0 0 0 9.28 3
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.28f,
                    dy1 = 3.0f,
                )
            }
            // <circle cx="18.0" cy="18.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
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
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
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
        }.build().also { _databaseSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseSearch: ImageVector? = null
