package com.pk.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.pk.tictactoe.multiplayer.MultiPlayerActivity
import com.pk.tictactoe.singleplayer.SinglePlayerActivity
import com.startapp.sdk.adsbase.StartAppAd
import com.startapp.sdk.adsbase.StartAppSDK
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_main)

        val animClockwise = AnimationUtils.loadAnimation(applicationContext, R.anim.clockwise)
        val animMove = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        val animFade = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
        val animSlide = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
        val animZoom = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        val animZoom2 = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom2)
        val animBlink = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
        imgTicTacToe.startAnimation(animBlink)
        zephGames.startAnimation(animClockwise)

        btnSingle.setOnClickListener{
            btnSingle.startAnimation(animZoom2)
            startActivity(Intent(this@MainActivity, SinglePlayerActivity::class.java))
            StartAppAd.showAd(this);
        }

        btnMulti.setOnClickListener{
            btnMulti.startAnimation(animZoom2)
            startActivity(Intent(this@MainActivity, MultiPlayerActivity::class.java))
            StartAppAd.showAd(this);
        }

        imgTicTacToe.setOnClickListener{
            imgTicTacToe.startAnimation(animBlink)
        }

        zephGames.setOnClickListener{
            zephGames.startAnimation(animClockwise)
        }

        // back ImageView
        imageViewBack.setOnClickListener {
            StartAppAd.onBackPressed(this);
            finish()
            //moveTaskToBack(true)
        }

        // quit ImageView
        imageViewQuit.setOnClickListener {
            finish()
            moveTaskToBack(true)
        }

    }

    // for handling back button of the Android Device
    override fun onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed()
        finish()
        //moveTaskToBack(true)
    }

}