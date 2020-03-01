package com.example.lab3_recyclerview

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.user_item.view.*

class ViewHolderUser(private val view: View) : RecyclerView.ViewHolder(view){
    fun bind(user: User){
        Picasso.get()
            .load(R.drawable.user_profile)
            .transform(CircleTransform(5))
            .into(view.pictureImageView)

        view.userInfoTextView.text = user.userName

        view.setOnClickListener { view->
            val intent = Intent(view.context, UserPageActivity::class.java)
            intent.putExtra("user", user)
            view.context.startActivity(intent)
        }
    }
}