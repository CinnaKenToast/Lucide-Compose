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

val Virus: ImageVector
    get() {
        val current = _virus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Virus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 15z M12 22 v-3 m0 -17 v3 m1 17 h-2 m2 -20 h-2 m2.99 8z m2.5 9.8 -1 -1.74 m1 -13.85 -1 1.73 m4.3 10.56 -1.74 -1 m1.73 -8 -1.73 1 M2 12 h3 m-3 1 v-2 m20 1 h-3 m3 1 v-2 M4.2 16.5 l1.74 -1 m-1.73 -8 1.73 1 M7.5 19.8 l1 -1.74 m-1 -13.85 1 1.73 M9 12z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15z
                moveTo(x = 12.0f, y = 15.0f)
                close()
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 0 -17
                moveToRelative(dx = 0.0f, dy = -17.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 1 17
                moveToRelative(dx = 1.0f, dy = 17.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 2 -20
                moveToRelative(dx = 2.0f, dy = -20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 2.99 8z
                moveToRelative(dx = 2.99f, dy = 8.0f)
                close()
                // m 2.5 9.8
                moveToRelative(dx = 2.5f, dy = 9.8f)
                // l -1 -1.74
                lineToRelative(dx = -1.0f, dy = -1.74f)
                // m 1 -13.85
                moveToRelative(dx = 1.0f, dy = -13.85f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // m 4.3 10.56
                moveToRelative(dx = 4.3f, dy = 10.56f)
                // l -1.74 -1
                lineToRelative(dx = -1.74f, dy = -1.0f)
                // m 1.73 -8
                moveToRelative(dx = 1.73f, dy = -8.0f)
                // l -1.73 1
                lineToRelative(dx = -1.73f, dy = 1.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m -3 1
                moveToRelative(dx = -3.0f, dy = 1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 20 1
                moveToRelative(dx = 20.0f, dy = 1.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // m 3 1
                moveToRelative(dx = 3.0f, dy = 1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 4.2 16.5
                moveTo(x = 4.2f, y = 16.5f)
                // l 1.74 -1
                lineToRelative(dx = 1.74f, dy = -1.0f)
                // m -1.73 -8
                moveToRelative(dx = -1.73f, dy = -8.0f)
                // l 1.73 1
                lineToRelative(dx = 1.73f, dy = 1.0f)
                // M 7.5 19.8
                moveTo(x = 7.5f, y = 19.8f)
                // l 1 -1.74
                lineToRelative(dx = 1.0f, dy = -1.74f)
                // m -1 -13.85
                moveToRelative(dx = -1.0f, dy = -13.85f)
                // l 1 1.73
                lineToRelative(dx = 1.0f, dy = 1.73f)
                // M 9 12z
                moveTo(x = 9.0f, y = 12.0f)
                close()
            }
            // <circle cx="12.0" cy="12.0" radius="7.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // a 7 7 0 1 1 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 7 7 0 1 1 -14 0z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _virus = it }
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
                imageVector = Virus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _virus: ImageVector? = null
