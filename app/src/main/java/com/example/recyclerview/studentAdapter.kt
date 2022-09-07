package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent : ArrayList<ListProvinsi>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

//    ambil id dari layout
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.tvNama)
        var nimStudent = view.findViewById<TextView>(R.id.tvNim)
        var imgStudent = view.findViewById<ImageView>(R.id.ivSatu)

    }
//    buat object viewholder - untuk  register view  - inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false)
        return ViewHolder(view)
    }

//    set data ke layout
    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].Provinsi
        holder.nimStudent.text = listStudent[position].Ibukota
        holder.imgStudent.setImageResource(listStudent[position].image)
    }

//    ada beberapa item yang akan muncul di recyclerview
    override fun getItemCount(): Int {
        return listStudent.size
    }
}


