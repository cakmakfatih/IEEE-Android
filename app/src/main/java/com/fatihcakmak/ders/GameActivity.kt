package com.fatihcakmak.ders

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class GameActivity : AppCompatActivity() {

    val cisimler = arrayOf("Taş", "Makas", "Kağıt")
    var skor = 0
    var skorPC = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        btnTas.setOnClickListener {
            txtSecilenOyuncu.text = cisimler[0]
            oyna(0)
        }

        btnMakas.setOnClickListener {
            txtSecilenOyuncu.text = cisimler[1]
            oyna(1)
        }

        btnKagit.setOnClickListener {
            txtSecilenOyuncu.text = cisimler[2]
            oyna(2)
        }
    }

    fun oyna(secilen: Int){
        val rand = Random()
        val rastgele = rand.nextInt(3)
        val secilenPC = cisimler[rastgele]
        txtSecilenPc.text = secilenPC

        if(rastgele == secilen) {
            skor++
            skorPC++
            txtSkorOyuncu.text = "Sen: $skor"
            txtSkorPc.text = "Bilgisayar: $skorPC"
        } else {
            if(secilen == 0 && rastgele == 1){
                // kazandın
                skor++
                txtSkorOyuncu.text = "Sen: $skor"
            }
            else if(secilen == 0 && rastgele == 2){
                // kaybettin
                skorPC++
                txtSkorPc.text = "Bilgisayar: $skorPC"
            }
            else if(secilen == 1 && rastgele == 2){
                // kazandın
                skor++
                txtSkorOyuncu.text = "Sen: $skor"
            }
            else if(secilen == 1 && rastgele == 0){
                // kaybettin
                skorPC++
                txtSkorPc.text = "Bilgisayar: $skorPC"
            }
            else if(secilen == 2 && rastgele == 0){
                // kazandın
                skor++
                txtSkorOyuncu.text = "Sen: $skor"
            }
            else if(secilen == 2 && rastgele == 1){
                // kaybettin
                skorPC++
                txtSkorPc.text = "Bilgisayar: $skorPC"
            }
        }
    }
}
