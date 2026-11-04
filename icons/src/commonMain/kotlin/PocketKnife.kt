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

val PocketKnife: ImageVector
    get() {
        val current = _pocketKnife
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PocketKnife",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 2 v1 c0 1 2 1 2 2 S3 6 3 7 s2 1 2 2 -2 1 -2 2 2 1 2 2 m13 -7 h.01 M6 18z m14.82 -9.17 a4 4 0 0 0 -5.66 -5.66 l-12 12 a4 4 0 1 0 5.66 5.66Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 2
                moveTo(x = 3.0f, y = 2.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 1 2 1 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // S 3 6 3 7
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 6.0f,
                    x2 = 3.0f,
                    y2 = 7.0f,
                )
                // s 2 1 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -2 1 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s 2 1 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // m 13 -7
                moveToRelative(dx = 13.0f, dy = -7.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 6 18z
                moveTo(x = 6.0f, y = 18.0f)
                close()
                // m 14.82 -9.17
                moveToRelative(dx = 14.82f, dy = -9.17f)
                // a 4 4 0 0 0 -5.66 -5.66
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.66f,
                    dy1 = -5.66f,
                )
                // l -12 12
                lineToRelative(dx = -12.0f, dy = 12.0f)
                // a 4 4 0 1 0 5.66 5.66z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.66f,
                    dy1 = 5.66f,
                )
                close()
            }
            // M18 11.66 V22 a4 4 0 0 0 4 -4 V6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 11.66
                moveTo(x = 18.0f, y = 11.66f)
                // V 22
                verticalLineTo(y = 22.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
            }
        }.build().also { _pocketKnife = it }
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
                imageVector = PocketKnife,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pocketKnife: ImageVector? = null
