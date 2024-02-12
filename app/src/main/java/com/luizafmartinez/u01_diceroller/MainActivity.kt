package com.luizafmartinez.u01_diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val rollButton = findViewById<Button>(R.id.roll_button)
        val rollButton: Button = findViewById(R.id.roll_button)

        // rollButton.setText("Roll the bones")
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {

            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}













