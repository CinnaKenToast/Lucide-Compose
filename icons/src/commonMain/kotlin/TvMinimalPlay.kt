package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TvMinimalPlay: ImageVector
    get() {
        val current = _tvMinimalPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "TvMinimalPlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.03 9.44 a.65 .65 0 0 1 0 1.12 l-4.06 2.35 A.65 .65 0 0 1 10 12.35 v-4.7 a.65 .65 0 0 1 .97 -.56z M7 21 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.03 9.44
                moveTo(x = 15.03f, y = 9.44f)
                // a 0.65 0.65 0 0 1 0 1.12
                arcToRelative(
                    a = 0.65f,
                    b = 0.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.12f,
                )
                // l -4.06 2.35
                lineToRelative(dx = -4.06f, dy = 2.35f)
                // A 0.65 0.65 0 0 1 10 12.35
                arcTo(
                    horizontalEllipseRadius = 0.65f,
                    verticalEllipseRadius = 0.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 12.35f,
                )
                // v -4.7
                verticalLineToRelative(dy = -4.7f)
                // a 0.65 0.65 0 0 1 0.97 -0.56z
                arcToRelative(
                    a = 0.65f,
                    b = 0.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.97f,
                    dy1 = -0.56f,
                )
                close()
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
            // <rect width="20" height="14" rx="2.0" x="2.0" y="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _tvMinimalPlay = it }
    }


@Suppress("ObjectPropertyName")
private var _tvMinimalPlay: ImageVector? = null
