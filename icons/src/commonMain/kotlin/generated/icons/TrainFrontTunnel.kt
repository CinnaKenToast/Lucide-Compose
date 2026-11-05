package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrainFrontTunnel: ImageVector
    get() {
        val current = _trainFrontTunnel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TrainFrontTunnel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 22 V12 a10 10 0 1 1 20 0 v10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
            }
            // M15 6.8 v1.4 a3 2.8 0 1 1 -6 0 V6.8 m1 8.2z M14 15z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 6.8
                moveTo(x = 15.0f, y = 6.8f)
                // v 1.4
                verticalLineToRelative(dy = 1.4f)
                // a 3 2.8 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // V 6.8
                verticalLineTo(y = 6.8f)
                // m 1 8.2z
                moveToRelative(dx = 1.0f, dy = 8.2f)
                close()
                // M 14 15z
                moveTo(x = 14.0f, y = 15.0f)
                close()
            }
            // M10 19 a4 4 0 0 1 -4 -4 v-3 a6 6 0 1 1 12 0 v3 a4 4 0 0 1 -4 4Z m-1 0 -2 3 m8 -3 2 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 19
                moveTo(x = 10.0f, y = 19.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 4 4 0 0 1 -4 4z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                close()
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // l -2 3
                lineToRelative(dx = -2.0f, dy = 3.0f)
                // m 8 -3
                moveToRelative(dx = 8.0f, dy = -3.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
            }
        }.build().also { _trainFrontTunnel = it }
    }

@Suppress("ObjectPropertyName")
private var _trainFrontTunnel: ImageVector? = null
