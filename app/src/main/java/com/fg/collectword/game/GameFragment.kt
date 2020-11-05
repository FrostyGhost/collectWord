package com.fg.collectword.game

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment : Fragment(R.layout.fragment_game) {

    private var testLetterList : ArrayList<String> = ArrayList()
    private val answer_field = 4

    private var answerLetterList:ArrayList<TextView> = ArrayList()
    private var letterList:ArrayList<TextView> = ArrayList()
    var h: Int = 100

    val testWords:ArrayList<String> = ArrayList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTestWords()
        initTestLetter()
        setupAnswerField()
        setupLetterField()
    }

    private fun answerClick (view: TextView) {
        clearAnswerBtn(view.text)
        view.text = ""
    }

    private fun letterClick (view: TextView) {
        if (view.text != ""){
            if (setAnswerBtn(view.text)){
                view.text = ""
            }
        }
        checkWord()
    }


    //maybe take out in coroutines
    private fun checkWord(){
        var userWord = ""
        for (btn : TextView in answerLetterList){
            if (btn.text != ""){
                userWord += btn.text
                checkMatch(userWord)
            }
        }
    }
    private fun checkMatch(userWord: String) {
        for (words: String in testWords){
            if (userWord == words){
                Toast.makeText(requireContext(), "YVIII", Toast.LENGTH_LONG).show()
                val score = userScore.text.toString().toInt() + userWord.length
                userScore.text = score.toString()
                clearAnswerField()
                testWords.remove(words)
            }
        }
    }

    private fun clearAnswerField(){
        for (btn:TextView in answerLetterList){
            btn.callOnClick()
        }
    }
    private fun clearAnswerBtn(text: CharSequence) {
        for (btn : TextView in letterList){
            if (btn.text == ""){
                btn.text = text
                return
            }
        }
    }

    private fun setAnswerBtn(text: CharSequence):Boolean {
        for (btn : TextView in answerLetterList){
            if (btn.text == ""){
                Log.d("Q2", btn.id.toString())
                btn.text = text
                return true
            }
        }
        return false
    }

//    Верхні букви
    private fun setupAnswerField(){
        val params = LinearLayout.LayoutParams(h,h)
        params.setMargins(16,0,16,0)
        for (btnPos in 0 .. answer_field){
            val btn = TextView(requireContext())
            btn.text = ""
            btn.layoutParams = params
            btn.id = btnPos
            btn.setBackgroundColor(Color.WHITE)
            btn.gravity = Gravity.CENTER
            btn.setOnClickListener(View.OnClickListener { answerClick(it as TextView) })
            llGameRow1.addView(btn)
            answerLetterList.add(btn)
        }
    }

    //Нижні букви
    private fun setupLetterField(){
        val params = LinearLayout.LayoutParams(h,h)
        params.setMargins(16,0,16,0)
        for (pos in 0 .. answer_field){
            val btn = TextView(requireContext())
            btn.text = testLetterList[pos]
            btn.layoutParams = params
            btn.id = pos + 100
            btn.setBackgroundColor(Color.WHITE)
            btn.gravity = Gravity.CENTER
            btn.setOnClickListener(View.OnClickListener { letterClick(it as TextView) })
            llLetterRow1.addView(btn)
            letterList.add(btn)
        }
    }

    private fun initTestLetter(){
        testLetterList.add("K")
        testLetterList.add("I")
        testLetterList.add("T")
        testLetterList.add("T")
        testLetterList.add("Y")
    }
    private fun initTestWords(){
        testWords.add("KITTY")
        testWords.add("KIT")
        testWords.add("IT")
    }
}