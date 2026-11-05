package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ReceiptJapaneseYen: ImageVector
    get() {
        val current = _receiptJapaneseYen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ReceiptJapaneseYen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 10 3 -3 M4 3 a1 1 0 0 1 1 -1 1.3 1.3 0 0 1 .7 .2 l.93 .6 a1.3 1.3 0 0 0 1.4 0 l.94 -.6 a1.3 1.3 0 0 1 1.4 0 l.93 .6 a1.3 1.3 0 0 0 1.4 0 l.93 -.6 a1.3 1.3 0 0 1 1.4 0 l.94 .6 a1.3 1.3 0 0 0 1.4 0 l.93 -.6 A1.3 1.3 0 0 1 19 2 a1 1 0 0 1 1 1 v18 a1 1 0 0 1 -1 1 1.3 1.3 0 0 1 -.7 -.2 l-.93 -.6 a1.3 1.3 0 0 0 -1.4 0 l-.94 .6 a1.3 1.3 0 0 1 -1.4 0 l-.93 -.6 a1.3 1.3 0 0 0 -1.4 0 l-.93 .6 a1.3 1.3 0 0 1 -1.4 0 l-.94 -.6 a1.3 1.3 0 0 0 -1.4 0 L5.7 21.8 A1.3 1.3 0 0 1 5 22 a1 1 0 0 1 -1 -1z m5 8 h6 m-6 4 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
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
                // m 5 8
                moveToRelative(dx = 5.0f, dy = 8.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
            // m9 7 3 3 v7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
            }
        }.build().also { _receiptJapaneseYen = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptJapaneseYen: ImageVector? = null
