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

val BookDashed: ImageVector
    get() {
        val current = _bookDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BookDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 h1.5 M12 22 h1.5 M12 2 h1.5 m4 20 H19 a1 1 0 0 0 1 -1 M17.5 2 H19 a1 1 0 0 1 1 1 v1.5 m0 9.5 v3 h-2.5 M20 8.5 V10 M4 10 V8.5 m0 11 V14 m0 -9.5 A2.5 2.5 0 0 1 6.5 2 H8 m0 20 H6.5 a1 1 0 0 1 0 -5 H8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // m 4 20
                moveToRelative(dx = 4.0f, dy = 20.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
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
                // M 17.5 2
                moveTo(x = 17.5f, y = 2.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
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
                // v 1.5
                verticalLineToRelative(dy = 1.5f)
                // m 0 9.5
                moveToRelative(dx = 0.0f, dy = 9.5f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2.5
                horizontalLineToRelative(dx = -2.5f)
                // M 20 8.5
                moveTo(x = 20.0f, y = 8.5f)
                // V 10
                verticalLineTo(y = 10.0f)
                // M 4 10
                moveTo(x = 4.0f, y = 10.0f)
                // V 8.5
                verticalLineTo(y = 8.5f)
                // m 0 11
                moveToRelative(dx = 0.0f, dy = 11.0f)
                // V 14
                verticalLineTo(y = 14.0f)
                // m 0 -9.5
                moveToRelative(dx = 0.0f, dy = -9.5f)
                // A 2.5 2.5 0 0 1 6.5 2
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.5f,
                    y1 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 0 20
                moveToRelative(dx = 0.0f, dy = 20.0f)
                // H 6.5
                horizontalLineTo(x = 6.5f)
                // a 1 1 0 0 1 0 -5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
            }
        }.build().also { _bookDashed = it }
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
                imageVector = BookDashed,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bookDashed: ImageVector? = null
