package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TestTube: ImageVector
    get() {
        val current = _testTube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TestTube",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.5 2 v17.5 c0 1.4 -1.1 2.5 -2.5 2.5 s-2.5 -1.1 -2.5 -2.5 V2 m-1 0 h7 m-1 14 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.5 2
                moveTo(x = 14.5f, y = 2.0f)
                // v 17.5
                verticalLineToRelative(dy = 17.5f)
                // c 0 1.4 -1.1 2.5 -2.5 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                    dx2 = -1.1f,
                    dy2 = 2.5f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // s -2.5 -1.1 -2.5 -2.5
                reflectiveCurveToRelative(
                    dx1 = -2.5f,
                    dy1 = -1.1f,
                    dx2 = -2.5f,
                    dy2 = -2.5f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // m -1 14
                moveToRelative(dx = -1.0f, dy = 14.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
        }.build().also { _testTube = it }
    }

@Suppress("ObjectPropertyName")
private var _testTube: ImageVector? = null
