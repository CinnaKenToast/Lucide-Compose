package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CaseUpper: ImageVector
    get() {
        val current = _caseUpper
        if (current != null) return current

        return ImageVector.Builder(
            name = "CaseUpper",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 11 h4.5 a1 1 0 0 1 0 5 h-4 a.5 .5 0 0 1 -.5 -.5 v-9 A.5 .5 0 0 1 15.5 6 h3 a1 1 0 0 1 0 5 M2 16 l4.04 -9.69 a.5 .5 0 0 1 .92 0 L11 16 m-7.7 -3 h6.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 11
                moveTo(x = 15.0f, y = 11.0f)
                // h 4.5
                horizontalLineToRelative(dx = 4.5f)
                // a 1 1 0 0 1 0 5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 0.5 0.5 0 0 1 -0.5 -0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = -0.5f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // A 0.5 0.5 0 0 1 15.5 6
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.5f,
                    y1 = 6.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 1 1 0 0 1 0 5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // l 4.04 -9.69
                lineToRelative(dx = 4.04f, dy = -9.69f)
                // a 0.5 0.5 0 0 1 0.92 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.92f,
                    dy1 = 0.0f,
                )
                // L 11 16
                lineTo(x = 11.0f, y = 16.0f)
                // m -7.7 -3
                moveToRelative(dx = -7.7f, dy = -3.0f)
                // h 6.4
                horizontalLineToRelative(dx = 6.4f)
            }
        }.build().also { _caseUpper = it }
    }


@Suppress("ObjectPropertyName")
private var _caseUpper: ImageVector? = null
