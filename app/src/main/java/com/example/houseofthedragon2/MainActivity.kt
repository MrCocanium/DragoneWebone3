package com.example.houseofthedragon2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intent para detectar si se ha pulsado salir.
        if(intent.getBooleanExtra("Exit",false))
            finish()

        //Enlace al botón e incorporación de evento "click".
        val btnAnswer = findViewById<Button>(R.id.btnAnswer)
        btnAnswer.setOnClickListener {
            goToElection()
        }
    }

    fun goToElection() {
        //crear el intent
        val intent = Intent(this@MainActivity, ElectionActivity::class.java)
        //tomar el valor del cuadro de texto.
        val etNombre = this.findViewById<EditText>(R.id.etName)
        //añadimos la información necesaria al intent
        intent.putExtra("NAME", etNombre.text.toString())

        //iniciar la nueva actividad
        startActivity(intent)
    }

    companion object {
        const val LIFECLICLE = "LifeCycle"
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LIFECLICLE,"Se ha reiniciado la Activity (Restarted)")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LIFECLICLE,"Se ha iniciado la Activity (Started)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LIFECLICLE,"La Activity ha pasado a primer plano (Resumed)")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LIFECLICLE,"Se ha pausado la Activity (Paused)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LIFECLICLE,"Se ha parado la Activity (Stopped)")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LIFECLICLE,"Se ha destruido la Activity (Destroyed)")
    }
}