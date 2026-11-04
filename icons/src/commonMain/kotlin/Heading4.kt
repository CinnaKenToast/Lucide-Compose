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

val Heading4: ImageVector
    get() {
        val current = _heading4
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Heading4",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 V6 m5 4 v3 a1 1 0 0 0 1 1 h3 m0 -4 v8 M4 12 h8 m-8 6 V6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // m 5 4
                moveToRelative(dx = 5.0f, dy = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 6
                moveToRelative(dx = -8.0f, dy = 6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
            }
        }.build().also { _heading4 = it }
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
                imageVector = Heading4,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _heading4: ImageVector? = null
