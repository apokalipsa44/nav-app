package com.michau.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        passwordVerification(passw,passwVerify)


    }

    // coś jak render z reacta
//    override fun onUserInteraction() {
//        super.onUserInteraction()
//        if (passw.isFocused) {
//            if (passw.length() < 6) {
//                passwVerify.setText("to short")
//            }else{
//                passwVerify.setText("")
//            }
//        }
//    }
}
