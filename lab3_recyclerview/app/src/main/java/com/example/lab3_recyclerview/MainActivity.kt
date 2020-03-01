package com.example.lab3_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set initial list
        val userList = arrayListOf<User>(
            User(
                "Milton Barnett",
                "milton.barnett@example.com", "1/6/1997", "(173)-938-0760"
            ),
            User(
                "Gabriel Vasquez", "gabriel.vasquez@example.com",
                "7/5/1945", "01060 20513"
            ),
            User(
                "Adam Carpenter", "adam.carpenter@example.com",
                "1/5/1967", "05-9061-7174"
            ),
            User(
                "Ekaterina Le Gall", "ekaterina.legall@exapmle.com",
                "5/3/1964", "079 988 71 42"
            ),
            User("Kaitlin Pierce", "kaitlin.pierce@exapmle.com",
                "1/3/1988", "011-615-9399")
        )

        userListRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = UserListAdapter(userList)
        }

    }
}
