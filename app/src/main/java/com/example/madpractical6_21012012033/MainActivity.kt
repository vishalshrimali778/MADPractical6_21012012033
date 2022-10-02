package com.example.madpractical6_21012012033

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myVideoView = findViewById<VideoView>(R.id.my_video_view)
        val btnFloatingButton=findViewById<FloatingActionButton>(R.id.btn_floating)

        val mediaController = MediaController(this)
        val uri:Uri= Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        btnFloatingButton.setOnClickListener {
            Intent(this,YoutubeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}