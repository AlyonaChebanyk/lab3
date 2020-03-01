package com.example.lab3_recyclerview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(private val userList: ArrayList<User>) :
    RecyclerView.Adapter<ViewHolderUser>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUser {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false) as View
        return ViewHolderUser(view)
    }

    override fun onBindViewHolder(holder: ViewHolderUser, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int = userList.size

}