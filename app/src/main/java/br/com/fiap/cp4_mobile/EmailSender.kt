package br.com.fiap.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class EmailSender : AppCompatActivity() {

    private lateinit var buttonVoltarHome: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_email_sender)

        buttonVoltarHome = findViewById(R.id.backButtonEmail)
        buttonVoltarHome.setOnClickListener{
            val navegarMain = Intent(this,EmailHome::class.java)
            startActivity(navegarMain)
        }


    }
}