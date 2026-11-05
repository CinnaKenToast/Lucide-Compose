package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudBackup: ImageVector
    get() {
        val current = _cloudBackup
        if (current != null) return current

        return ImageVector.Builder(
            name = "CloudBackup",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 15.25 A4.5 4.5 0 0 0 17.5 8 h-1.79 A7 7 0 1 0 3 13.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 15.25
                moveTo(x = 21.0f, y = 15.25f)
                // A 4.5 4.5 0 0 0 17.5 8
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.5f,
                    y1 = 8.0f,
                )
                // h -1.79
                horizontalLineToRelative(dx = -1.79f)
                // A 7 7 0 1 0 3 13.6
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 13.6f,
                )
            }
            // M7 11 v4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 11
                moveTo(x = 7.0f, y = 11.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // M8 19 a5 5 0 0 0 9 -3 4.5 4.5 0 0 0 -4.5 -4.5 4.8 4.8 0 0 0 -3.41 1.41 L7 15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // a 5 5 0 0 0 9 -3
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = -3.0f,
                )
                // a 4.5 4.5 0 0 0 -4.5 -4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.5f,
                    dy1 = -4.5f,
                )
                // a 4.8 4.8 0 0 0 -3.41 1.41
                arcToRelative(
                    a = 4.8f,
                    b = 4.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.41f,
                    dy1 = 1.41f,
                )
                // L 7 15
                lineTo(x = 7.0f, y = 15.0f)
            }
        }.build().also { _cloudBackup = it }
    }


@Suppress("ObjectPropertyName")
private var _cloudBackup: ImageVector? = null
