package com.example.biscoito_da_sorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCliqueAqui.setOnClickListener {
            val nome = edtNome.text.toString().trim()
            val mIntent = Intent(this, MensagemActivity::class.java)
            mIntent.putExtra("Nome", nome)
            startActivity(mIntent)
        }

        btnSair.setOnClickListener {

            val alert = AlertDialog.Builder(this)
            alert.setTitle("App Tente a Sorte")
            alert.setMessage("Deseja sair do aplicativo?")

            alert.setPositiveButton("Sim") { dialog, which ->

                finishAffinity()
                /*System.exit(0);
                finish();*/

            }

            alert.setNeutralButton("Não") { dialog, which -> }
            alert.show()

        }
    }
}