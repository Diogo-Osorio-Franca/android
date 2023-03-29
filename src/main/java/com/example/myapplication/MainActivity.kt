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
        val users= arrayOf(Usuario("User0","A"),Usuario("User1","B"),
            Usuario("User2","C"),Usuario("User3","D"), Usuario
        ("User4","E"))

        val user = findViewById<EditText>(R.id.user)
        val password = findViewById<EditText>(R.id.password)
        var result = findViewById<TextView>(R.id.resultado)
        var res = "resultado"

        var button = findViewById<Button>(R.id.login)
        button.setOnClickListener(){
            val userInput = user.text.toString()
            val passwordInput = password.text.toString()
            val u = Usuario(userInput,passwordInput)
            if (u in users){
                res = "Login efetuado"
            }
            else {
                res = "Usuário não existente"
            }
            result.setText(res)
        }

        var buttonC = findViewById<Button>(R.id.clear);
        buttonC.setOnClickListener(){
            user.setText("")
            password.setText("")
            res = "Resultado"
            result.setText(res)
        }
    }

    class Usuario(username:String, password:String)

}