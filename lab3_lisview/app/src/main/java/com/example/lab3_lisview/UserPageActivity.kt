package com.example.lab3_lisview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.acrivity_user_page.*

//activity for user page
class UserPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acrivity_user_page)

        //get data
        val bundle: Bundle? = intent.extras
        val user = bundle?.getSerializable("user") as User

        //using Picasso library to set image
        Picasso.get()
            .load(R.drawable.user_profile)
            .resize(220, 220)
                //to make image round
            .transform(CircleTransform(10))
            .into(pictureImageView)

        nameTextView.text = user.userName
        emailTextView.text = user.email
        birthdayTextView.text = user.birthday
        phoneTextView.text = user.phone

    }
}
