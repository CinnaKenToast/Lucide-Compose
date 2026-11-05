package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GraphStar: ImageVector
    get() {
        val current = _graphStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GraphStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12.34 9.32 1.77 -3.53 m-1.52 8.76 2.35 3.75 m-.96 -5.97 4.03 .45 m-12.6 4.8 3.47 -3.46 m.14 -4.38 L5.33 5.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.34 9.32
                moveTo(x = 12.34f, y = 9.32f)
                // l 1.77 -3.53
                lineToRelative(dx = 1.77f, dy = -3.53f)
                // m -1.52 8.76
                moveToRelative(dx = -1.52f, dy = 8.76f)
                // l 2.35 3.75
                lineToRelative(dx = 2.35f, dy = 3.75f)
                // m -0.96 -5.97
                moveToRelative(dx = -0.96f, dy = -5.97f)
                // l 4.03 0.45
                lineToRelative(dx = 4.03f, dy = 0.45f)
                // m -12.6 4.8
                moveToRelative(dx = -12.6f, dy = 4.8f)
                // l 3.47 -3.46
                lineToRelative(dx = 3.47f, dy = -3.46f)
                // m 0.14 -4.38
                moveToRelative(dx = 0.14f, dy = -4.38f)
                // L 5.33 5.5
                lineTo(x = 5.33f, y = 5.5f)
            }
            // <circle cx="11.0" cy="12.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="15.0" cy="4.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 4
                moveTo(x = 15.0f, y = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="16.0" cy="20.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="20.0" cy="13.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 13
                moveTo(x = 20.0f, y = 13.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="4.0" cy="19.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 19
                moveTo(x = 4.0f, y = 19.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="4.0" cy="4.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _graphStar = it }
    }

@Suppress("ObjectPropertyName")
private var _graphStar: ImageVector? = null
