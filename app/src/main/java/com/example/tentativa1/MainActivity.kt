package com.example.tentativa1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.tentativa1.data.entity.User


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_user)

        val etFirstName = findViewById<EditText>(R.id.et_first_name)
        val etLastName = findViewById<EditText>(R.id.et_last_name)
        val etPhone = findViewById<EditText>(R.id.et_phone)
        val btnSave = findViewById<Button>(R.id.btn_save)

        btnSave.setOnClickListener{
            val user = User(
                id = null,
                firstName = etFirstName.text.toString(),
                lastName = etLastName.text.toString(),
                phone = etPhone.text.toString()
            )
            (application as AppApplication).db.userDAO.insert(user)
            Toast.makeText(this, R.string.user_inserted_successfully, Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, NovaActivity::class.java))
        }


    }
}


