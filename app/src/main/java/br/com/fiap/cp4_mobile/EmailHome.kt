package br.com.fiap.cp4_mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmailHome : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
//    private lateinit var emailList: ArrayList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.emailRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        // Exemplo de lista de e-mails
        val emailList = listOf(
            Email("Apple Developer", "Apple Worldwide Developers Conference", "It's almost time...", R.drawable.person_2),
            Email("de Young museum", "You're Invited: A Frida Kahlo Discussion", "Join the curators...", R.drawable.person_3)
            // Adicione mais emails aqui
        )

        val adapter = EmailAdapter(emailList)
        recyclerView.adapter = adapter
    }
}

data class Email(
    val senderName: String,
    val subject: String,
    val snippet: String,
    val iconResId: Int
)
