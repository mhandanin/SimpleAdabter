package com.bahraoui.simple_adabter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val lv = findViewById<ListView>(R.id.lv)

//        val products= listOf(
//            mapOf("name" to "samsung", "prix" to "8000DH"),
//            mapOf("name" to "Nokia", "prix" to "5000DH"),
//            mapOf("name" to "Google", "prix" to "7000DH"),
//            mapOf("name" to "Xiaomi", "prix" to "9000DH"),
//            mapOf("name" to "Lenovo", "prix" to "2000"),
//        )
//
//
//        val adp=SimpleAdapter(this,products,android.R.layout.simple_list_item_2, arrayOf("name","prix"),
//            intArrayOf(android.R.id.text1,android.R.id.text2))
//
//        lv.adapter=adp


        var listDrivers = listOf(
            mapOf("nom" to "Lewis Hamilton", "image" to R.drawable.ojdpprm),
            mapOf("nom" to "Max Verstappen", "image" to R.drawable.vfi74wed),
            mapOf("nom" to "Lando Norris", "image" to R.drawable.fjrzkssk),
            mapOf("nom" to "Fernando Alonso", "image" to R.drawable.hf35m336),
            mapOf("nom" to "Valtteri Bottas", "image" to R.drawable.k1jzj0gr),
            mapOf("nom" to "Alexander Albon", "image" to R.drawable.spb7hldv),

            )

        val adp2 = SimpleAdapter(
            this, listDrivers, R.layout.custom_simple_adabter, arrayOf("nom", "image"),
            intArrayOf(R.id.textName, R.id.image)
        )

        lv.adapter = adp2


    }
}