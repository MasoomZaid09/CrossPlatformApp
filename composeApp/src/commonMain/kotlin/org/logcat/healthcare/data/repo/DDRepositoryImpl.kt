package org.logcat.healthcare.data.repo

import org.logcat.healthcare.data.remote.DDApi
import org.logcat.healthcare.domain.models.Post
import org.logcat.healthcare.domain.repo.DDRepository

class DDRepositoryImpl(private val ddApi: DDApi) : DDRepository {

    override suspend fun loginApi(): ArrayList<Post> {
        return ddApi.loginApi()
    }

    override suspend fun logoutApi(): String {
        return ddApi.logoutApi()
    }

    override suspend fun devicesListApi(): String {
        return ddApi.devicesListApi()
    }

    override suspend fun updateFormData(): String {
        return ddApi.updateFormData()
    }

    override suspend fun fetchFormData(): String {
        return ddApi.fetchFormData()
    }
}