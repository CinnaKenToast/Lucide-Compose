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

val CableCar: ImageVector
    get() {
        val current = _cableCar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CableCar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3z M14 2z M2 9 l20 -5 m-10 8 V6.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3z
                moveTo(x = 10.0f, y = 3.0f)
                close()
                // M 14 2z
                moveTo(x = 14.0f, y = 2.0f)
                close()
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // l 20 -5
                lineToRelative(dx = 20.0f, dy = -5.0f)
                // m -10 8
                moveToRelative(dx = -10.0f, dy = 8.0f)
                // V 6.5
                verticalLineTo(y = 6.5f)
            }
            // <rect width="16" height="10" rx="3.0" x="4.0" y="12.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 15
                moveTo(x = 4.0f, y = 15.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 3 3 0 0 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // h -10
                horizontalLineToRelative(dx = -10.0f)
                // a 3 3 0 0 1 -3 -3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                close()
            }
            // M9 12 v5 m6 -5 v5 M4 17 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 6 -5
                moveToRelative(dx = 6.0f, dy = -5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
        }.build().also { _cableCar = it }
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
                imageVector = CableCar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cableCar: ImageVector? = null
