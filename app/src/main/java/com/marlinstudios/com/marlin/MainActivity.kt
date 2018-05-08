package com.marlinstudios.com.marlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stockText = answerString.text
        button_reset.setOnClickListener { v ->
            answerString.animate().setDuration(500).rotationBy(360f)
                answerString.text = stockText
            button_reset.animate().setDuration(500).rotationBy(360f)
            button1.animate().setDuration(500).rotationBy(360f)
            button2.animate().setDuration(500).rotationBy(360f)
            button3.animate().setDuration(500).rotationBy(360f)
            button4.animate().setDuration(500).rotationBy(360f)
            button5.animate().setDuration(500).rotationBy(360f)
            button6.animate().setDuration(500).rotationBy(360f)
            button7.animate().setDuration(500).rotationBy(360f)
            button8.animate().setDuration(500).rotationBy(360f)
            button9.animate().setDuration(500).rotationBy(360f)
            buttonOneZero.animate().setDuration(500).rotationBy(360f)
            buttonTwoZero.animate().setDuration(500).rotationBy(360f)
            buttontThreeZero.animate().setDuration(500).rotationBy(360f)
            button_ans.animate().setDuration(500).rotationBy(360f)
            button_div.animate().setDuration(500).rotationBy(360f)
            button_minus.animate().setDuration(500).rotationBy(360f)
            button_plus.animate().setDuration(500).rotationBy(360f)
            button_sqr.animate().setDuration(500).rotationBy(360f)
            button_sqrt.animate().setDuration(500).rotationBy(360f)
        }
    }
}
