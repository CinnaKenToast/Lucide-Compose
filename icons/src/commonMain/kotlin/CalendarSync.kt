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

val CalendarSync: ImageVector
    get() {
        val current = _calendarSync
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CalendarSync",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 10 v4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // m11 14 1.54 -1.6 a5 5 0 0 1 8 1.5 M16 2 v3 m5 13 -1.53 1.6 a5 5 0 0 1 -8 -1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 14
                moveTo(x = 11.0f, y = 14.0f)
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
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 5 13
                moveToRelative(dx = 5.0f, dy = 13.0f)
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
            // M21 22 v-4 h-4 m4 -9.48 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h3.52 M3 9 h4 m1 -7 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 22
                moveTo(x = 21.0f, y = 22.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // m 4 -9.48
                moveToRelative(dx = 4.0f, dy = -9.48f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h 3.52
                horizontalLineToRelative(dx = 3.52f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 1 -7
                moveToRelative(dx = 1.0f, dy = -7.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _calendarSync = it }
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
                imageVector = CalendarSync,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _calendarSync: ImageVector? = null
