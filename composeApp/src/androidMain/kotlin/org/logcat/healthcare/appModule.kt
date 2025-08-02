package org.logcat.healthcare

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import org.logcat.healthcare.presentation.ui.MyViewModel

val androidModule = module {
    viewModel { MyViewModel(get()) }
}