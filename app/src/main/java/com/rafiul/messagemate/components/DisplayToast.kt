package com.rafiul.messagemate.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.platform.LocalContext

@Composable
fun DisplayToast(message: String) {
    val showToast = rememberUpdatedState(newValue = message)

    // Show toast when the value of showToast changes
    if (showToast.value.isNotEmpty()) {
        Toast.makeText(LocalContext.current, "Received SMS: ${showToast.value}", Toast.LENGTH_SHORT).show()
    }
}
