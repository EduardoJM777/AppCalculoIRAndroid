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


        btCalcularIR.setOnClickListener {

            val renda = edRenda.text.toString().toDoubleOrNull() ?: 0.0
            val rendaAnual = renda * 12
            tvRendaAnual.text = "R$ $rendaAnual"

            val dependentes = edDependentes.text.toString().toDoubleOrNull() ?: 0.0
            val deducaoDepen = dependentes * 300 * 12

            val totDeducoes = edDeducoes.text.toString().toDoubleOrNull() ?: 0.0

            val baseDeCalculo = rendaAnual - (deducaoDepen + totDeducoes)
            tvBaseCalculo.text = "R$ $baseDeCalculo"

            when {
                baseDeCalculo < 18000 -> tvImpostoDevido.text = "R$ 0"
                baseDeCalculo > 18000 && baseDeCalculo < 27000 ->
                    tvImpostoDevido.text = "R$ ${(baseDeCalculo - 18000) * 0.15}"
                baseDeCalculo > 27000 ->
                    tvImpostoDevido.text = "R$ ${1350 + ((baseDeCalculo - 27000) * 0.275)}"
            }


        }


    }
}