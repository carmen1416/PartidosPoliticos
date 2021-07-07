package com.example.partidos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.time.seconds

class MainActivity : AppCompatActivity() {
    private var pri = 0;
    private var pan = 0;
    private var na = 0;
    private var prd = 0;
    private var pt = 0;
    private var ver = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun votoPRI(view: View) {
        pri ++
        Toast.makeText(this, "voto exitoso: PRI", Toast.LENGTH_SHORT).show()
    }
    fun votoPAN(view: View) {
        pan ++
        Toast.makeText(this, "voto exitoso: PAN", Toast.LENGTH_SHORT).show()
    }
    fun votoNA(view: View) {
        na ++
        Toast.makeText(this, "voto exitoso: NA", Toast.LENGTH_SHORT).show()
    }
    fun votoPRD(view: View) {
        prd ++
        Toast.makeText(this, "voto exitoso: PRD", Toast.LENGTH_SHORT).show()
    }
    fun votoPT(view: View) {
        pt ++
        Toast.makeText(this, "voto exitoso: PT", Toast.LENGTH_SHORT).show()
    }
    fun votoVer(view: View) {
        ver ++
        Toast.makeText(this, "voto exitoso: Verde", Toast.LENGTH_SHORT).show()
    }
    fun Resultados(view: View) {
        val intent: Intent = Intent(applicationContext, Ventana2::class.java)
        intent.putExtra("PRID", pri)
        intent.putExtra("PAND", pan)
        intent.putExtra("NAD", na)
        intent.putExtra("PRDD", prd)
        intent.putExtra("PTD", pt)
        intent.putExtra("VERD", ver)
        startActivity(intent);
    }
}