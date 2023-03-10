package kr.ilf.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val btnClickMe = findViewById<Button>(R.id.myButton)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1;
            textView.text = timesClicked.toString()

            Toast.makeText(this, "Hey I'm a Toast!", Toast.LENGTH_SHORT).show()
        }
    }
}