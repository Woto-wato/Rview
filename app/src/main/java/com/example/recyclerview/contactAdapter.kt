package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

 class contactAdapter(var contactList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
         var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main,parent,false)
        return ContactViewHolder(itemView)
        }

     override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
         var currentcontact = contactList.get(position)
        holder.tvname.text = currentcontact.Name
        holder.tvphoneNumber.text = currentcontact.phoneNumber
        holder.tvemail.text = currentcontact.EmailAddress     }

     override fun getItemCount(): Int {
         return  contactList.size     }


   }

class  ContactViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvphoneNumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)


}