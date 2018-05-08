package com.marlinstudios.com.marlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_reset.setOnClickListener { v ->
             answerString.animate().setDuration(100).rotationBy(360f)
                     .rotationXBy(360f).rotationYBy(360F)
            button_reset.animate().setDuration(100).rotationBy(-360f)
                     .rotationX(-360f).rotationY(-360F)
         }
    }
}
