package com.example.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_q22.*

class Q22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q22)

        btnStep1.setOnClickListener() {
            intent = Intent(this, Q22step1::class.java)
            startActivity(intent)

        }
        btnStep2.setOnClickListener() {
            intent = Intent(this, Q22step2::class.java)
            startActivity(intent)

        }

        btnStep3.setOnClickListener() {
            intent = Intent(this, Q22step3::class.java)
            startActivity(intent)

        }

        btnStep4.setOnClickListener() {
            intent = Intent(this, Q22step4::class.java)
            startActivity(intent)

        }

        btnStep5.setOnClickListener() {
            intent = Intent(this, Q22step5::class.java)
            startActivity(intent)

        }

        btnStep6.setOnClickListener() {
            intent = Intent(this, Q22step6::class.java)
            startActivity(intent)

        }

        btnStep7.setOnClickListener() {
            intent = Intent(this, Q22step7::class.java)
            startActivity(intent)

        }


        btnBackToTitle.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
