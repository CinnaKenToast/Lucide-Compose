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

val ArrowUpFromLine: ImageVector
    get() {
        val current = _arrowUpFromLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ArrowUpFromLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 9 -6 -6 -6 6 m6 -6 v14 m-7 4 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // m 6 -6
                moveToRelative(dx = 6.0f, dy = -6.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m -7 4
                moveToRelative(dx = -7.0f, dy = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _arrowUpFromLine = it }
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
                imageVector = ArrowUpFromLine,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowUpFromLine: ImageVector? = null
