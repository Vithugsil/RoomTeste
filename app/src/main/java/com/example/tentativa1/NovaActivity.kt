package com.example.tentativa1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tentativa1.data.entity.User


class NovaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val users = (application as AppApplication).db.userDAO.getAllOrderedByFirstName()

        setContent {
            MaterialTheme {
                UserScreen(users)
            }
        }

    }
}

@Composable
fun UserScreen(users: List<User>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(users) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("\n${it.firstName} ${it.lastName}")
                Text(it.phone)
            }
        }
    }
}