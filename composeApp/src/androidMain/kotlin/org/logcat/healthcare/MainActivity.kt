package org.logcat.healthcare

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.collect
import kotlinx.serialization.builtins.serializer
import org.koin.androidx.compose.koinViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.logcat.healthcare.presentation.ui.MyViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {

            // Inject Koin ViewModel inside Compose block
            val myViewModel: MyViewModel = getViewModel()

            // Call fetchPosts() inside LaunchedEffect (only once)
            LaunchedEffect(Unit) {
                myViewModel.fetchPosts()
            }

            // Collect and use the flow
            val postState = myViewModel.posts.collectAsState()
            Log.i("DataGet",myViewModel.posts.value.toString())

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text("Posts: ${postState.value}")
            }
        }
    }
}
