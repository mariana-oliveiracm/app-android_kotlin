package com.example.biscoito_da_sorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mensagem.*

class MensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensagem)

        val intent = intent
        val nomeDigitado = intent.getStringExtra("Nome")
        txvSaudacao.text = "Olá $nomeDigitado"

        fun rand(start: Int, end: Int): Int {
            require(start <= end) { "Illegal Argument" }
            return (start..end).random()
        }

        val mensagens = arrayOf("Hoje é seu dia de sorte! Jogue na loteria", "A vida não é tão curta assim, tenha responsabilidade", "Em tempos de Covid-19, não se esqueça da máscara", "Está programando em Kotlin? Hoje você dormirá bem", "Já agradeceu os professores do curso hoje?")

        var random = rand(0, 4)
        txvMensagemSorte.text = mensagens[random]

        btnVoltar.setOnClickListener {
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
        }
    }
}