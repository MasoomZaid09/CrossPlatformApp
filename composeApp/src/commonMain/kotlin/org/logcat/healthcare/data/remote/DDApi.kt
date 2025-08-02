package org.logcat.healthcare.data.remote

import org.logcat.healthcare.domain.models.Post

interface DDApi {

    suspend fun loginApi() : ArrayList<Post>
    suspend fun logoutApi() : String
    suspend fun devicesListApi() : String
    suspend fun updateFormData() : String
    suspend fun fetchFormData() : String
}