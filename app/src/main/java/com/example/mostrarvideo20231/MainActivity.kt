package com.example.mostrarvideo20231

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MiBotonMuestraVideo: Button = findViewById(R.id.button)
        MiBotonMuestraVideo.setOnClickListener({
            val intent=Intent(this,MuestraVideoActivity::class.java)
            startActivity(intent)
        })
    }
}