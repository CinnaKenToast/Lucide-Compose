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

val StarCheck: ImageVector
    get() {
        val current = _starCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.StarCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m19.06 12.5 2.78 -2.7 a.53 .53 0 0 0 -.3 -.91 l-5.16 -.76 a2.1 2.1 0 0 1 -1.6 -1.16 l-2.3 -4.68 a.53 .53 0 0 0 -.96 0 l-2.3 4.68 a2.1 2.1 0 0 1 -1.6 1.16 L2.45 8.9 a.53 .53 0 0 0 -.29 .9 l3.74 3.64 a2.1 2.1 0 0 1 .6 1.88 l-.87 5.14 a.53 .53 0 0 0 .77 .56 L11 18.58 l.03 -.01 M15 18 l2 2 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.06 12.5
                moveTo(x = 19.06f, y = 12.5f)
                // l 2.78 -2.7
                lineToRelative(dx = 2.78f, dy = -2.7f)
                // a 0.53 0.53 0 0 0 -0.3 -0.91
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -0.91f,
                )
                // l -5.16 -0.76
                lineToRelative(dx = -5.16f, dy = -0.76f)
                // a 2.1 2.1 0 0 1 -1.6 -1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.6f,
                    dy1 = -1.16f,
                )
                // l -2.3 -4.68
                lineToRelative(dx = -2.3f, dy = -4.68f)
                // a 0.53 0.53 0 0 0 -0.96 0
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = 0.0f,
                )
                // l -2.3 4.68
                lineToRelative(dx = -2.3f, dy = 4.68f)
                // a 2.1 2.1 0 0 1 -1.6 1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.6f,
                    dy1 = 1.16f,
                )
                // L 2.45 8.9
                lineTo(x = 2.45f, y = 8.9f)
                // a 0.53 0.53 0 0 0 -0.29 0.9
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.29f,
                    dy1 = 0.9f,
                )
                // l 3.74 3.64
                lineToRelative(dx = 3.74f, dy = 3.64f)
                // a 2.1 2.1 0 0 1 0.6 1.88
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.6f,
                    dy1 = 1.88f,
                )
                // l -0.87 5.14
                lineToRelative(dx = -0.87f, dy = 5.14f)
                // a 0.53 0.53 0 0 0 0.77 0.56
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.77f,
                    dy1 = 0.56f,
                )
                // L 11 18.58
                lineTo(x = 11.0f, y = 18.58f)
                // l 0.03 -0.01
                lineToRelative(dx = 0.03f, dy = -0.01f)
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _starCheck = it }
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
                imageVector = StarCheck,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _starCheck: ImageVector? = null
