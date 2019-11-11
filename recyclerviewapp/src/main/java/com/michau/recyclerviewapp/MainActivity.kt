package com.michau.recyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // layoutManager ustawia sposob wyświetlania recycler view (lista siatka itp
        recyclerView.layoutManager=LinearLayoutManager(this)

        recyclerView.adapter=MyAdapter()

    }
}
