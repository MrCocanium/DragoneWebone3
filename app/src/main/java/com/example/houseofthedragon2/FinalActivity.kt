package com.example.houseofthedragon2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val result= findViewById<TextView>(R.id.respu)
        val btnSalir=findViewById<Button>(R.id.salir)
        val decision =intent.getStringExtra("CHOICE")
        result.apply {
            text=getString(R.string.eleccion,decision)
        }

        btnSalir.setOnClickListener{
            finishAffinity()
        }
    }
}