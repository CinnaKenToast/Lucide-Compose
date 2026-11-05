package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UtilityPole: ImageVector
    get() {
        val current = _utilityPole
        if (current != null) return current

        return ImageVector.Builder(
            name = "UtilityPole",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v20 M2 5 h20 M3 3 v2 m4 -2 v2 m10 -2 v2 m4 -2 v2 m-2 0 -7 7 -7 -7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 10 -2
                moveToRelative(dx = 10.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
            }
        }.build().also { _utilityPole = it }
    }


@Suppress("ObjectPropertyName")
private var _utilityPole: ImageVector? = null
