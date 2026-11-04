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

val Kanban: ImageVector
    get() {
        val current = _kanban
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Kanban",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 3 v14 m7 -14 v8 m7 -8 v18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m 7 -14
                moveToRelative(dx = 7.0f, dy = -14.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 7 -8
                moveToRelative(dx = 7.0f, dy = -8.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
            }
        }.build().also { _kanban = it }
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
                imageVector = Kanban,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _kanban: ImageVector? = null
