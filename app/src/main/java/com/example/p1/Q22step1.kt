package com.example.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_q22.btnBackToTitle
import kotlinx.android.synthetic.main.activity_q22step1.*

class Q22step1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q22step1)

        btnBackToTitle.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        btnBack.setOnClickListener() {
            intent = Intent(this, Q22::class.java)
            startActivity(intent)

        }

    }
}
