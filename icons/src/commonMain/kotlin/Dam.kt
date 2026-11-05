package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dam: ImageVector
    get() {
        val current = _dam
        if (current != null) return current

        return ImageVector.Builder(
            name = "Dam",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 11.31 c1.17 .56 1.54 1.69 3.5 1.69 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 m-10.25 6 c.35 .5 1.45 1 2.75 1 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 M2 10 h4 m-4 4 h4 m-4 4 h4 M2 6 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 11.31
                moveTo(x = 11.0f, y = 11.31f)
                // c 1.17 0.56 1.54 1.69 3.5 1.69
                curveToRelative(
                    dx1 = 1.17f,
                    dy1 = 0.56f,
                    dx2 = 1.54f,
                    dy2 = 1.69f,
                    dx3 = 3.5f,
                    dy3 = 1.69f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // m -10.25 6
                moveToRelative(dx = -10.25f, dy = 6.0f)
                // c 0.35 0.5 1.45 1 2.75 1
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = 0.5f,
                    dx2 = 1.45f,
                    dy2 = 1.0f,
                    dx3 = 2.75f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // M7 3 a1 1 0 0 0 -1 1 v16 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 L10 4 a1 1 0 0 0 -1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // L 10 4
                lineTo(x = 10.0f, y = 4.0f)
                // a 1 1 0 0 0 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _dam = it }
    }


@Suppress("ObjectPropertyName")
private var _dam: ImageVector? = null
