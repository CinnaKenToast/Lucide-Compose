package com.shipsco.lucide_compose

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "LucideCompose",
    ) {
        App()
    }
}