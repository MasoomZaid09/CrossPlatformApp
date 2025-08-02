package org.logcat.healthcare.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import org.logcat.healthcare.data.remote.api_routes.BASE_URL
import org.logcat.healthcare.data.remote.api_routes.Posts
import org.logcat.healthcare.domain.models.Post

class DDApiImpl(private val client: HttpClient) : DDApi {

    override suspend fun loginApi(): ArrayList<Post> {
        val response: HttpResponse = client.get(BASE_URL+Posts)

        return response.body()
    }

    override suspend fun logoutApi(): String {
        return "Login API called successfully"
    }

    override suspend fun devicesListApi(): String {
        return "Login API called successfully"
    }

    override suspend fun updateFormData(): String {
        return "Login API called successfully"
    }

    override suspend fun fetchFormData(): String {
        return "Login API called successfully"
    }
}