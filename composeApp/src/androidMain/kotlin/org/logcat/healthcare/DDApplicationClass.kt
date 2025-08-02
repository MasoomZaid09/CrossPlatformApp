package org.logcat.healthcare

import android.app.Application
import co.touchlab.kermit.LogcatWriter
import co.touchlab.kermit.Logger
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.logcat.healthcare.presentation.di.appModule

class DDApplicationClass : Application() {

    override fun onCreate() {
        super.onCreate()
        Logger.setLogWriters(LogcatWriter())
        startKoin{
            androidContext(this@DDApplicationClass)
            modules(appModule,androidModule)
        }
    }
}