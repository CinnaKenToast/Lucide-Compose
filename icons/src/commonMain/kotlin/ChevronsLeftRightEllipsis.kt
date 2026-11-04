package com.shipsco.lucide_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ChevronsLeftRightEllipsis: ImageVector
    get() {
        val current = _chevronsLeftRightEllipsis
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ChevronsLeftRightEllipsis",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12z M16 12 h.01 M17 7 l5 5 -5 5 M7 7 l-5 5 5 5 m1 -5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12z
                moveTo(x = 12.0f, y = 12.0f)
                close()
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 17 7
                moveTo(x = 17.0f, y = 7.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m 1 -5z
                moveToRelative(dx = 1.0f, dy = -5.0f)
                close()
            }
        }.build().also { _chevronsLeftRightEllipsis = it }
    }

@Preview
@Composable
private fun IconPreview() {
    com.shipsco.theme.AppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = ChevronsLeftRightEllipsis,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronsLeftRightEllipsis: ImageVector? = null
