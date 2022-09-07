package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listProvinsi = arrayListOf(
            ListProvinsi("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.aceh),
            ListProvinsi("Sumatra Utara", "Medan", R.drawable.sumut),
            ListProvinsi("Sumatra Selatan", "Palembang", R.drawable.sumsel),
            ListProvinsi("Sumatra Barat", "Padang", R.drawable.sumbar),
            ListProvinsi("Bengkulu", "Bengkulu", R.drawable.bengkulu),
            ListProvinsi("Riau", "Pekanbaru", R.drawable.riau),
            ListProvinsi("Jambi", "jambi", R.drawable.riauselaso,),
            ListProvinsi("lampung", "Bandar Lampung", R.drawable.lampung,),
            ListProvinsi("Bangka Belitung", "Pangkal Pinang", R.drawable.bangka,),
            ListProvinsi("Kalimantan Timur", "Samarinda", R.drawable.kaltim,),
            ListProvinsi("Kalimantan Barat", "Pontianak", R.drawable.kalbar,),
            ListProvinsi("Kalimantan Tengah", "Palangkaraya", R.drawable.kalteng,),
            ListProvinsi("Kalimantan Selatan", "Banjar Baru", R.drawable.kalsel,),
            ListProvinsi("Kalimantan Utara", "Tanjung Selor", R.drawable.kalut,),
            ListProvinsi("Jawa Barat", "Bandung", R.drawable.jabar,),
            ListProvinsi("Jawa Tengah", "Semarang", R.drawable.jateng,),
            ListProvinsi("Jawa Timur", "Surabaya", R.drawable.jatim,),
            ListProvinsi("Bali", "Denpasar", R.drawable.bali,),
            ListProvinsi("Nusa Tenggara Barat", "Mataram", R.drawable.ntb,),
            ListProvinsi("Nusa Tenggara Timur", "Kupang", R.drawable.ntt,),
            ListProvinsi("Sulawesi Utara", "Manado", R.drawable.sulut,),
            ListProvinsi("Sulawesi Barat", "Mamuju", R.drawable.mandar,),
            ListProvinsi("Sulawesi Tengah", "palu", R.drawable.sulteng,),
            ListProvinsi("Sulawesi Tenggara", "Kendari", R.drawable.sultenggara,),
            ListProvinsi("Sulawesi Selatan", "Makassar", R.drawable.sulsel,),
            ListProvinsi("Maluku Utara", "Sofifi", R.drawable.maluku,),
            ListProvinsi("Maluku", "Ambon", R.drawable.maluku_baileo,),
            ListProvinsi("Papua Barat", "Manokwari", R.drawable.papua_barat,),
            ListProvinsi("Papua", "Jayapura", R.drawable.papuahonai,),
            ListProvinsi("Papua Selatan", "Kabupaten Merauke", R.drawable.papuaselatan,),
            ListProvinsi("Papua Tengah", "kabupaten Nabire", R.drawable.papuatengah,),
            ListProvinsi("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.papuapegg,),
        )

        var adapterStudent  = StudentAdapter(listProvinsi)
        var lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerSatu.layoutManager = lm
        recyclerSatu.adapter = adapterStudent
    }
}