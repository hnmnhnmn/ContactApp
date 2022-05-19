package com.momotest.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.momotest.ui.R
import com.momotest.ui.model.Contact
import kotlinx.android.synthetic.main.contact_item.view.*

class ContactAdapter(
    var context: Context,
    var listContact: ArrayList<Contact>
) :RecyclerView.Adapter<ContactAdapter.MyViewHolder> () {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myView = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)
        return MyViewHolder(myView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemView = holder.itemView
        val contact = listContact[position]
        itemView.txtContactName.text = contact.name
        itemView.imgContactIcon.setImageResource(contact.idImage)
    }

    override fun getItemCount(): Int {
       return listContact.size
    }
}