package com.michau.buttons

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lke.setOnClickListener{
            var message= Toast.makeText(applicationContext, "ssij", Toast.LENGTH_SHORT)
            message.show()

            var imtentToStartSecondActivity=Intent(applicationContext, Main2Activity::class.java)
            startActivity(imtentToStartSecondActivity)
        }

        disl.setOnClickListener{
            var message=Toast.makeText(applicationContext, "nie ssij", Toast.LENGTH_LONG)
            message.show()

            val url="https://github.com/apokalipsa44"
            var someNewIntent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(someNewIntent)


        }
    }

    override fun onResume() {
        super.onResume()

        if (intent.hasExtra("selectedGender")){

            val message = intent.getStringExtra("selectedGender")
            println(message)
            gender.setText(message)

        }

    }
}
