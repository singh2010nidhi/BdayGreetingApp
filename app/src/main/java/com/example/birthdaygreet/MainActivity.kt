package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun createBirthdayCard(view: View) {

            val nameInputTo: EditText = findViewById(R.id.nameInputTo)
            val nameInputFrom: EditText = findViewById(R.id.nameInputFrom)
            val intent = Intent(this, BirthdayGreetingActivity::class.java)

            val bundle = bundleOf(
                Pair("name1", nameInputTo.text.toString()),
                Pair("name2", nameInputFrom.text.toString())
            )
            intent.putExtras(bundle)
            startActivity(intent)
        }
}
