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

val GapHorizontal: ImageVector
    get() {
        val current = _gapHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.GapHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v2 m0 4 v2 m0 4 v2 m0 4 v2 m9 -19 h-3 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h3 M3 3 h3 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 H3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 9 -19
                moveToRelative(dx = 9.0f, dy = -19.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _gapHorizontal = it }
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
                imageVector = GapHorizontal,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _gapHorizontal: ImageVector? = null
