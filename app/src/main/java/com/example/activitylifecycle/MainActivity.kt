package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.activitylifecycle.ui.theme.ActivityLifeCycleTheme


class MainActivity : ComponentActivity() {
    private val logTag = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityLifeCycleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        Log.i(logTag, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(logTag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "onDestroy")
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Hello Android!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivityLifeCycleTheme {
        Greeting()
    }
}
