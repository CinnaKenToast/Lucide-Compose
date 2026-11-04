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

val NotebookPen: ImageVector
    get() {
        val current = _notebookPen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.NotebookPen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.4 2 H6 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 v-7.4 M2 6 h4 m-4 4 h4 m-4 4 h4 m-4 4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.4 2
                moveTo(x = 13.4f, y = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -7.4
                verticalLineToRelative(dy = -7.4f)
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // M21.38 5.63 a1 1 0 1 0 -3 -3 l-5.02 5 a2 2 0 0 0 -.5 .86 l-.84 2.87 a.5 .5 0 0 0 .62 .62 l2.87 -.84 a2 2 0 0 0 .85 -.5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.38 5.63
                moveTo(x = 21.38f, y = 5.63f)
                // a 1 1 0 1 0 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // l -5.02 5
                lineToRelative(dx = -5.02f, dy = 5.0f)
                // a 2 2 0 0 0 -0.5 0.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 0.86f,
                )
                // l -0.84 2.87
                lineToRelative(dx = -0.84f, dy = 2.87f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // l 2.87 -0.84
                lineToRelative(dx = 2.87f, dy = -0.84f)
                // a 2 2 0 0 0 0.85 -0.5z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.85f,
                    dy1 = -0.5f,
                )
                close()
            }
        }.build().also { _notebookPen = it }
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
                imageVector = NotebookPen,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _notebookPen: ImageVector? = null
