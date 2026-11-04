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

val Shovel: ImageVector
    get() {
        val current = _shovel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Shovel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.56 4.56 a1.5 1.5 0 0 1 0 2.12 l-.47 .47 a3 3 0 0 1 -4.21 -.03 3 3 0 0 1 0 -4.24 l.44 -.44 a1.5 1.5 0 0 1 2.12 0z M3 22 a1 1 0 0 1 -1 -1 v-3.59 a1 1 0 0 1 .3 -.7 l3.35 -3.36 a1.2 1.2 0 0 1 1.7 0 l3.3 3.3 a1.2 1.2 0 0 1 0 1.7 l-3.36 3.36 A1 1 0 0 1 6.6 22z m6 -7 7.88 -7.88
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.56 4.56
                moveTo(x = 21.56f, y = 4.56f)
                // a 1.5 1.5 0 0 1 0 2.12
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.12f,
                )
                // l -0.47 0.47
                lineToRelative(dx = -0.47f, dy = 0.47f)
                // a 3 3 0 0 1 -4.21 -0.03
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.21f,
                    dy1 = -0.03f,
                )
                // a 3 3 0 0 1 0 -4.24
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.24f,
                )
                // l 0.44 -0.44
                lineToRelative(dx = 0.44f, dy = -0.44f)
                // a 1.5 1.5 0 0 1 2.12 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.12f,
                    dy1 = 0.0f,
                )
                close()
                // M 3 22
                moveTo(x = 3.0f, y = 22.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -3.59
                verticalLineToRelative(dy = -3.59f)
                // a 1 1 0 0 1 0.3 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = -0.7f,
                )
                // l 3.35 -3.36
                lineToRelative(dx = 3.35f, dy = -3.36f)
                // a 1.2 1.2 0 0 1 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 3.3 3.3
                lineToRelative(dx = 3.3f, dy = 3.3f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -3.36 3.36
                lineToRelative(dx = -3.36f, dy = 3.36f)
                // A 1 1 0 0 1 6.6 22z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.6f,
                    y1 = 22.0f,
                )
                close()
                // m 6 -7
                moveToRelative(dx = 6.0f, dy = -7.0f)
                // l 7.88 -7.88
                lineToRelative(dx = 7.88f, dy = -7.88f)
            }
        }.build().also { _shovel = it }
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
                imageVector = Shovel,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shovel: ImageVector? = null
