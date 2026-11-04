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

val CalendarArrowDown: ImageVector
    get() {
        val current = _calendarArrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CalendarArrowDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 17 4 4 4 -4 M16 2 v3 m2 8 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 17
                moveTo(x = 14.0f, y = 17.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 2 8
                moveToRelative(dx = 2.0f, dy = 8.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
            // M21 10.35 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h7.34 M3 9 h18 M8 2 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 10.35
                moveTo(x = 21.0f, y = 10.35f)
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
                // h 7.34
                horizontalLineToRelative(dx = 7.34f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _calendarArrowDown = it }
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
                imageVector = CalendarArrowDown,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _calendarArrowDown: ImageVector? = null
