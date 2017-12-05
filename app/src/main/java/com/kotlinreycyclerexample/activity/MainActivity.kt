package com.kotlinreycyclerexample.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.kotlinreycyclerexample.R
import com.kotlinreycyclerexample.adapter.CustomAdapter
import com.kotlinreycyclerexample.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("SAM", "SAM 1"))
        users.add(User("RAM", "SAM 1"))
        users.add(User("RAMESH", "SAMBU"))
        users.add(User("SAM", "SAM 1"))
        users.add(User("RAM", "SAM 1"))
        users.add(User("RAMESH", "SAMBU"))
        users.add(User("SAM", "SAM 1"))
        users.add(User("RAM", "SAM 1"))
        users.add(User("RAMESH", "SAMBU"))
        users.add(User("SAM", "SAM 1"))
        users.add(User("RAM", "SAM 1"))
        users.add(User("RAMESH", "SAMBU"))
        users.add(User("SAM", "SAM 1"))
        users.add(User("RAM", "SAM 1"))
        users.add(User("RAMESH", "SAMBU"))
        users.add(User("SAM", "SAM 1"))
        users.add(User("RAM", "SAM 1"))
        users.add(User("RAMESH", "SAMBU"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}
