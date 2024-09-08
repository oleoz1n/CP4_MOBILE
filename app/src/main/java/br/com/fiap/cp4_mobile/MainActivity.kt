package br.com.fiap.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var btnCompose: ExtendedFloatingActionButton
    private lateinit var btnDev: ExtendedFloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.emailRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        // lista de e-mails
        val emailList = listOf(
            Email("Apple Developer", "Apple Worldwide Developers Conference", "It's almost time...", R.drawable.person_2),
            Email("de Young museum", "You're Invited: A Frida Kahlo Discussion", "Join the curators...", R.drawable.person_3),
            Email("Google", "New Android Features", "Check out the new Android updates...", R.drawable.person_2),
            Email("NASA", "Mars Rover Landing", "Exciting new discoveries on Mars...", R.drawable.person_3),
            Email("Local Library", "Summer Reading Program", "Join our summer reading challenge...", R.drawable.person_2),
            Email("Tech Conference", "Early Bird Tickets Available", "Get your tickets now for the tech conference...", R.drawable.person_3),
            Email("Online Store", "Flash Sale: 50% Off", "Limited time offer on select items...", R.drawable.person_2)
        )


        val adapter = EmailAdapter(emailList)
        recyclerView.adapter = adapter

        btnCompose = findViewById(R.id.fab_compose)
        btnCompose.setOnClickListener{
            val navegarEmailSender = Intent(this,EmailSender::class.java)
            startActivity(navegarEmailSender)
        }
        btnDev = findViewById(R.id.fab_dev)
        btnDev.setOnClickListener{
            val navegarDevs = Intent(this,Developers::class.java)
            startActivity(navegarDevs)
        }

    }
}
