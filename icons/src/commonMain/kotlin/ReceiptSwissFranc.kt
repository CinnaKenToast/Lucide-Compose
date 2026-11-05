package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptSwissFranc: ImageVector
    get() {
        val current = _receiptSwissFranc
        if (current != null) return current

        return ImageVector.Builder(
            name = "ReceiptSwissFranc",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11 h4 m-4 6 V7 h5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 6
                moveToRelative(dx = -4.0f, dy = 6.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
            }
            // M4 3 a1 1 0 0 1 1 -1 1.3 1.3 0 0 1 .7 .2 l.93 .6 a1.3 1.3 0 0 0 1.4 0 l.94 -.6 a1.3 1.3 0 0 1 1.4 0 l.93 .6 a1.3 1.3 0 0 0 1.4 0 l.93 -.6 a1.3 1.3 0 0 1 1.4 0 l.94 .6 a1.3 1.3 0 0 0 1.4 0 l.93 -.6 A1.3 1.3 0 0 1 19 2 a1 1 0 0 1 1 1 v18 a1 1 0 0 1 -1 1 1.3 1.3 0 0 1 -.7 -.2 l-.93 -.6 a1.3 1.3 0 0 0 -1.4 0 l-.94 .6 a1.3 1.3 0 0 1 -1.4 0 l-.93 -.6 a1.3 1.3 0 0 0 -1.4 0 l-.93 .6 a1.3 1.3 0 0 1 -1.4 0 l-.94 -.6 a1.3 1.3 0 0 0 -1.4 0 L5.7 21.8 A1.3 1.3 0 0 1 5 22 a1 1 0 0 1 -1 -1z m4 12 h5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 3
                moveTo(x = 4.0f, y = 3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1.3 1.3 0 0 1 0.7 0.2
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = 0.2f,
                )
                // l 0.93 0.6
                lineToRelative(dx = 0.93f, dy = 0.6f)
                // a 1.3 1.3 0 0 0 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.94 -0.6
                lineToRelative(dx = 0.94f, dy = -0.6f)
                // a 1.3 1.3 0 0 1 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.93 0.6
                lineToRelative(dx = 0.93f, dy = 0.6f)
                // a 1.3 1.3 0 0 0 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.93 -0.6
                lineToRelative(dx = 0.93f, dy = -0.6f)
                // a 1.3 1.3 0 0 1 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.94 0.6
                lineToRelative(dx = 0.94f, dy = 0.6f)
                // a 1.3 1.3 0 0 0 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.93 -0.6
                lineToRelative(dx = 0.93f, dy = -0.6f)
                // A 1.3 1.3 0 0 1 19 2
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 2.0f,
                )
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // a 1.3 1.3 0 0 1 -0.7 -0.2
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -0.2f,
                )
                // l -0.93 -0.6
                lineToRelative(dx = -0.93f, dy = -0.6f)
                // a 1.3 1.3 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.94 0.6
                lineToRelative(dx = -0.94f, dy = 0.6f)
                // a 1.3 1.3 0 0 1 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.93 -0.6
                lineToRelative(dx = -0.93f, dy = -0.6f)
                // a 1.3 1.3 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.93 0.6
                lineToRelative(dx = -0.93f, dy = 0.6f)
                // a 1.3 1.3 0 0 1 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.94 -0.6
                lineToRelative(dx = -0.94f, dy = -0.6f)
                // a 1.3 1.3 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 5.7 21.8
                lineTo(x = 5.7f, y = 21.8f)
                // A 1.3 1.3 0 0 1 5 22
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 22.0f,
                )
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
                // m 4 12
                moveToRelative(dx = 4.0f, dy = 12.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _receiptSwissFranc = it }
    }


@Suppress("ObjectPropertyName")
private var _receiptSwissFranc: ImageVector? = null
