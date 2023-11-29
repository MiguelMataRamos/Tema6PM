package com.example.tema6pm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun pasar(v:View){

        var botonId = v.id
        val intent = when (botonId) {
            R.id.ej1 -> Intent(this, Ejercicio1::class.java)
            R.id.ej2 -> Intent(this, Ejercicio2::class.java)
            R.id.ej3 -> Intent(this, Ejercicio3::class.java)
            R.id.ej4 -> Intent(this, Ejercicio4::class.java)
            R.id.ej5 -> Intent(this, Ejercicio5::class.java)
            R.id.ej6 -> Intent(this, Ejercicio6::class.java)
            else -> null
        }

        startActivity(intent)

    }

}