package br.com.fiap.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonAbrirCadastro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        buttonAbrirCadastro = findViewById(R.id.btnEnviar)
        buttonAbrirCadastro.setOnClickListener{
            val navegarEmailSender = Intent(this,EmailSender::class.java)
            startActivity(navegarEmailSender)
        }
    }


}
