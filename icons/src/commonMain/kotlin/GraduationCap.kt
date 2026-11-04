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

val GraduationCap: ImageVector
    get() {
        val current = _graduationCap
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.GraduationCap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.42 10.92 a1 1 0 0 0 -.02 -1.84 l-8.57 -3.9 a2 2 0 0 0 -1.66 0 L2.6 9.08 a1 1 0 0 0 0 1.83 l8.57 3.91 a2 2 0 0 0 1.66 0z M22 10 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.42 10.92
                moveTo(x = 21.42f, y = 10.92f)
                // a 1 1 0 0 0 -0.02 -1.84
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.02f,
                    dy1 = -1.84f,
                )
                // l -8.57 -3.9
                lineToRelative(dx = -8.57f, dy = -3.9f)
                // a 2 2 0 0 0 -1.66 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.66f,
                    dy1 = 0.0f,
                )
                // L 2.6 9.08
                lineTo(x = 2.6f, y = 9.08f)
                // a 1 1 0 0 0 0 1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.83f,
                )
                // l 8.57 3.91
                lineToRelative(dx = 8.57f, dy = 3.91f)
                // a 2 2 0 0 0 1.66 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.66f,
                    dy1 = 0.0f,
                )
                close()
                // M 22 10
                moveTo(x = 22.0f, y = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // M6 12.5 V16 a6 3 0 0 0 12 0 v-3.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 12.5
                moveTo(x = 6.0f, y = 12.5f)
                // V 16
                verticalLineTo(y = 16.0f)
                // a 6 3 0 0 0 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // v -3.5
                verticalLineToRelative(dy = -3.5f)
            }
        }.build().also { _graduationCap = it }
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
                imageVector = GraduationCap,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _graduationCap: ImageVector? = null
