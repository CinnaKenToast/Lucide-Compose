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

val CpuAi: ImageVector
    get() {
        val current = _cpuAi
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CpuAi",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20 v2 m0 -20 v2 m4 5 v6 m1 5 v2 m0 -20 v2 M2 12 h2 m-2 5 h2 M2 7 h2 m16 5 h2 m-2 5 h2 M20 7 h2 M7 20 v2 M7 2 v2 m1 9 h4 m-4 2 v-4 a2 2 0 0 1 4 0 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 5
                moveToRelative(dx = 4.0f, dy = 5.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 1 5
                moveToRelative(dx = 1.0f, dy = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 5
                moveToRelative(dx = -2.0f, dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 5
                moveToRelative(dx = 16.0f, dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2 5
                moveToRelative(dx = -2.0f, dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 20 7
                moveTo(x = 20.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 7 20
                moveTo(x = 7.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 1 9
                moveToRelative(dx = 1.0f, dy = 9.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 2
                moveToRelative(dx = -4.0f, dy = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
            // <rect width="16" height="16" rx="2.0" x="4.0" y="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -12
                horizontalLineToRelative(dx = -12.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _cpuAi = it }
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
                imageVector = CpuAi,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cpuAi: ImageVector? = null
