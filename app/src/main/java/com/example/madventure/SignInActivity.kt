package com.example.madventure

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class SignInActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    fun clickSignIn(view: View) {
        val email:TextView = findViewById(R.id.email)
        val password:TextView=findViewById(R.id.password)

        if(email.text.isNotEmpty()&&password.text.isNotEmpty())
        {
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
        }
        else {
            Toast.makeText(this,"Input login and password", Toast.LENGTH_SHORT).show()
        }
    }
}