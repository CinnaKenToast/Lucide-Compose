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

val HandFist: ImageVector
    get() {
        val current = _handFist
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.HandFist",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.04 17.01 a3 3 0 0 0 -3 -3 H8.72 a.72 .72 0 0 1 -.5 -1.23 l1.2 -1.2 a2 2 0 0 1 1.4 -.58 H12 a2 2 0 0 0 0 -4 H9.24 a3 3 0 0 0 -2.12 .88 l-2.7 2.7 A4.8 4.8 0 0 0 3 14 a8 8 0 0 0 8 8 h2 a8 8 0 0 0 8 -8 V7 a2 2 0 1 0 -4 0 v2 a2 2 0 1 0 4 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.04 17.01
                moveTo(x = 12.04f, y = 17.01f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // H 8.72
                horizontalLineTo(x = 8.72f)
                // a 0.72 0.72 0 0 1 -0.5 -1.23
                arcToRelative(
                    a = 0.72f,
                    b = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = -1.23f,
                )
                // l 1.2 -1.2
                lineToRelative(dx = 1.2f, dy = -1.2f)
                // a 2 2 0 0 1 1.4 -0.58
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = -0.58f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // H 9.24
                horizontalLineTo(x = 9.24f)
                // a 3 3 0 0 0 -2.12 0.88
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.12f,
                    dy1 = 0.88f,
                )
                // l -2.7 2.7
                lineToRelative(dx = -2.7f, dy = 2.7f)
                // A 4.8 4.8 0 0 0 3 14
                arcTo(
                    horizontalEllipseRadius = 4.8f,
                    verticalEllipseRadius = 4.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 14.0f,
                )
                // a 8 8 0 0 0 8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 8.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 8 8 0 0 0 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 2 2 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
            }
            // M13.89 9.66 A2 2 0 0 0 17 8 V5 a2 2 0 1 0 -4 0 M9 5 a2 2 0 1 0 -4 0 v5 m4 -3 V4 a2 2 0 1 1 4 0 v3.27
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.89 9.66
                moveTo(x = 13.89f, y = 9.66f)
                // A 2 2 0 0 0 17 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 8.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 4 -3
                moveToRelative(dx = 4.0f, dy = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 3.27
                verticalLineToRelative(dy = 3.27f)
            }
        }.build().also { _handFist = it }
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
                imageVector = HandFist,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _handFist: ImageVector? = null
