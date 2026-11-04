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

val ListFilterPlus: ImageVector
    get() {
        val current = _listFilterPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ListFilterPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 5 H2 m4 7 h12 m-9 7 h6 m1 -14 h6 m-3 3 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // m -9 7
                moveToRelative(dx = -9.0f, dy = 7.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m 1 -14
                moveToRelative(dx = 1.0f, dy = -14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 3
                moveToRelative(dx = -3.0f, dy = 3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _listFilterPlus = it }
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
                imageVector = ListFilterPlus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _listFilterPlus: ImageVector? = null
