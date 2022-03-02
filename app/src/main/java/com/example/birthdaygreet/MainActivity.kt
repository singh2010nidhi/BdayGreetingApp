package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        //val name = nameInput.editableText.toString()
        //Toast.makeText(this, "name is entered", Toast.LENGTH_LONG).show()
        //val name = nameInput.editableText.toString()
        val nameInputTo: EditText =findViewById(R.id.nameInputTo)
        val name1=nameInputTo.text.toString()
        val intent1 = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA1, name1)

        val nameInputFrom: EditText =findViewById(R.id.nameInputFrom)
        val name2=nameInputFrom.text.toString()
        val intent2 = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA2, name2)

        println("this")
        startActivity(intent)

    }

}