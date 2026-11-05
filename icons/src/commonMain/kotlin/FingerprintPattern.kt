package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FingerprintPattern: ImageVector
    get() {
        val current = _fingerprintPattern
        if (current != null) return current

        return ImageVector.Builder(
            name = "FingerprintPattern",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 10 a2 2 0 0 0 -2 2 c0 1.02 -.1 2.51 -.26 4 M14 13.12 c0 2.38 0 6.38 -1 8.88 m4.29 -.98 a45 45 0 0 0 .5 -3.02 M2 12 a10 10 0 0 1 18 -6 M2 16z m19.79 0 c.2 -2 .13 -5.35 0 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
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
                // c 0 1.02 -0.1 2.51 -0.26 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.02f,
                    dx2 = -0.1f,
                    dy2 = 2.51f,
                    dx3 = -0.26f,
                    dy3 = 4.0f,
                )
                // M 14 13.12
                moveTo(x = 14.0f, y = 13.12f)
                // c 0 2.38 0 6.38 -1 8.88
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.38f,
                    dx2 = 0.0f,
                    dy2 = 6.38f,
                    dx3 = -1.0f,
                    dy3 = 8.88f,
                )
                // m 4.29 -0.98
                moveToRelative(dx = 4.29f, dy = -0.98f)
                // a 45 45 0 0 0 0.5 -3.02
                arcToRelative(
                    a = 45.0f,
                    b = 45.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = -3.02f,
                )
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // a 10 10 0 0 1 18 -6
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 18.0f,
                    dy1 = -6.0f,
                )
                // M 2 16z
                moveTo(x = 2.0f, y = 16.0f)
                close()
                // m 19.79 0
                moveToRelative(dx = 19.79f, dy = 0.0f)
                // c 0.2 -2 0.13 -5.35 0 -6
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = -2.0f,
                    dx2 = 0.13f,
                    dy2 = -5.35f,
                    dx3 = 0.0f,
                    dy3 = -6.0f,
                )
            }
            // M5 19.5 C5.5 18 6 15 6 12 a6 6 0 0 1 .34 -2 m2.31 12 c.21 -.66 .45 -1.32 .57 -2 M9 6.8 a6 6 0 0 1 9 5.2 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 19.5
                moveTo(x = 5.0f, y = 19.5f)
                // C 5.5 18 6 15 6 12
                curveTo(
                    x1 = 5.5f,
                    y1 = 18.0f,
                    x2 = 6.0f,
                    y2 = 15.0f,
                    x3 = 6.0f,
                    y3 = 12.0f,
                )
                // a 6 6 0 0 1 0.34 -2
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.34f,
                    dy1 = -2.0f,
                )
                // m 2.31 12
                moveToRelative(dx = 2.31f, dy = 12.0f)
                // c 0.21 -0.66 0.45 -1.32 0.57 -2
                curveToRelative(
                    dx1 = 0.21f,
                    dy1 = -0.66f,
                    dx2 = 0.45f,
                    dy2 = -1.32f,
                    dx3 = 0.57f,
                    dy3 = -2.0f,
                )
                // M 9 6.8
                moveTo(x = 9.0f, y = 6.8f)
                // a 6 6 0 0 1 9 5.2
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 5.2f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _fingerprintPattern = it }
    }


@Suppress("ObjectPropertyName")
private var _fingerprintPattern: ImageVector? = null
