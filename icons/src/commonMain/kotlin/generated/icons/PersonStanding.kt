package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PersonStanding: ImageVector
    get() {
        val current = _personStanding
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PersonStanding",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="5.0" radius="1.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m9 20 3 -6 3 6 M6 8 l6 2 6 -2 m-6 2 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
                // l 3 -6
                lineToRelative(dx = 3.0f, dy = -6.0f)
                // l 3 6
                lineToRelative(dx = 3.0f, dy = 6.0f)
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // l 6 2
                lineToRelative(dx = 6.0f, dy = 2.0f)
                // l 6 -2
                lineToRelative(dx = 6.0f, dy = -2.0f)
                // m -6 2
                moveToRelative(dx = -6.0f, dy = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _personStanding = it }
    }

@Suppress("ObjectPropertyName")
private var _personStanding: ImageVector? = null
