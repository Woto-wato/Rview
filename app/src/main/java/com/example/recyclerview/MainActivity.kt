package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var rvContact = findViewById<RecyclerView>(R.id.rvContacts)
        var contactList = listOf(
            Contact("Eunice Timothy","0745678983","timothy@gmail.com"),
            Contact("Celine Grace","078996544","celine@gmail.com"),
            Contact("Vicky john","074567943","vicky@gmail.com"),
            Contact("Becky Rodgers","0756347896","becky@gmail.com"),
            Contact("Tune Jillo","075643577","tune@gmail.com"),
        )
    }

    }