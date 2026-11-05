package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Locate: ImageVector
    get() {
        val current = _locate
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Locate",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <line x1="2.0" y1="12.0" x2="5.0" y2="12.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // L 5 12
                lineTo(x = 5.0f, y = 12.0f)
            }
            // <line x1="19.0" y1="12.0" x2="22.0" y2="12.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // L 22 12
                lineTo(x = 22.0f, y = 12.0f)
            }
            // <line x1="12.0" y1="2.0" x2="12.0" y2="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // L 12 5
                lineTo(x = 12.0f, y = 5.0f)
            }
            // <line x1="12.0" y1="19.0" x2="12.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // L 12 22
                lineTo(x = 12.0f, y = 22.0f)
            }
            // <circle cx="12.0" cy="12.0" radius="7.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
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
        }.build().also { _locate = it }
    }

@Suppress("ObjectPropertyName")
private var _locate: ImageVector? = null
