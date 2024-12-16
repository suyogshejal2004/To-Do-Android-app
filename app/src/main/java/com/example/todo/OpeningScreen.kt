package com.example.todo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun OpeningScreen(onNavigateToMain: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF9C27B0), // Start color (purple)
                            Color(0xFFF8BBD0)  // End color (pink)
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // App Logo or Icon
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "App Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(bottom = 16.dp),
                    tint = Color.White
                )

                // App Title
                Text(
                    text = "To-Do List",
                    style = MaterialTheme.typography.headlineMedium, // Use headlineMedium here
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                // Subtitle or Tagline
                Text(
                    text = "Organize Your Life Efficiently",
                    style = MaterialTheme.typography.bodyMedium, // Use bodyMedium here
                    color = Color.White.copy(alpha = 0.8f)
                )

                // Spacer for loading animation or progress indicator
                Spacer(modifier = Modifier.height(24.dp))

                // Loading Animation (CircularProgressIndicator)
                CircularProgressIndicator(
                    color = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }

    // Simulate a delay and navigate to the main screen
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(3000L) // 3 seconds delay
        onNavigateToMain()
    }
}
