package com.example.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnQ1.setOnClickListener() {
            intent = Intent(this, Q22::class.java)
            startActivity(intent)

        }

        btnQ2.setOnClickListener() {
            intent = Intent(this, Q24::class.java)
            startActivity(intent)

        }


    }
}
