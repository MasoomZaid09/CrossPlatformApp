package org.logcat.healthcare.domain.usecases

import org.logcat.healthcare.domain.models.Post
import org.logcat.healthcare.domain.repo.DDRepository


class DDUseCase(private val ddRepository: DDRepository) {

    suspend fun loginEvent() : ArrayList<Post> {
        return ddRepository.loginApi()
    }

    suspend fun logoutEvent() : String {
        return ddRepository.logoutApi()
    }

    suspend fun fetchDevicesList() : String {
        return ddRepository.devicesListApi()
    }

    suspend fun updateFormData() : String {
        return ddRepository.updateFormData()
    }

    suspend fun getFormData() : String {
        return ddRepository.fetchFormData()
    }
}