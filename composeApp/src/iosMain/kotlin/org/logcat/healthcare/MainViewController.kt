package org.logcat.healthcare

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.context.startKoin
import org.logcat.healthcare.presentation.di.appModule
import org.logcat.healthcare.presentation.di.iosInitKoin

fun MainViewController() = ComposeUIViewController {

    startKoin{
        modules(appModule)
    }
    App()

}