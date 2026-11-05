package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CreditCardX: ImageVector
    get() {
        val current = _creditCardX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CreditCardX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.5 19 H4 a2 2 0 0 1 -2 -2 V7 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v3.5 M2 10 h20 M6 14 h2 m8.5 .5 5 5 m0 -5 -5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.5 19
                moveTo(x = 12.5f, y = 19.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 6 14
                moveTo(x = 6.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 8.5 0.5
                moveToRelative(dx = 8.5f, dy = 0.5f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
        }.build().also { _creditCardX = it }
    }

@Suppress("ObjectPropertyName")
private var _creditCardX: ImageVector? = null
