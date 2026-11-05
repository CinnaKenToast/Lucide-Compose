package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeOff: ImageVector
    get() {
        val current = _volumeOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "VolumeOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 9 a5 5 0 0 1 .95 2.3 m2.41 -5.66 a9 9 0 0 1 1.9 9.96 M2 2 l20 20 M7 7 6.41 7.59 a1.4 1.4 0 0 1 -1 .41 H3 a1 1 0 0 0 -1 1 v6 a1 1 0 0 0 1 1 h2.42 a1.4 1.4 0 0 1 1 .41 L9.8 19.8 a.7 .7 0 0 0 1.2 -.5 V11 M9.83 4.17 A.69 .69 0 0 1 11 4.66 v.68
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // a 5 5 0 0 1 0.95 2.3
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.95f,
                    dy1 = 2.3f,
                )
                // m 2.41 -5.66
                moveToRelative(dx = 2.41f, dy = -5.66f)
                // a 9 9 0 0 1 1.9 9.96
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.9f,
                    dy1 = 9.96f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // L 6.41 7.59
                lineTo(x = 6.41f, y = 7.59f)
                // a 1.4 1.4 0 0 1 -1 0.41
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.41f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 2.42
                horizontalLineToRelative(dx = 2.42f)
                // a 1.4 1.4 0 0 1 1 0.41
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.41f,
                )
                // L 9.8 19.8
                lineTo(x = 9.8f, y = 19.8f)
                // a 0.7 0.7 0 0 0 1.2 -0.5
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.2f,
                    dy1 = -0.5f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // M 9.83 4.17
                moveTo(x = 9.83f, y = 4.17f)
                // A 0.69 0.69 0 0 1 11 4.66
                arcTo(
                    horizontalEllipseRadius = 0.69f,
                    verticalEllipseRadius = 0.69f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 4.66f,
                )
                // v 0.68
                verticalLineToRelative(dy = 0.68f)
            }
        }.build().also { _volumeOff = it }
    }


@Suppress("ObjectPropertyName")
private var _volumeOff: ImageVector? = null
