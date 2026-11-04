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

val Binoculars: ImageVector
    get() {
        val current = _binoculars
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Binoculars",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 h4 m5 -3 V4 a1 1 0 0 0 -1 -1 h-2 a1 1 0 0 0 -1 1 v3 m5 14 a2 2 0 0 0 2 -2 v-3.85 c0 -1.4 -2 -2.96 -2 -4.83 V8 a1 1 0 0 0 -1 -1 h-4 a1 1 0 0 0 -1 1 v11 a2 2 0 0 0 2 2z m2 -5 H2 m2 5 a2 2 0 0 1 -2 -2 v-3.85 c0 -1.4 2 -2.96 2 -4.83 V8 a1 1 0 0 1 1 -1 h4 a1 1 0 0 1 1 1 v11 a2 2 0 0 1 -2 2z M9 7 V4 a1 1 0 0 0 -1 -1 H6 a1 1 0 0 0 -1 1 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 5 14
                moveToRelative(dx = 5.0f, dy = 14.0f)
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
                // v -3.85
                verticalLineToRelative(dy = -3.85f)
                // c 0 -1.4 -2 -2.96 -2 -4.83
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                    dx2 = -2.0f,
                    dy2 = -2.96f,
                    dx3 = -2.0f,
                    dy3 = -4.83f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // a 2 2 0 0 0 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 2 -5
                moveToRelative(dx = 2.0f, dy = -5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 2 5
                moveToRelative(dx = 2.0f, dy = 5.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -3.85
                verticalLineToRelative(dy = -3.85f)
                // c 0 -1.4 2 -2.96 2 -4.83
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                    dx2 = 2.0f,
                    dy2 = -2.96f,
                    dx3 = 2.0f,
                    dy3 = -4.83f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // a 2 2 0 0 1 -2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _binoculars = it }
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
                imageVector = Binoculars,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _binoculars: ImageVector? = null
