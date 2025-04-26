package com.bullon.eduardo.laboratoriocalificado01

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        // Obtener los botones
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        val buttonForward = findViewById<Button>(R.id.buttonForward)

        // Lógica para manejar los clics de los botones
        button1.setOnClickListener { /* Acción para el botón 1 */ }
        button2.setOnClickListener { /* Acción para el botón 2 */ }
        button3.setOnClickListener { /* Acción para el botón 3 */ }
        button4.setOnClickListener { /* Acción para el botón 4 */ }
        // Agregar los demás botones con sus respectivas acciones
    }
}
