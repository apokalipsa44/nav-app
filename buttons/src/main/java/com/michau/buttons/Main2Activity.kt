package com.michau.buttons

import android.app.usage.UsageEvents
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        passwordVerification(passw, passwVerify)
//          lisner dla radiobuttons
//        genderSelector.setOnCheckedChangeListener { group, checkedId ->
//            run  {
//                var intentToReturnToFirstActivity = Intent(applicationContext, MainActivity::class.java)
//                var selectedButton:RadioButton=findViewById(checkedId)
//                intentToReturnToFirstActivity.putExtra("selectedGender",selectedButton.text )
//                startActivity(intentToReturnToFirstActivity)
//            }
//        }


    }

    fun getUserData(view: View) {
        if (!checkBox.isChecked) {
            Toast.makeText(applicationContext, "zaznacz kumam", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(applicationContext, loginData::class.java)
            intent.putExtra("login", login.text)
            intent.putExtra("password", passw.text)
            intent.putExtra(
                "gender",
                findViewById<RadioButton>(genderSelector.checkedRadioButtonId).text
            )
            if (checkBox2.isChecked) {
                intent.putExtra("spam", "YES")
            } else {
                intent.putExtra("spam", "NO")
            }
            startActivity(intent)
        }
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
