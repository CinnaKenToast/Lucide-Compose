package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GitBranchPlus: ImageVector
    get() {
        val current = _gitBranchPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "GitBranchPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 3 v12 m12 -6 a3 3 0 1 0 0 -6 3 3 0 0 0 0 6 M6 21 a3 3 0 1 0 0 -6 3 3 0 0 0 0 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // m 12 -6
                moveToRelative(dx = 12.0f, dy = -6.0f)
                // a 3 3 0 1 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 0 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // M 6 21
                moveTo(x = 6.0f, y = 21.0f)
                // a 3 3 0 1 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 0 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
            }
            // M15 6 a9 9 0 0 0 -9 9 m12 0 v6 m3 -3 h-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
                // a 9 9 0 0 0 -9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.0f,
                    dy1 = 9.0f,
                )
                // m 12 0
                moveToRelative(dx = 12.0f, dy = 0.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
            }
        }.build().also { _gitBranchPlus = it }
    }


@Suppress("ObjectPropertyName")
private var _gitBranchPlus: ImageVector? = null
