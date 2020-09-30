package com.pk.tictactoe.result

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.pk.tictactoe.MainActivity
import com.pk.tictactoe.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_result)

        val player = intent.getStringExtra("player")
        if(player == "Tie") textViewWon.text = "TIE"
        else textViewWon.text = "$player WON"

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        textViewWon.startAnimation(anim)

        Handler().postDelayed({
            finish()
            //startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }, 3000)
    }
}