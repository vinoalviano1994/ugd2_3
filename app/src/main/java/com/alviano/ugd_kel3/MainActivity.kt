package com.alviano.ugd_kel3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var inputUssername: TextInputEditText
    private lateinit var inputPassword: TextInputEditText
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("LOGIN")

        inputUssername = findViewById(R.id.etUserrname)
        inputPassword = findViewById(R.id.etPassword)
        mainLayout = findViewById(R.id.mainLayout)
        val btnClear: Button
    }
}