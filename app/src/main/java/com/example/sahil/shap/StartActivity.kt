package com.example.sahil.shap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, MainActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
