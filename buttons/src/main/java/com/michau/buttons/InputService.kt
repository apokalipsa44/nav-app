package com.michau.buttons

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

fun passwordVerification(passw: EditText, passwVerify:TextView){
    passw.addTextChangedListener(object: TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if (passw.isFocused) {
                if (passw.length() < 6) {
                    passwVerify.setText("to short")
                }else{
                    passwVerify.setText("")
                }
            }
        }
    })
}