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

val FolderHeart: ImageVector
    get() {
        val current = _folderHeart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.FolderHeart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.64 20 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h3.9 a2 2 0 0 1 1.69 .9 l.81 1.2 A2 2 0 0 0 12.07 6 H20 a2 2 0 0 1 2 2 v3.42
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.64 20
                moveTo(x = 10.64f, y = 20.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 3.9
                horizontalLineToRelative(dx = 3.9f)
                // a 2 2 0 0 1 1.69 0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.69f,
                    dy1 = 0.9f,
                )
                // l 0.81 1.2
                lineToRelative(dx = 0.81f, dy = 1.2f)
                // A 2 2 0 0 0 12.07 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.07f,
                    y1 = 6.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
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
                // v 3.42
                verticalLineToRelative(dy = 3.42f)
            }
            // M14.62 18.8 A2.25 2.25 0 1 1 18 15.84 a2.25 2.25 0 1 1 3.38 2.96 l-2.63 2.86 a1 1 0 0 1 -1.5 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.62 18.8
                moveTo(x = 14.62f, y = 18.8f)
                // A 2.25 2.25 0 1 1 18 15.84
                arcTo(
                    horizontalEllipseRadius = 2.25f,
                    verticalEllipseRadius = 2.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 15.84f,
                )
                // a 2.25 2.25 0 1 1 3.38 2.96
                arcToRelative(
                    a = 2.25f,
                    b = 2.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.38f,
                    dy1 = 2.96f,
                )
                // l -2.63 2.86
                lineToRelative(dx = -2.63f, dy = 2.86f)
                // a 1 1 0 0 1 -1.5 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _folderHeart = it }
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
                imageVector = FolderHeart,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _folderHeart: ImageVector? = null
