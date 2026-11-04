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

val LibraryBig: ImageVector
    get() {
        val current = _libraryBig
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LibraryBig",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <rect width="8" height="18" rx="1.0" x="3.0" y="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 4
                moveTo(x = 3.0f, y = 4.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
            // M7 3 v18 m13.4 -2.1 c.2 .5 -.1 1.1 -.6 1.3 l-1.9 .7 c-.5 .2 -1.1 -.1 -1.3 -.6 L11.1 5.1 c-.2 -.5 .1 -1.1 .6 -1.3 l1.9 -.7 c.5 -.2 1.1 .1 1.3 .6Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 13.4 -2.1
                moveToRelative(dx = 13.4f, dy = -2.1f)
                // c 0.2 0.5 -0.1 1.1 -0.6 1.3
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = 0.5f,
                    dx2 = -0.1f,
                    dy2 = 1.1f,
                    dx3 = -0.6f,
                    dy3 = 1.3f,
                )
                // l -1.9 0.7
                lineToRelative(dx = -1.9f, dy = 0.7f)
                // c -0.5 0.2 -1.1 -0.1 -1.3 -0.6
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.2f,
                    dx2 = -1.1f,
                    dy2 = -0.1f,
                    dx3 = -1.3f,
                    dy3 = -0.6f,
                )
                // L 11.1 5.1
                lineTo(x = 11.1f, y = 5.1f)
                // c -0.2 -0.5 0.1 -1.1 0.6 -1.3
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = -0.5f,
                    dx2 = 0.1f,
                    dy2 = -1.1f,
                    dx3 = 0.6f,
                    dy3 = -1.3f,
                )
                // l 1.9 -0.7
                lineToRelative(dx = 1.9f, dy = -0.7f)
                // c 0.5 -0.2 1.1 0.1 1.3 0.6z
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.2f,
                    dx2 = 1.1f,
                    dy2 = 0.1f,
                    dx3 = 1.3f,
                    dy3 = 0.6f,
                )
                close()
            }
        }.build().also { _libraryBig = it }
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
                imageVector = LibraryBig,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _libraryBig: ImageVector? = null
