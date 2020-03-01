package com.example.lab3_lisview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.user_item.view.*

class UserListAdapter(
    val context: Context,
    private val userList: ArrayList<User>
) : BaseAdapter() {

    override fun getItem(position: Int): Any = userList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = userList.size

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false)
        Picasso.get()
            .load(R.drawable.user_profile)
            .transform(CircleTransform(5))
            .into(view.pictureImageView)

        view.userInfoTextView.text = userList[position].userName

        view.setOnClickListener {
            val intent = Intent(view.context, UserPageActivity::class.java)
            intent.putExtra("user", userList[position])
            view.context.startActivity(intent)
        }
        return view
    }
}