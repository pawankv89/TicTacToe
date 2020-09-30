package com.pk.tictactoe.multiplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.core.content.ContextCompat
import com.pk.tictactoe.MainActivity
import com.pk.tictactoe.R
import com.pk.tictactoe.multiplayer.MultiPlayerActivity
import com.pk.tictactoe.result.ResultActivity
import com.pk.tictactoe.singleplayer.SinglePlayerActivity
import com.startapp.sdk.adsbase.StartAppAd
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imageViewBack
import kotlinx.android.synthetic.main.activity_main.imageViewQuit
import kotlinx.android.synthetic.main.activity_multiplayer.*
import java.util.*
import kotlin.collections.ArrayList

class MultiPlayerActivity : AppCompatActivity() {

    var chance = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_multiplayer)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        imageViewGameOn.startAnimation(anim)

        var board = arrayListOf<String>("", "", "", "", "", "", "", "", "")

        button0.setOnClickListener {
            if (board[0] != "")
            else if (chance == "X") {
                buttonTextColor(button0)
                button0.text = "X"
                board[0] = "X"
                chance = "O"

            } else {
                buttonTextColor(button0)
                button0.text = "O"
                board[0] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button1.setOnClickListener {
            if (board[1] != "")
            else if (chance == "X") {
                buttonTextColor(button1)
                button1.text = "X"
                board[1] = "X"
                chance = "O"
            } else {
                buttonTextColor(button1)
                button1.text = "O"
                board[1] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button2.setOnClickListener {
            if (board[2] != "")
            else if (chance == "X") {
                buttonTextColor(button2)
                button2.text = "X"
                board[2] = "X"
                chance = "O"
            } else {
                buttonTextColor(button2)
                button2.text = "O"
                board[2] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button3.setOnClickListener {
            if (board[3] != "")
            else if (chance == "X") {
                buttonTextColor(button3)
                button3.text = "X"
                board[3] = "X"
                chance = "O"
            } else {
                buttonTextColor(button3)
                button3.text = "O"
                board[3] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button4.setOnClickListener {
            if (board[4] != "")
            else if (chance == "X") {
                buttonTextColor(button4)
                button4.text = "X"
                board[4] = "X"
                chance = "O"
            } else {
                buttonTextColor(button4)
                button4.text = "O"
                board[4] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button5.setOnClickListener {
            if (board[5] != "")
            else if (chance == "X") {
                buttonTextColor(button5)
                button5.text = "X"
                board[5] = "X"
                chance = "O"
            } else {
                buttonTextColor(button5)
                button5.text = "O"
                board[5] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button6.setOnClickListener {
            if (board[6] != "")
            else if (chance == "X") {
                buttonTextColor(button6)
                button6.text = "X"
                board[6] = "X"
                chance = "O"
            } else {
                buttonTextColor(button6)
                button6.text = "O"
                board[6] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button7.setOnClickListener {
            if (board[7] != "")
            else if (chance == "X") {
                buttonTextColor(button7)
                button7.text = "X"
                board[7] = "X"
                chance = "O"
            } else {
                buttonTextColor(button7)
                button7.text = "O"
                board[7] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button8.setOnClickListener {
            if (board[8] != "")
            else if (chance == "X") {
                buttonTextColor(button8)
                button8.text = "X"
                board[8] = "X"
                chance = "O"
            } else {
                buttonTextColor(button8)
                button8.text = "O"
                board[8] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        buttonReset.setOnClickListener{
            finish()
            startActivity(Intent(this@MultiPlayerActivity, MultiPlayerActivity::class.java))
        }

        // back ImageView
        imageViewBack.setOnClickListener{
            StartAppAd.onBackPressed(this);
            finish()
            startActivity(Intent(this@MultiPlayerActivity, MainActivity::class.java))
        }

        // quit ImageView
        imageViewQuit.setOnClickListener {
            finish()
            moveTaskToBack(true)     //to quit app
        }

    }

    private fun buttonTextColor(button: Button) {
        if (this.chance == "X"){
            button.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorX))
        } else {
            button.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorO))
        }
    }

    private fun resultOut(board: ArrayList<String>){
        if(result(board, "X")){
            finish()
            startActivity(Intent(this@MultiPlayerActivity, ResultActivity::class.java).putExtra("player", "X"))
        }else if(result(board, "O")){
            finish()
            startActivity(Intent(this@MultiPlayerActivity, ResultActivity::class.java).putExtra("player", "O"))
        }
        else if(isBoardFull(board)){
            finish()
            startActivity(Intent(this@MultiPlayerActivity, ResultActivity::class.java).putExtra("player", "Tie"))
        }
    }

    private fun isBoardFull(board: ArrayList<String>): Boolean {
        for (i in board)
            if(i == "") return false
        return true
    }

    private fun result(bd: ArrayList<String>, s: String): Boolean =
        if(bd[0] == s && bd[1] == s && bd[2] == s) true
        else if(bd[3] == s && bd[4] == s && bd[5] == s) true
        else if(bd[6] == s && bd[7] == s && bd[8] == s) true
        else if(bd[0] == s && bd[3] == s && bd[6] == s) true
        else if(bd[1] == s && bd[4] == s && bd[7] == s) true
        else if(bd[2] == s && bd[5] == s && bd[8] == s) true
        else if(bd[0] == s && bd[4] == s && bd[8] == s) true
        else if(bd[2] == s && bd[4] == s && bd[6] == s) true
        else false

    // for handling back buttton of the Android Device
    override fun onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed()
        finish()
        //startActivity(Intent(this@MultiPlayerActivity, MainActivity::class.java))
    }

}
