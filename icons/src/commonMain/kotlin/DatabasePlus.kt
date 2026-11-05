package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabasePlus: ImageVector
    get() {
        val current = _databasePlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "DatabasePlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 16 v6 m2 -9.46 V5 m1 14 h-6 M3 12 a9 3 0 0 0 12.18 2.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 16
                moveTo(x = 19.0f, y = 16.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 2 -9.46
                moveToRelative(dx = 2.0f, dy = -9.46f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 1 14
                moveToRelative(dx = 1.0f, dy = 14.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 3 0 0 0 12.18 2.8
                arcToRelative(
                    a = 9.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.18f,
                    dy1 = 2.8f,
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
            // <ellipse cx="12.0" cy="5.0" rx="9.0" ry="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
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
        }.build().also { _databasePlus = it }
    }


@Suppress("ObjectPropertyName")
private var _databasePlus: ImageVector? = null
