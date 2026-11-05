package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snowflake: ImageVector
    get() {
        val current = _snowflake
        if (current != null) return current

        return ImageVector.Builder(
            name = "Snowflake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 20 -1.25 -2.5 L6 18 m4 -14 L8.75 6.5 6 6 m8 14 1.25 -2.5 L18 18 M14 4 l1.25 2.5 L18 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // l -1.25 -2.5
                lineToRelative(dx = -1.25f, dy = -2.5f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // L 8.75 6.5
                lineTo(x = 8.75f, y = 6.5f)
                // L 6 6
                lineTo(x = 6.0f, y = 6.0f)
                // m 8 14
                moveToRelative(dx = 8.0f, dy = 14.0f)
                // l 1.25 -2.5
                lineToRelative(dx = 1.25f, dy = -2.5f)
                // L 18 18
                lineTo(x = 18.0f, y = 18.0f)
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // l 1.25 2.5
                lineToRelative(dx = 1.25f, dy = 2.5f)
                // L 18 6
                lineTo(x = 18.0f, y = 6.0f)
            }
            // m17 21 -3 -6 h-4 m7 -12 -3 6 1.5 3 M2 12 h6.5 L10 9 m10 1 -1.5 2 1.5 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 21
                moveTo(x = 17.0f, y = 21.0f)
                // l -3 -6
                lineToRelative(dx = -3.0f, dy = -6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // m 7 -12
                moveToRelative(dx = 7.0f, dy = -12.0f)
                // l -3 6
                lineToRelative(dx = -3.0f, dy = 6.0f)
                // l 1.5 3
                lineToRelative(dx = 1.5f, dy = 3.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 6.5
                horizontalLineToRelative(dx = 6.5f)
                // L 10 9
                lineTo(x = 10.0f, y = 9.0f)
                // m 10 1
                moveToRelative(dx = 10.0f, dy = 1.0f)
                // l -1.5 2
                lineToRelative(dx = -1.5f, dy = 2.0f)
                // l 1.5 2
                lineToRelative(dx = 1.5f, dy = 2.0f)
            }
            // M22 12 h-6.5 L14 15 M4 10 l1.5 2 L4 14 m3 7 3 -6 -1.5 -3 M7 3 l3 6 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // h -6.5
                horizontalLineToRelative(dx = -6.5f)
                // L 14 15
                lineTo(x = 14.0f, y = 15.0f)
                // M 4 10
                moveTo(x = 4.0f, y = 10.0f)
                // l 1.5 2
                lineToRelative(dx = 1.5f, dy = 2.0f)
                // L 4 14
                lineTo(x = 4.0f, y = 14.0f)
                // m 3 7
                moveToRelative(dx = 3.0f, dy = 7.0f)
                // l 3 -6
                lineToRelative(dx = 3.0f, dy = -6.0f)
                // l -1.5 -3
                lineToRelative(dx = -1.5f, dy = -3.0f)
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // l 3 6
                lineToRelative(dx = 3.0f, dy = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _snowflake = it }
    }


@Suppress("ObjectPropertyName")
private var _snowflake: ImageVector? = null
