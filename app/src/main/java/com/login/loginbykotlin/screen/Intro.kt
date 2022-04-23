package com.login.loginbykotlin.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.login.loginbykotlin.R
import android.content.Intent
import android.view.View
import com.login.loginbykotlin.MainActivity


class Intro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        //login button
        val login=findViewById<CardView>(R.id.login_bt)
        // singUp button
        val singUp=findViewById<CardView>(R.id.singup_bt)

        //onclick for login
       login.setOnClickListener {
           startActivity(Intent(this,LoginActivity::class.java))
       }

        //onclick for singUp
        singUp.setOnClickListener {
            startActivity(Intent(this,SingUpActivity::class.java))
        }

    }
}