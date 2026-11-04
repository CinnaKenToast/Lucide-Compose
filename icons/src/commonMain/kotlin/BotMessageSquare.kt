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

val BotMessageSquare: ImageVector
    get() {
        val current = _botMessageSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BotMessageSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 V2 H8 m7 9 v2 M2 12 h2 m16 0 h2 m-2 4 a2 2 0 0 1 -2 2 H8.83 a2 2 0 0 0 -1.42 .59 l-2.2 2.2 A.71 .71 0 0 1 4 20.29 V8 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2z M9 11 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 7 9
                moveToRelative(dx = 7.0f, dy = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 4
                moveToRelative(dx = -2.0f, dy = 4.0f)
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
                // H 8.83
                horizontalLineTo(x = 8.83f)
                // a 2 2 0 0 0 -1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.59f,
                )
                // l -2.2 2.2
                lineToRelative(dx = -2.2f, dy = 2.2f)
                // A 0.71 0.71 0 0 1 4 20.29
                arcTo(
                    horizontalEllipseRadius = 0.71f,
                    verticalEllipseRadius = 0.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 20.29f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 9 11
                moveTo(x = 9.0f, y = 11.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _botMessageSquare = it }
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
                imageVector = BotMessageSquare,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _botMessageSquare: ImageVector? = null
