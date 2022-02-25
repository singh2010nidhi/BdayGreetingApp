package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.TextView


class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        //val birthdayGreeting:  =findViewById(R.id.birthdayGreeting)
        //R.id.birthdayGreeting.EditText = "Happy Birthday $name"

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(NAME_EXTRA)

        // Capture the layout's TextView and set the string as its text
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting).apply { text = "Happy Birthday\n$message!" }
    }
}