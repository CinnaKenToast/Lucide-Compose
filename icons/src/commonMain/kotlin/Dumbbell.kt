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

val Dumbbell: ImageVector
    get() {
        val current = _dumbbell
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Dumbbell",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17.6 12.77 a2 2 0 1 0 2.82 -2.83 l-1.76 -1.77 a2 2 0 0 0 2.83 -2.83 l-2.83 -2.82 a2 2 0 0 0 -2.83 2.82 l-1.77 -1.76 a2 2 0 1 0 -2.83 2.82z M2.5 21.5 l1.4 -1.4 M20.1 3.9 l1.4 -1.4 M5.34 21.49 a2 2 0 1 0 2.83 -2.83 l1.77 1.77 a2 2 0 1 0 2.83 -2.83 L6.4 11.23 a2 2 0 1 0 -2.82 2.83 l1.76 1.77 a2 2 0 0 0 -2.82 2.83z M9.6 14.4 l4.8 -4.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.6 12.77
                moveTo(x = 17.6f, y = 12.77f)
                // a 2 2 0 1 0 2.82 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.82f,
                    dy1 = -2.83f,
                )
                // l -1.76 -1.77
                lineToRelative(dx = -1.76f, dy = -1.77f)
                // a 2 2 0 0 0 2.83 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.83f,
                    dy1 = -2.83f,
                )
                // l -2.83 -2.82
                lineToRelative(dx = -2.83f, dy = -2.82f)
                // a 2 2 0 0 0 -2.83 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 2.82f,
                )
                // l -1.77 -1.76
                lineToRelative(dx = -1.77f, dy = -1.76f)
                // a 2 2 0 1 0 -2.83 2.82z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 2.82f,
                )
                close()
                // M 2.5 21.5
                moveTo(x = 2.5f, y = 21.5f)
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // M 20.1 3.9
                moveTo(x = 20.1f, y = 3.9f)
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // M 5.34 21.49
                moveTo(x = 5.34f, y = 21.49f)
                // a 2 2 0 1 0 2.83 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.83f,
                    dy1 = -2.83f,
                )
                // l 1.77 1.77
                lineToRelative(dx = 1.77f, dy = 1.77f)
                // a 2 2 0 1 0 2.83 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.83f,
                    dy1 = -2.83f,
                )
                // L 6.4 11.23
                lineTo(x = 6.4f, y = 11.23f)
                // a 2 2 0 1 0 -2.82 2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 2.83f,
                )
                // l 1.76 1.77
                lineToRelative(dx = 1.76f, dy = 1.77f)
                // a 2 2 0 0 0 -2.82 2.83z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 2.83f,
                )
                close()
                // M 9.6 14.4
                moveTo(x = 9.6f, y = 14.4f)
                // l 4.8 -4.8
                lineToRelative(dx = 4.8f, dy = -4.8f)
            }
        }.build().also { _dumbbell = it }
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
                imageVector = Dumbbell,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _dumbbell: ImageVector? = null
