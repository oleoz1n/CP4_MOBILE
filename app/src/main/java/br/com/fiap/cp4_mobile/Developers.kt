package br.com.fiap.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Developers : AppCompatActivity() {

    private lateinit var buttonVoltarHome: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_developers)

        buttonVoltarHome = findViewById(R.id.backButtonDevelopers)
        buttonVoltarHome.setOnClickListener{
            val navegarMain = Intent(this,MainActivity::class.java)
            startActivity(navegarMain)
        }
    }
}