package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicAudioLines: ImageVector
    get() {
        val current = _micAudioLines
        if (current != null) return current

        return ImageVector.Builder(
            name = "MicAudioLines",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 v2.34 M12 17 v4 m2 -16 v.34 M18 5 v13 M2 10 v3 m20 -3 v3 M6 6 v11 m3 4 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // v 2.34
                verticalLineToRelative(dy = 2.34f)
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 -16
                moveToRelative(dx = 2.0f, dy = -16.0f)
                // v 0.34
                verticalLineToRelative(dy = 0.34f)
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 20 -3
                moveToRelative(dx = 20.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 3 4
                moveToRelative(dx = 3.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
            // <rect width="4" height="8" rx="2.0" x="10.0" y="9.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
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
                // h 0
                horizontalLineToRelative(dx = 0.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h -0
                horizontalLineToRelative(dx = -0.0f)
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
        }.build().also { _micAudioLines = it }
    }


@Suppress("ObjectPropertyName")
private var _micAudioLines: ImageVector? = null
