package com.michau.buttons

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
        }

        disl.setOnClickListener{
            var message=Toast.makeText(applicationContext, "nie ssij", Toast.LENGTH_LONG)
            message.show()

            
        }
    }
}
