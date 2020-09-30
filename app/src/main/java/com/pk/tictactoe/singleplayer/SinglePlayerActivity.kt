package com.pk.tictactoe.singleplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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
import kotlinx.android.synthetic.main.activity_singleplayer.*
import kotlinx.android.synthetic.main.activity_singleplayer.button0
import kotlinx.android.synthetic.main.activity_singleplayer.button1
import kotlinx.android.synthetic.main.activity_singleplayer.button2
import kotlinx.android.synthetic.main.activity_singleplayer.button3
import kotlinx.android.synthetic.main.activity_singleplayer.button4
import kotlinx.android.synthetic.main.activity_singleplayer.button5
import kotlinx.android.synthetic.main.activity_singleplayer.button6
import kotlinx.android.synthetic.main.activity_singleplayer.button7
import kotlinx.android.synthetic.main.activity_singleplayer.button8
import kotlinx.android.synthetic.main.activity_singleplayer.buttonReset
import kotlinx.android.synthetic.main.activity_singleplayer.imageViewGameOn
import java.util.*
import kotlin.collections.ArrayList

class SinglePlayerActivity : AppCompatActivity() {

    var chance = "X"
    var delay: Long = 500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_singleplayer)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        imageViewGameOn.startAnimation(anim)

        var board = arrayListOf<String>("", "", "", "", "", "", "", "", "")

        button0.setOnClickListener {
            if (board[0] == "") {
                chance = "X"
                button0.text = "X"
                board[0] = "X"
                buttonTextColor(button0)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button1.setOnClickListener {
            if (board[1] == "") {
                chance = "X"
                button1.text = "X"
                board[1] = "X"
                buttonTextColor(button1)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button2.setOnClickListener {
            if (board[2] == "") {
                chance = "X"
                button2.text = "X"
                board[2] = "X"
                buttonTextColor(button2)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button3.setOnClickListener {
            if (board[3] == "") {
                chance = "X"
                button3.text = "X"
                board[3] = "X"
                buttonTextColor(button3)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button4.setOnClickListener {
            if (board[4] == "") {
                chance = "X"
                button4.text = "X"
                board[4] = "X"
                buttonTextColor(button4)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button5.setOnClickListener {
            if (board[5] == "") {
                chance = "X"
                button5.text = "X"
                board[5] = "X"
                buttonTextColor(button5)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button6.setOnClickListener {
            if (board[6] == "") {
                chance = "X"
                button6.text = "X"
                board[6] = "X"
                buttonTextColor(button6)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button7.setOnClickListener {
            if (board[7] == "") {
                chance = "X"
                button7.text = "X"
                board[7] = "X"
                buttonTextColor(button7)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        button8.setOnClickListener {
            if (board[8] == "") {
                chance = "X"
                button8.text = "X"
                board[8] = "X"
                buttonTextColor(button8)
                if(!isBoardFull(board) && !result(board, "X")) {
                    val position = getComputerMove(board)
                    board[position] = "O"
                    Handler().postDelayed({
                        displayComputerButton(position)
                    }, delay)
                }
            }
            Handler().postDelayed({
                resultOut(board)
            }, delay)
        }

        buttonReset.setOnClickListener{
            finish()
            startActivity(Intent(this@SinglePlayerActivity, SinglePlayerActivity::class.java))
        }

        // back ImageView
        imageViewBack.setOnClickListener{
            StartAppAd.onBackPressed(this);
            finish()
            //startActivity(Intent(this@SinglePlayerActivity, MainActivity::class.java))
        }

        // quit ImageView
        imageViewQuit.setOnClickListener {
            finish()
            moveTaskToBack(true)   //to quit app
        }

    }

    private fun getComputerMove(board: ArrayList<String>): Int {

        //check if computer can win in this move
        for (i in 0..board.count()-1){
            var copy: ArrayList<String> = getBoardCopy(board)
            if(copy[i] == "") copy[i] = "O"
            if(result(copy, "O")) return i
        }

        //check if player could win in the next move
        for (i in 0..board.count()-1){
            var copy2 = getBoardCopy(board)
            if(copy2[i] == "") copy2[i] = "X"
            if(result(copy2, "X")) return i
        }

        //try to take corners if its free
        var move = choseRandomMove(board, arrayListOf<Int>(0, 2, 6, 8))
        if(move != -1)
            return move

        //try to take center if its free
        if(board[4] == "") return 4

        //move on one of the sides
        return choseRandomMove(board, arrayListOf<Int>(1, 3, 5, 7))
    }


    private fun choseRandomMove(board: ArrayList<String>, list: ArrayList<Int>): Int {
        var possibleMoves = arrayListOf<Int>()
        for (i in list){
            if(board[i] == "") possibleMoves.add(i)
        }
        if(possibleMoves.isEmpty()) return -1
        else {
            var index = Random().nextInt(possibleMoves.count())
            return possibleMoves[index]
        }
    }

    private fun getBoardCopy(board: ArrayList<String>): ArrayList<String> {
        var bd = arrayListOf<String>("", "", "", "", "", "", "", "", "")
        for (i in 0..board.count()-1) {
            bd[i] = board[i]
        }
        return bd
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
            startActivity(Intent(this@SinglePlayerActivity, ResultActivity::class.java).putExtra("player", "YOU"))
        }else if(result(board, "O")){
            finish()
            startActivity(Intent(this@SinglePlayerActivity, ResultActivity::class.java).putExtra("player", "COMPUTER"))
        }
        else if(isBoardFull(board)){
            finish()
            startActivity(Intent(this@SinglePlayerActivity, ResultActivity::class.java).putExtra("player", "Tie"))
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

    private fun displayComputerButton(position: Int){
        if(position == 0){
            button0.text = "O"
            chance = "0"
            buttonTextColor(button0)
        }
        else if(position == 1){
            button1.text = "O"
            chance = "0"
            buttonTextColor(button1)
        }
        else if(position == 2){
            button2.text = "O"
            chance = "0"
            buttonTextColor(button2)
        }
        else if(position == 3){
            button3.text = "O"
            chance = "0"
            buttonTextColor(button3)
        }
        else if(position == 4){
            button4.text = "O"
            chance = "0"
            buttonTextColor(button4)
        }
        else if(position == 5){
            button5.text = "O"
            chance = "0"
            buttonTextColor(button5)
        }
        else if(position == 6){
            button6.text = "O"
            chance = "0"
            buttonTextColor(button6)
        }
        else if(position == 7){
            button7.text = "O"
            chance = "0"
            buttonTextColor(button7)
        }
        else if(position == 8){
            button8.text = "O"
            chance = "0"
            buttonTextColor(button8)
        }
    }

    // for handling back buttton of the Android Device
    override fun onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed()
        finish()
        //startActivity(Intent(this@SinglePlayerActivity, MainActivity::class.java))
    }

}