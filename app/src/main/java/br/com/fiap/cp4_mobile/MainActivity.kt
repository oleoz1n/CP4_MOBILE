package br.com.fiap.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var buttonAbrirCadastro: Button
    private lateinit var btnDev: ExtendedFloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        buttonAbrirCadastro = findViewById(R.id.btnEnviar)
        buttonAbrirCadastro.setOnClickListener{
            val navegarHome = Intent(this,EmailHome::class.java)
            startActivity(navegarHome)
        }
        btnDev = findViewById(R.id.fab_dev)
        btnDev.setOnClickListener{
            val navegarDevs = Intent(this,Developers::class.java)
            startActivity(navegarDevs)
        }
    }


}
