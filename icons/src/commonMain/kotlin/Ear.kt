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

val Ear: ImageVector
    get() {
        val current = _ear
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Ear",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 8.5 a6.5 6.5 0 1 1 13 0 c0 6 -6 6 -6 10 a3.5 3.5 0 1 1 -7 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 8.5
                moveTo(x = 6.0f, y = 8.5f)
                // a 6.5 6.5 0 1 1 13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 13.0f,
                    dy1 = 0.0f,
                )
                // c 0 6 -6 6 -6 10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 10.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M15 8.5 a2.5 2.5 0 0 0 -5 0 v1 a2 2 0 1 1 0 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 8.5
                moveTo(x = 15.0f, y = 8.5f)
                // a 2.5 2.5 0 0 0 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 2 2 0 1 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
            }
        }.build().also { _ear = it }
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
                imageVector = Ear,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _ear: ImageVector? = null
