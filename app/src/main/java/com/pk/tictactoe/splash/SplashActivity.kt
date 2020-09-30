package com.pk.tictactoe.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.pk.tictactoe.MainActivity
import com.pk.tictactoe.R
import com.startapp.sdk.adsbase.StartAppAd
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Disable Splash Ads
        StartAppAd.disableSplash();

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_splash)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        imageViewLogo.startAnimation(anim)

        Handler().postDelayed({
            finish()
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }, 5000)
    }
}