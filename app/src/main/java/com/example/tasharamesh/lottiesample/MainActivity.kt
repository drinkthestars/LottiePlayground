package com.example.tasharamesh.lottiesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fullscreen_animation.setAnimation("lottiefiles.com - Mail Sent.json")

        fullscreen_animation.pauseAnimation()
        fullscreen_animation.progress = 0.05f

        val handler = Handler()

        handler.postDelayed({
            fullscreen_animation.resumeReverseAnimation()
        }, 3000L)
    }
}
