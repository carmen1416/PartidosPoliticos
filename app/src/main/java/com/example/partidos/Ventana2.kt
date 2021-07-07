package com.example.partidos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.security.PublicKey

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)

        val MA: Intent = intent
        var pri = MA.getIntExtra("PRID", 0)
        var pan = MA.getIntExtra("PAND", 0)
        var na = MA.getIntExtra("NAD", 0)
        var prd = MA.getIntExtra("PRDD", 0)
        var pt = MA.getIntExtra("PTD", 0)
        var ver = MA.getIntExtra("VERD", 0)

        var porcent = 100 / (pri + pan + na + prd + pt + ver)

        var priPorcent = porcent * pri
        var panPorcent = porcent * pan
        var naPorcent = porcent * na
        var prdPorcent = porcent * prd
        var ptPorcent = porcent * pt
        var verPorcent = porcent * ver

        findViewById<TextView>(R.id.txtvpri).text = "$pri"
        findViewById<TextView>(R.id.txtVPAN).text = "$pan"
        findViewById<TextView>(R.id.txtVNA).text = "$na"
        findViewById<TextView>(R.id.txtVPRD).text = "$prd"
        findViewById<TextView>(R.id.txtVPT).text = "$pt"
        findViewById<TextView>(R.id.txtVVER).text = "$ver"

        findViewById<TextView>(R.id.txtPPRI).text = "$priPorcent%"
        findViewById<TextView>(R.id.txtPPAN).text = "$panPorcent%"
        findViewById<TextView>(R.id.txtPNA).text = "$naPorcent%"
        findViewById<TextView>(R.id.txtPPRD).text = "$prdPorcent%"
        findViewById<TextView>(R.id.txtPPT).text = "$ptPorcent%"
        findViewById<TextView>(R.id.txtPVER).text = "$verPorcent%"
    }


    fun Regresar(view: View) {
        //Toast.makeText(this, "$pri", Toast.LENGTH_LONG).show()
        val pag2: Intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(pag2);
    }
}