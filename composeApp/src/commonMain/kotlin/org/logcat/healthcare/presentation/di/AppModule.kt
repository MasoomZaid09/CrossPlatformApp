package org.logcat.healthcare.presentation.di

import io.ktor.client.HttpClient
import org.koin.dsl.module
import org.logcat.healthcare.data.remote.DDApi
import org.logcat.healthcare.data.remote.DDApiImpl
import org.logcat.healthcare.data.remote.createHttp
import org.logcat.healthcare.data.repo.DDRepositoryImpl
import org.logcat.healthcare.domain.repo.DDRepository
import org.logcat.healthcare.domain.usecases.DDUseCase

val appModule = module {

    single<HttpClient> {
        createHttp()
    }

    single<DDApi> {
        DDApiImpl(get())
    }

    single<DDRepository> { DDRepositoryImpl(get()) }

    single { DDUseCase(get()) }

}