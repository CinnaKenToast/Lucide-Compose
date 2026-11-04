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

val WebcamOff: ImageVector
    get() {
        val current = _webcamOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.WebcamOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-4 m.75 -10.9 a3 3 0 0 1 2.15 2.15 m-2.04 3.62 a3 3 0 0 1 -3.73 -3.73
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 0.75 -10.9
                moveToRelative(dx = 0.75f, dy = -10.9f)
                // a 3 3 0 0 1 2.15 2.15
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.15f,
                    dy1 = 2.15f,
                )
                // m -2.04 3.62
                moveToRelative(dx = -2.04f, dy = 3.62f)
                // a 3 3 0 0 1 -3.73 -3.73
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.73f,
                    dy1 = -3.73f,
                )
            }
            // M16.57 16.57 A8 8 0 0 1 5.43 5.43 M2 2 l20 20 M7 22 h10 M8.48 2.82 a8 8 0 0 1 10.7 10.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.57 16.57
                moveTo(x = 16.57f, y = 16.57f)
                // A 8 8 0 0 1 5.43 5.43
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.43f,
                    y1 = 5.43f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 8.48 2.82
                moveTo(x = 8.48f, y = 2.82f)
                // a 8 8 0 0 1 10.7 10.7
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.7f,
                    dy1 = 10.7f,
                )
            }
        }.build().also { _webcamOff = it }
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
                imageVector = WebcamOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _webcamOff: ImageVector? = null
