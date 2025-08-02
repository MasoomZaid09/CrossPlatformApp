package org.logcat.healthcare.domain.repo

import org.logcat.healthcare.domain.models.Post

interface DDRepository {

    suspend fun loginApi() : ArrayList<Post>
    suspend fun logoutApi() : String
    suspend fun devicesListApi() : String
    suspend fun updateFormData() : String
    suspend fun fetchFormData() : String
}