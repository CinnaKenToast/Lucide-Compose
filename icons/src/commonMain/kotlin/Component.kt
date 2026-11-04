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

val Component: ImageVector
    get() {
        val current = _component
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Component",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.54 11.3 a1 1 0 0 0 0 1.4 l2.37 2.38 a1 1 0 0 0 1.42 0 l2.37 -2.37 a1 1 0 0 0 0 -1.42 l-2.37 -2.37 a1 1 0 0 0 -1.42 0z m-13.24 0 a1 1 0 0 0 0 1.4 l2.37 2.38 a1 1 0 0 0 1.42 0 l2.38 -2.37 a1 1 0 0 0 0 -1.42 L6.09 8.92 a1 1 0 0 0 -1.42 0z m6.62 6.61 a1 1 0 0 0 0 1.42 l2.37 2.37 a1 1 0 0 0 1.42 0 l2.37 -2.37 a1 1 0 0 0 0 -1.42 l-2.37 -2.37 a1 1 0 0 0 -1.42 0z m0 -13.24 a1 1 0 0 0 0 1.42 l2.37 2.37 a1 1 0 0 0 1.42 0 l2.37 -2.37 a1 1 0 0 0 0 -1.42 L12.71 2.3 a1 1 0 0 0 -1.42 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.54 11.3
                moveTo(x = 15.54f, y = 11.3f)
                // a 1 1 0 0 0 0 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                )
                // l 2.37 2.38
                lineToRelative(dx = 2.37f, dy = 2.38f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // l 2.37 -2.37
                lineToRelative(dx = 2.37f, dy = -2.37f)
                // a 1 1 0 0 0 0 -1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.42f,
                )
                // l -2.37 -2.37
                lineToRelative(dx = -2.37f, dy = -2.37f)
                // a 1 1 0 0 0 -1.42 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                close()
                // m -13.24 0
                moveToRelative(dx = -13.24f, dy = 0.0f)
                // a 1 1 0 0 0 0 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                )
                // l 2.37 2.38
                lineToRelative(dx = 2.37f, dy = 2.38f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // l 2.38 -2.37
                lineToRelative(dx = 2.38f, dy = -2.37f)
                // a 1 1 0 0 0 0 -1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.42f,
                )
                // L 6.09 8.92
                lineTo(x = 6.09f, y = 8.92f)
                // a 1 1 0 0 0 -1.42 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                close()
                // m 6.62 6.61
                moveToRelative(dx = 6.62f, dy = 6.61f)
                // a 1 1 0 0 0 0 1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                // l 2.37 2.37
                lineToRelative(dx = 2.37f, dy = 2.37f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // l 2.37 -2.37
                lineToRelative(dx = 2.37f, dy = -2.37f)
                // a 1 1 0 0 0 0 -1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.42f,
                )
                // l -2.37 -2.37
                lineToRelative(dx = -2.37f, dy = -2.37f)
                // a 1 1 0 0 0 -1.42 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                close()
                // m 0 -13.24
                moveToRelative(dx = 0.0f, dy = -13.24f)
                // a 1 1 0 0 0 0 1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                // l 2.37 2.37
                lineToRelative(dx = 2.37f, dy = 2.37f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // l 2.37 -2.37
                lineToRelative(dx = 2.37f, dy = -2.37f)
                // a 1 1 0 0 0 0 -1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.42f,
                )
                // L 12.71 2.3
                lineTo(x = 12.71f, y = 2.3f)
                // a 1 1 0 0 0 -1.42 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _component = it }
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
                imageVector = Component,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _component: ImageVector? = null
