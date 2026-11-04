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

val Container: ImageVector
    get() {
        val current = _container
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Container",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 7.7 c0 -.6 -.4 -1.2 -.8 -1.5 l-6.3 -3.9 a1.7 1.7 0 0 0 -1.7 0 l-10.3 6 A1.6 1.6 0 0 0 2 9.7 v6.6 c0 .5 .4 1.2 .8 1.5 l6.3 3.9 a1.7 1.7 0 0 0 1.7 0 l10.3 -6 c.5 -.3 .9 -1 .9 -1.5Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 7.7
                moveTo(x = 22.0f, y = 7.7f)
                // c 0 -0.6 -0.4 -1.2 -0.8 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.6f,
                    dx2 = -0.4f,
                    dy2 = -1.2f,
                    dx3 = -0.8f,
                    dy3 = -1.5f,
                )
                // l -6.3 -3.9
                lineToRelative(dx = -6.3f, dy = -3.9f)
                // a 1.7 1.7 0 0 0 -1.7 0
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -10.3 6
                lineToRelative(dx = -10.3f, dy = 6.0f)
                // A 1.6 1.6 0 0 0 2 9.7
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 9.7f,
                )
                // v 6.6
                verticalLineToRelative(dy = 6.6f)
                // c 0 0.5 0.4 1.2 0.8 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = 0.4f,
                    dy2 = 1.2f,
                    dx3 = 0.8f,
                    dy3 = 1.5f,
                )
                // l 6.3 3.9
                lineToRelative(dx = 6.3f, dy = 3.9f)
                // a 1.7 1.7 0 0 0 1.7 0
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 10.3 -6
                lineToRelative(dx = 10.3f, dy = -6.0f)
                // c 0.5 -0.3 0.9 -1 0.9 -1.5z
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.3f,
                    dx2 = 0.9f,
                    dy2 = -1.0f,
                    dx3 = 0.9f,
                    dy3 = -1.5f,
                )
                close()
            }
            // M10 21.9 V14 L2.1 9.1 M10 14 l11.9 -6.9 M14 19.8 v-8.1 m4 5.8 V9.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 21.9
                moveTo(x = 10.0f, y = 21.9f)
                // V 14
                verticalLineTo(y = 14.0f)
                // L 2.1 9.1
                lineTo(x = 2.1f, y = 9.1f)
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // l 11.9 -6.9
                lineToRelative(dx = 11.9f, dy = -6.9f)
                // M 14 19.8
                moveTo(x = 14.0f, y = 19.8f)
                // v -8.1
                verticalLineToRelative(dy = -8.1f)
                // m 4 5.8
                moveToRelative(dx = 4.0f, dy = 5.8f)
                // V 9.4
                verticalLineTo(y = 9.4f)
            }
        }.build().also { _container = it }
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
                imageVector = Container,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _container: ImageVector? = null
