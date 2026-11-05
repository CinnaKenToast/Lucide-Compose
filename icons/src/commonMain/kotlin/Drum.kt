package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drum: ImageVector
    get() {
        val current = _drum
        if (current != null) return current

        return ImageVector.Builder(
            name = "Drum",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 2 8 8 m12 -8 -8 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // m 12 -8
                moveToRelative(dx = 12.0f, dy = -8.0f)
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
            }
            // <ellipse cx="12.0" cy="9.0" rx="10.0" ry="5.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // A 10 5 0 1 0 12 14
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 14.0f,
                )
                // A 10 5 0 1 0 12 4z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 4.0f,
                )
                close()
            }
            // M7 13.4 v7.9 m5 -7.3 v8 m5 -8.6 v7.9 M2 9 v8 a10 5 0 0 0 20 0 V9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 13.4
                moveTo(x = 7.0f, y = 13.4f)
                // v 7.9
                verticalLineToRelative(dy = 7.9f)
                // m 5 -7.3
                moveToRelative(dx = 5.0f, dy = -7.3f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 5 -8.6
                moveToRelative(dx = 5.0f, dy = -8.6f)
                // v 7.9
                verticalLineToRelative(dy = 7.9f)
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 10 5 0 0 0 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
            }
        }.build().also { _drum = it }
    }


@Suppress("ObjectPropertyName")
private var _drum: ImageVector? = null
