package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DraftingCompass: ImageVector
    get() {
        val current = _draftingCompass
        if (current != null) return current

        return ImageVector.Builder(
            name = "DraftingCompass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12.99 6.74 1.93 3.44 M19.14 12 a10 10 0 0 1 -14.28 0 M21 21 l-2.16 -3.84 M3 21 l8.02 -14.26
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.99 6.74
                moveTo(x = 12.99f, y = 6.74f)
                // l 1.93 3.44
                lineToRelative(dx = 1.93f, dy = 3.44f)
                // M 19.14 12
                moveTo(x = 19.14f, y = 12.0f)
                // a 10 10 0 0 1 -14.28 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.28f,
                    dy1 = 0.0f,
                )
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // l -2.16 -3.84
                lineToRelative(dx = -2.16f, dy = -3.84f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // l 8.02 -14.26
                lineToRelative(dx = 8.02f, dy = -14.26f)
            }
            // <circle cx="12.0" cy="5.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _draftingCompass = it }
    }


@Suppress("ObjectPropertyName")
private var _draftingCompass: ImageVector? = null
