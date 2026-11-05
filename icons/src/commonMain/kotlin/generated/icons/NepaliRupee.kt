package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.NepaliRupee: ImageVector
    get() {
        val current = _nepaliRupee
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.NepaliRupee",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 20 -8 -8 h4 c5.33 0 5.33 -8 0 -8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // l -8 -8
                lineToRelative(dx = -8.0f, dy = -8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 5.33 0 5.33 -8 0 -8
                curveToRelative(
                    dx1 = 5.33f,
                    dy1 = 0.0f,
                    dx2 = 5.33f,
                    dy2 = -8.0f,
                    dx3 = 0.0f,
                    dy3 = -8.0f,
                )
            }
            // M14 8 c4.08 0 5.04 4.68 2.88 6.88 M6 4 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 8
                moveTo(x = 14.0f, y = 8.0f)
                // c 4.08 0 5.04 4.68 2.88 6.88
                curveToRelative(
                    dx1 = 4.08f,
                    dy1 = 0.0f,
                    dx2 = 5.04f,
                    dy2 = 4.68f,
                    dx3 = 2.88f,
                    dy3 = 6.88f,
                )
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _nepaliRupee = it }
    }

@Suppress("ObjectPropertyName")
private var _nepaliRupee: ImageVector? = null
