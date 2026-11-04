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

val MoveDiagonal2: ImageVector
    get() {
        val current = _moveDiagonal2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MoveDiagonal2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 13 v6 h-6 m-8 -8 V5 h6 M5 5 l14 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 13
                moveTo(x = 19.0f, y = 13.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // m -8 -8
                moveToRelative(dx = -8.0f, dy = -8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 5 5
                moveTo(x = 5.0f, y = 5.0f)
                // l 14 14
                lineToRelative(dx = 14.0f, dy = 14.0f)
            }
        }.build().also { _moveDiagonal2 = it }
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
                imageVector = MoveDiagonal2,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _moveDiagonal2: ImageVector? = null
