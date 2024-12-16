package com.example.todo

// Required for Android lifecycle and activity

// Required for Jetpack Compose

// Required for themes and UI customization
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo.ui.theme.ToDOTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDOTheme  {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    // State to control which screen is displayed
    val showOpeningScreen = remember { mutableStateOf(true) }

    if (showOpeningScreen.value) {
        // Display the Opening Screen
        OpeningScreen(onNavigateToMain = { showOpeningScreen.value = false })
    } else {
        // Display the Main Screen
        MainScreen()
    }
}

@Composable
fun MainScreen() {
    // Main content of your app after the splash screen
    Surface {
        Text(
            text = "Welcome to the To-Do List App!",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )
    }
}
