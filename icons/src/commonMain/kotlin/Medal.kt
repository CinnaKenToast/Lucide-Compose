package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Medal: ImageVector
    get() {
        val current = _medal
        if (current != null) return current

        return ImageVector.Builder(
            name = "Medal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7.21 15 2.66 7.14 a2 2 0 0 1 .13 -2.2 L4.4 2.8 A2 2 0 0 1 6 2 h12 a2 2 0 0 1 1.6 .8 l1.6 2.14 a2 2 0 0 1 .14 2.2 L16.79 15 M11 12 5.12 2.2 M13 12 l5.88 -9.8 M8 7 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.21 15
                moveTo(x = 7.21f, y = 15.0f)
                // L 2.66 7.14
                lineTo(x = 2.66f, y = 7.14f)
                // a 2 2 0 0 1 0.13 -2.2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.13f,
                    dy1 = -2.2f,
                )
                // L 4.4 2.8
                lineTo(x = 4.4f, y = 2.8f)
                // A 2 2 0 0 1 6 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 1 1.6 0.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.6f,
                    dy1 = 0.8f,
                )
                // l 1.6 2.14
                lineToRelative(dx = 1.6f, dy = 2.14f)
                // a 2 2 0 0 1 0.14 2.2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.14f,
                    dy1 = 2.2f,
                )
                // L 16.79 15
                lineTo(x = 16.79f, y = 15.0f)
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
                // L 5.12 2.2
                lineTo(x = 5.12f, y = 2.2f)
                // M 13 12
                moveTo(x = 13.0f, y = 12.0f)
                // l 5.88 -9.8
                lineToRelative(dx = 5.88f, dy = -9.8f)
                // M 8 7
                moveTo(x = 8.0f, y = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
            // <circle cx="12.0" cy="17.0" radius="5.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 18 v-2 h-.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
            }
        }.build().also { _medal = it }
    }


@Suppress("ObjectPropertyName")
private var _medal: ImageVector? = null
