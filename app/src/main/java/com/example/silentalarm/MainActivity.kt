package com.example.silentalarm

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Button
import java.time.LocalDate


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val date = LocalDate.now()
            val formatter = DateTimeFormatter.ofPattern("E MMM dd, yyyy")
            val text = date.format(formatter)
            dayView.text = text
        } else {
            var date = Date();
            val formatter = SimpleDateFormat("MMM dd yyyy")
            val answer: String = formatter.format(date)
            dayView.text = answer
        }

        settingbtn.setOnClickListener {
            //TODO launch settings activity

        }

        alarmbtn.setOnClickListener{
            //TODO launch alarms DB

        }

    }
}

