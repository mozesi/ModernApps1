package com.example.modernapps1

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num = 3000
      txt_show.text ="Moses Msukwa $num"
        txt_show.setOnClickListener{ Toast.makeText(this,"Message",Toast.LENGTH_LONG).show()}
    }

}
