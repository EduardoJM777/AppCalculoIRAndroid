package com.example.calculoir

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val edRenda = findViewById<EditText>(R.id.edRenda)
        val edDependentes = findViewById<EditText>(R.id.edDependentes)
        val edDeducoes = findViewById<EditText>(R.id.edDeducoes)
        val btCalcularIR = findViewById<Button>(R.id.btCalcularIR)
        val tvRendaAnual = findViewById<TextView>(R.id.tvRendaAnual)
        val tvBaseCalculo = findViewById<TextView>(R.id.tvBaseCalculo)
        val tvImpostoDevido = findViewById<TextView>(R.id.tvImpostoDevido)











    }
}