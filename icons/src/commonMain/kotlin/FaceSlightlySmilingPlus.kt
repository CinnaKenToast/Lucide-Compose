package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceSlightlySmilingPlus: ImageVector
    get() {
        val current = _faceSlightlySmilingPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "FaceSlightlySmilingPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.27 2.08 a10 10 0 1 0 8.65 8.65 M15 10 V9 m1 -4 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.27 2.08
                moveTo(x = 13.27f, y = 2.08f)
                // a 10 10 0 1 0 8.65 8.65
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.65f,
                    dy1 = 8.65f,
                )
                // M 15 10
                moveTo(x = 15.0f, y = 10.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 1 -4
                moveToRelative(dx = 1.0f, dy = -4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
            // M16.47 15 a6 6 0 0 1 -8.94 0 M19 2 v6 M9 10 V9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.47 15
                moveTo(x = 16.47f, y = 15.0f)
                // a 6 6 0 0 1 -8.94 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.94f,
                    dy1 = 0.0f,
                )
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 9 10
                moveTo(x = 9.0f, y = 10.0f)
                // V 9
                verticalLineTo(y = 9.0f)
            }
        }.build().also { _faceSlightlySmilingPlus = it }
    }


@Suppress("ObjectPropertyName")
private var _faceSlightlySmilingPlus: ImageVector? = null
