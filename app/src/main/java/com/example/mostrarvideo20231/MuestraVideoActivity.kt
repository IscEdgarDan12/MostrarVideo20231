package com.example.mostrarvideo20231

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MuestraVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muestra_video)
        var video : VideoView=findViewById(R.id.videoView)
        val rutaVideo="android.resource://"+packageName+"/raw/"+R.raw.kobe
        video.setVideoURI(Uri.parse(rutaVideo))
        video.setMediaController(MediaController(this))
        video.start()
    }
}