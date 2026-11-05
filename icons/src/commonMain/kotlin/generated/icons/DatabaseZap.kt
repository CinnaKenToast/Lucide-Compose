package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DatabaseZap: ImageVector
    get() {
        val current = _databaseZap
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.DatabaseZap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
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
            // M3 5 v14 a9 3 0 0 0 12 2.84 M21 5 v3 m0 4 -3 5 h4 l-3 5
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
                // a 9 3 0 0 0 12 2.84
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 2.84f,
                )
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // l -3 5
                lineToRelative(dx = -3.0f, dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l -3 5
                lineToRelative(dx = -3.0f, dy = 5.0f)
            }
            // M3 12 a9 3 0 0 0 11.59 2.87
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 3 0 0 0 11.59 2.87
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 11.59f,
                    dy1 = 2.87f,
                )
            }
        }.build().also { _databaseZap = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseZap: ImageVector? = null
