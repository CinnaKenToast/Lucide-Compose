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

val ReplyAll: ImageVector
    get() {
        val current = _replyAll
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ReplyAll",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 17 -5 -5 5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
            }
            // M22 18 v-2 a4 4 0 0 0 -4 -4 H7 m0 5 -5 -5 5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 18
                moveTo(x = 22.0f, y = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // m 0 5
                moveToRelative(dx = 0.0f, dy = 5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
            }
        }.build().also { _replyAll = it }
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
                imageVector = ReplyAll,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _replyAll: ImageVector? = null
