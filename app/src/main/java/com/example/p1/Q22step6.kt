package com.example.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_q22.*
import kotlinx.android.synthetic.main.activity_q22.btnBackToTitle
import kotlinx.android.synthetic.main.activity_q22step1.*

class Q22step6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q22step6)

        btnBackToTitle.setOnClickListener() {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

        }
        btnBack.setOnClickListener() {
            intent = Intent(this, Q22::class.java)
            startActivity(intent)

        }

        findViewById<Button>(R.id.btnDone).setOnClickListener {
            addNickname(it)
        }

    }
    fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
    }

}
