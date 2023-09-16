package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // связали переменную с эл-ми в разметке
        myButton = findViewById(R.id.button_ok)
        // обработчик нажатия
        myButton.setOnClickListener( {showToast()} )
    }

    private fun showToast () {
        // как вызывать showToast - всплывающее сообщение
        val myToast = Toast.makeText(this, "вы нажали кнопку", Toast.LENGTH_LONG)
        // показываем
        myToast.show()
    }
}
