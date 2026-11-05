package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GlobeCode: ImageVector
    get() {
        val current = _globeCode
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GlobeCode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.5 10 13 7.5 15.5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.5 10
                moveTo(x = 15.5f, y = 10.0f)
                // L 13 7.5
                lineTo(x = 13.0f, y = 7.5f)
                // L 15.5 5
                lineTo(x = 15.5f, y = 5.0f)
            }
            // M15.86 14 A14.5 14.5 0 0 1 12 22 a14.5 14.5 0 0 1 0 -20 10 10 0 1 0 9.89 11.5 M19.5 5 22 7.5 19.5 10 M2 12 h8.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.86 14
                moveTo(x = 15.86f, y = 14.0f)
                // A 14.5 14.5 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 14.5f,
                    verticalEllipseRadius = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // a 14.5 14.5 0 0 1 0 -20
                arcToRelative(
                    a = 14.5f,
                    b = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -20.0f,
                )
                // a 10 10 0 1 0 9.89 11.5
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 9.89f,
                    dy1 = 11.5f,
                )
                // M 19.5 5
                moveTo(x = 19.5f, y = 5.0f)
                // L 22 7.5
                lineTo(x = 22.0f, y = 7.5f)
                // L 19.5 10
                lineTo(x = 19.5f, y = 10.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 8.5
                horizontalLineToRelative(dx = 8.5f)
            }
        }.build().also { _globeCode = it }
    }

@Suppress("ObjectPropertyName")
private var _globeCode: ImageVector? = null
