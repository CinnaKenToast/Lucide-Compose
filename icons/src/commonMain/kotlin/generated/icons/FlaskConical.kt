package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FlaskConical: ImageVector
    get() {
        val current = _flaskConical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FlaskConical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 2 v6 a2 2 0 0 0 .25 .96 l5.5 10.08 A2 2 0 0 1 18 22 H6 a2 2 0 0 1 -1.75 -2.96 l5.5 -10.08 A2 2 0 0 0 10 8 V2 M6.45 15 h11.1 M8.5 2 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 0 0.25 0.96
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.25f,
                    dy1 = 0.96f,
                )
                // l 5.5 10.08
                lineToRelative(dx = 5.5f, dy = 10.08f)
                // A 2 2 0 0 1 18 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 22.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 1 -1.75 -2.96
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.75f,
                    dy1 = -2.96f,
                )
                // l 5.5 -10.08
                lineToRelative(dx = 5.5f, dy = -10.08f)
                // A 2 2 0 0 0 10 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 8.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // M 6.45 15
                moveTo(x = 6.45f, y = 15.0f)
                // h 11.1
                horizontalLineToRelative(dx = 11.1f)
                // M 8.5 2
                moveTo(x = 8.5f, y = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _flaskConical = it }
    }

@Suppress("ObjectPropertyName")
private var _flaskConical: ImageVector? = null
