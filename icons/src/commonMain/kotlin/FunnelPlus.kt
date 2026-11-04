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

val FunnelPlus: ImageVector
    get() {
        val current = _funnelPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.FunnelPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.35 3 H3 a1 1 0 0 0 -.74 1.67 l7.22 7.99 A2 2 0 0 1 10 14 v6 a1 1 0 0 0 .55 .9 l2 1 A1 1 0 0 0 14 21 v-7 a2 2 0 0 1 .52 -1.34 l1.21 -1.35 M16 6 h6 m-3 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.35 3
                moveTo(x = 13.35f, y = 3.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -0.74 1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.74f,
                    dy1 = 1.67f,
                )
                // l 7.22 7.99
                lineToRelative(dx = 7.22f, dy = 7.99f)
                // A 2 2 0 0 1 10 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 14.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 1 1 0 0 0 0.55 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.55f,
                    dy1 = 0.9f,
                )
                // l 2 1
                lineToRelative(dx = 2.0f, dy = 1.0f)
                // A 1 1 0 0 0 14 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 21.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 2 2 0 0 1 0.52 -1.34
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.52f,
                    dy1 = -1.34f,
                )
                // l 1.21 -1.35
                lineToRelative(dx = 1.21f, dy = -1.35f)
                // M 16 6
                moveTo(x = 16.0f, y = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _funnelPlus = it }
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
                imageVector = FunnelPlus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _funnelPlus: ImageVector? = null
