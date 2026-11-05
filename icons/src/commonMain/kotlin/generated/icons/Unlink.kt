package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Unlink: ImageVector
    get() {
        val current = _unlink
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Unlink",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18.84 12.25 1.72 -1.71 h-.02 a5 5 0 0 0 -.12 -7.07 5 5 0 0 0 -6.95 0 l-1.72 1.71 m-6.58 6.57 -1.71 1.71 a5 5 0 0 0 .12 7.07 5 5 0 0 0 6.95 0 l1.71 -1.71
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.84 12.25
                moveTo(x = 18.84f, y = 12.25f)
                // l 1.72 -1.71
                lineToRelative(dx = 1.72f, dy = -1.71f)
                // h -0.02
                horizontalLineToRelative(dx = -0.02f)
                // a 5 5 0 0 0 -0.12 -7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.12f,
                    dy1 = -7.07f,
                )
                // a 5 5 0 0 0 -6.95 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.95f,
                    dy1 = 0.0f,
                )
                // l -1.72 1.71
                lineToRelative(dx = -1.72f, dy = 1.71f)
                // m -6.58 6.57
                moveToRelative(dx = -6.58f, dy = 6.57f)
                // l -1.71 1.71
                lineToRelative(dx = -1.71f, dy = 1.71f)
                // a 5 5 0 0 0 0.12 7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.12f,
                    dy1 = 7.07f,
                )
                // a 5 5 0 0 0 6.95 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.95f,
                    dy1 = 0.0f,
                )
                // l 1.71 -1.71
                lineToRelative(dx = 1.71f, dy = -1.71f)
            }
            // <line x1="8.0" y1="2.0" x2="8.0" y2="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // L 8 5
                lineTo(x = 8.0f, y = 5.0f)
            }
            // <line x1="2.0" y1="8.0" x2="5.0" y2="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // L 5 8
                lineTo(x = 5.0f, y = 8.0f)
            }
            // <line x1="16.0" y1="19.0" x2="16.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 19
                moveTo(x = 16.0f, y = 19.0f)
                // L 16 22
                lineTo(x = 16.0f, y = 22.0f)
            }
            // <line x1="19.0" y1="16.0" x2="22.0" y2="16.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 16
                moveTo(x = 19.0f, y = 16.0f)
                // L 22 16
                lineTo(x = 22.0f, y = 16.0f)
            }
        }.build().also { _unlink = it }
    }

@Suppress("ObjectPropertyName")
private var _unlink: ImageVector? = null
