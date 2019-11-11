package com.michau.recyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_row.view.*

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var contactRow = layoutInflater.inflate(R.layout.contact_row, parent, false)
        return MyViewHolder(contactRow)

    }

    override fun getItemCount(): Int {
       return Contacts.contactList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //przypisuje polom pola z widoku
        val name=holder.view.contact_name
        var number=holder.view.contact_number
        //zapissuje do pól konkretne wortości z pliku (jako szablon dlatego jest [position]
        name.setText(Contacts.contactList[position])
        number.setText(Contacts.numbersList[position])
    }
}