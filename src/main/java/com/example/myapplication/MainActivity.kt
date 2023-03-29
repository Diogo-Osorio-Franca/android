package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val users = arrayOf("User0","User1","User2","User3","User4")
        val passwords = arrayOf("A","B","C","D","E")


        val user = findViewById<EditText>(R.id.user)
        var userInput = user.text.toString()
        val password = findViewById<EditText>(R.id.password)
        var passwordInput = password.text.toString()
        var result = findViewById<TextView>(R.id.resultado)
        var res = "resultado"

        var button = findViewById<Button>(R.id.login)
        button.setOnClickListener(){
            if (userInput in users){
                if (passwordInput in passwords){
                    res = "Login efetuado"
                    result.setText(res)
                }
            }
            else {
                res = "Usuário não existente"
                result.setText(res)
            }
        }

        var buttonC = findViewById<Button>(R.id.clear);
        buttonC.setOnClickListener(){
            userInput = ""
            passwordInput = ""
            res = "resultado"
            result.setText(res)
        }
    }
}