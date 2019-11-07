package com.michau.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_data.*

class loginData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_data)


    }

    override fun onResume() {
        super.onResume()

        if (intent.hasExtra("login")) login.setText(intent.getCharSequenceExtra("login"))
        if (intent.hasExtra("password")) password.setText(intent.getCharSequenceExtra("password"))
        if (intent.hasExtra("gender")) gender.setText(intent.getStringExtra("gender"))
        if (intent.hasExtra("spam")) spam.setText(intent.getStringExtra("spam"))
    }
}
