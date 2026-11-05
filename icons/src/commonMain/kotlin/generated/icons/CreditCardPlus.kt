package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CreditCardPlus: ImageVector
    get() {
        val current = _creditCardPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CreditCardPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 11.35 V7 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v10 a2 2 0 0 0 2 2 h8.54 M22 10 H2 m4 4 h2 m8 3 h6 m-3 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 11.35
                moveTo(x = 22.0f, y = 11.35f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 8.54
                horizontalLineToRelative(dx = 8.54f)
                // M 22 10
                moveTo(x = 22.0f, y = 10.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 8 3
                moveToRelative(dx = 8.0f, dy = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _creditCardPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _creditCardPlus: ImageVector? = null
