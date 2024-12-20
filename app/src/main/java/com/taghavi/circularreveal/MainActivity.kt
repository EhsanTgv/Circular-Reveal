package com.taghavi.circularreveal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taghavi.circularreveal.ui.theme.CircularRevealTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CircularRevealTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CircularReveal(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}