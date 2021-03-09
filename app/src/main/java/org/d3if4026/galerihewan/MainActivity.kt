package org.d3if4026.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "jumlah data" + getData().size)
    }
    private fun getData() : List<Hewan> {
        return  listOf(
            Hewan("Angsa","Cygnus olor"),
            Hewan("Ayam","Gallus gallus"),
            Hewan("Bebek","Carina moschata"),
            Hewan("Domba","Ovis ammon"),
            Hewan("Kalkun","Meleagris gallopavo"),
            Hewan("Kambing","Capricornis sumantrensis"),
            Hewan("Kelinci","Oryctolagus cuniculus"),
            Hewan("Kerbau","Bubalus bubalis"),
            Hewan("Kuda","Equus cabalus"),
            Hewan("Sapi","Bos taurus")
        )

    }
}