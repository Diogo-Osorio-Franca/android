package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var users: MutableList<String> = mutableListOf<String>("user1", "user2")
    var emails: MutableList<String> = mutableListOf<String>("email1", "email2")
    var passwords: MutableList<String> = mutableListOf<String>("password1", "password2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.signupbtn)
        var bundle = Bundle()
        btn.setOnClickListener {
            val user = findViewById<EditText>(R.id.username)
            val userInput = user.text.toString()
            var result = "user successfully registered"
            if (userInput in users) {
                result = "user already registered. Insert the password"

            } else {


                val email = findViewById<EditText>(R.id.email)
                val emailInput = email.text.toString()
                val password = findViewById<EditText>(R.id.password)
                val passwordInput = password.text.toString()
                val repassword = findViewById<EditText>(R.id.repassword)
                val repasswordInput = repassword.text.toString()

                if (passwordInput.equals(repasswordInput)) {
                    users.add(userInput)
                    emails.add(emailInput)
                    passwords.add(passwordInput)
                } else {
                    result = "Password does not match. Retype the password"
                }
            }

        bundle.putString("res",result)
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}