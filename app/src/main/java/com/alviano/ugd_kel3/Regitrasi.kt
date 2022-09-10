package com.alviano.ugd_kel3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Regitrasi : AppCompatActivity() {
    private lateinit var inputUsername: TextInputEditText
    private lateinit var inputPassword: TextInputEditText
    private lateinit var inputTl:TextInputEditText
    private lateinit var inputNoTelp: TextInputEditText
    private lateinit var inputEmail: TextInputEditText
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrasi)

        setTitle("User Login")
        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)
        val btnDaftar: Button = findViewById(R.id.btnDaftar)
        val btnLogin: TextView = findViewById(R.id.tvLogin)

        btnLogin.setOnClickListener(View.OnClickListener {
            var checkLogin = false
            var username:String = inputUsername.getEditText()?.getText().toString()
        })
    }
}