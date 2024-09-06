package br.com.fiap.cp4_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderIcon: ImageView = itemView.findViewById(R.id.senderIcon)
        val senderName: TextView = itemView.findViewById(R.id.senderName)
        val emailSubject: TextView = itemView.findViewById(R.id.emailSubject)
        val emailSnippet: TextView = itemView.findViewById(R.id.emailSnippet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        // Defina os valores dos itens aqui, por exemplo:
        holder.senderName.text = email.senderName
        holder.emailSubject.text = email.subject
        holder.emailSnippet.text = email.snippet
        holder.senderIcon.setImageResource(email.iconResId)
    }

    override fun getItemCount(): Int {
        return emailList.size
    }
}
