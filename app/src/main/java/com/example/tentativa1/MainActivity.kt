package com.example.tentativa1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.tentativa1.data.dao.UserDAO
import com.example.tentativa1.data.entity.User


class MainActivity : ComponentActivity() {

    private lateinit var userDAO: UserDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_user)


    }
}


