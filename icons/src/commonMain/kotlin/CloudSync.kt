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

val CloudSync: ImageVector
    get() {
        val current = _cloudSync
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CloudSync",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 18 -1.53 1.6 a5 5 0 0 1 -8 -1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 18
                moveTo(x = 17.0f, y = 18.0f)
                // l -1.53 1.6
                lineToRelative(dx = -1.53f, dy = 1.6f)
                // a 5 5 0 0 1 -8 -1.5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = -1.5f,
                )
            }
            // M17 22 v-4 h-4 m8 -2.75 A4.5 4.5 0 0 0 17.5 8 h-1.8 A7 7 0 1 0 3 13.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 22
                moveTo(x = 17.0f, y = 22.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // m 8 -2.75
                moveToRelative(dx = 8.0f, dy = -2.75f)
                // A 4.5 4.5 0 0 0 17.5 8
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.5f,
                    y1 = 8.0f,
                )
                // h -1.8
                horizontalLineToRelative(dx = -1.8f)
                // A 7 7 0 1 0 3 13.6
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 13.6f,
                )
            }
            // M7 10 v4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 10
                moveTo(x = 7.0f, y = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // m7 14 1.54 -1.6 a5 5 0 0 1 8 1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 14
                moveTo(x = 7.0f, y = 14.0f)
                // l 1.54 -1.6
                lineToRelative(dx = 1.54f, dy = -1.6f)
                // a 5 5 0 0 1 8 1.5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 1.5f,
                )
            }
        }.build().also { _cloudSync = it }
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
                imageVector = CloudSync,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cloudSync: ImageVector? = null
