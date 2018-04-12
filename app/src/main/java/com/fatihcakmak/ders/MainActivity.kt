package com.fatihcakmak.ders

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            updateUI(1)
        }

        txtTitle.setOnClickListener {
            txtTitle.text = "Onur"
        }
    }

    fun updateUI(page: Int){
        if(page == 1){
            val GameScreenIntent = Intent(this, GameActivity::class.java)
            startActivity(GameScreenIntent)
        }
    }
}
