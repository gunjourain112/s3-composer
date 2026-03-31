package io.github.gunjourain112.s3composer

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "s3-composer",
    ) {
        App()
    }
}
