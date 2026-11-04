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

val TowerControl: ImageVector
    get() {
        val current = _towerControl
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.TowerControl",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18.2 12.27 20 6 H4 l1.8 6.27 A1 1 0 0 0 6.75 13 h10.5 a1 1 0 0 0 .96 -.73Z M8 13 v9 m8 0 v-9 M9 6 l1 7 m5 -7 -1 7 m-2 -7 V2 m1 0 h-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.2 12.27
                moveTo(x = 18.2f, y = 12.27f)
                // L 20 6
                lineTo(x = 20.0f, y = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // l 1.8 6.27
                lineToRelative(dx = 1.8f, dy = 6.27f)
                // A 1 1 0 0 0 6.75 13
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.75f,
                    y1 = 13.0f,
                )
                // h 10.5
                horizontalLineToRelative(dx = 10.5f)
                // a 1 1 0 0 0 0.96 -0.73z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.96f,
                    dy1 = -0.73f,
                )
                close()
                // M 8 13
                moveTo(x = 8.0f, y = 13.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // M 9 6
                moveTo(x = 9.0f, y = 6.0f)
                // l 1 7
                lineToRelative(dx = 1.0f, dy = 7.0f)
                // m 5 -7
                moveToRelative(dx = 5.0f, dy = -7.0f)
                // l -1 7
                lineToRelative(dx = -1.0f, dy = 7.0f)
                // m -2 -7
                moveToRelative(dx = -2.0f, dy = -7.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 1 0
                moveToRelative(dx = 1.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
            }
        }.build().also { _towerControl = it }
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
                imageVector = TowerControl,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _towerControl: ImageVector? = null
