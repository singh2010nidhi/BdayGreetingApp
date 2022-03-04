package com.example.birthdaygreet

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val name1 = "name_extra"
        const val name2 = "name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        // Get the Intent that started this activity and extract the string

        val bundle = intent.extras
        val toName = bundle?.getString("name1")
        val fromName = bundle?.getString("name2")


        // Capture the layout's TextView and set the string as its text
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting).apply { text = "Happy Birthday\n $toName \n from $fromName!" }
    }
}