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

val PiggyBank: ImageVector
    get() {
        val current = _piggyBank
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.PiggyBank",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 17 h3 v2 a1 1 0 0 0 1 1 h2 a1 1 0 0 0 1 -1 v-3 a3.2 3.2 0 0 0 2 -2 h1 a1 1 0 0 0 1 -1 v-2 a1 1 0 0 0 -1 -1 h-1 a5 5 0 0 0 -2 -4 V3 a4 4 0 0 0 -3.2 1.6 L14.5 5 H11 a6 6 0 0 0 -6 6 v1 a5 5 0 0 0 2 4 v3 a1 1 0 0 0 1 1 h2 a1 1 0 0 0 1 -1z m5 -7 h.01 M2 8 v1 a2 2 0 0 0 2 2 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 17
                moveTo(x = 11.0f, y = 17.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 3.2 3.2 0 0 0 2 -2
                arcToRelative(
                    a = 3.2f,
                    b = 3.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 5 5 0 0 0 -2 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -4.0f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // a 4 4 0 0 0 -3.2 1.6
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.2f,
                    dy1 = 1.6f,
                )
                // L 14.5 5
                lineTo(x = 14.5f, y = 5.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 6 6 0 0 0 -6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 6.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 5 5 0 0 0 2 4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 4.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // m 5 -7
                moveToRelative(dx = 5.0f, dy = -7.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _piggyBank = it }
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
                imageVector = PiggyBank,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _piggyBank: ImageVector? = null
