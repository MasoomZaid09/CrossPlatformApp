package org.logcat.healthcare.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.logcat.healthcare.domain.models.Post
import org.logcat.healthcare.domain.usecases.DDUseCase
import org.logcat.healthcare.utils.SharedLogger

class MyViewModel(val ddUseCase: DDUseCase) : ViewModel() {

    private val _posts = MutableStateFlow(ArrayList<Post>())
    var posts = _posts

    fun fetchPosts() = viewModelScope.launch {
        val data = ddUseCase.loginEvent()
        SharedLogger.d(data.size.toString())
        if (data.isNotEmpty()) {
            posts.emit(data)
        } else {
            posts.emit(
                arrayListOf(
                    Post(
                        id = 0,
                        title = "No Posts Available",
                        body = "Please check your network connection or try again later.",
                        userId = 0
                    )
                )
            )
        }
    }
}