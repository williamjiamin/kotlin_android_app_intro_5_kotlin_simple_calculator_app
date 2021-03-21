package com.lexueoude.lxodcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText
    var number1 : Float = 0.0f
    var isPlus: Boolean = false
    var isMinus: Boolean = false
    var isDiv: Boolean = false
    var isMul: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.number_edit_text)
    }

    fun operationFunction(view : View){

        when(view.id){

            R.id.button_one -> {
                numberClicked(1)
            }
            R.id.button_two -> {
                numberClicked(2)
            }
            R.id.button_three -> {
                numberClicked(3)
            }
            R.id.button_four -> {
                numberClicked(4)
            }
            R.id.button_five -> {
                numberClicked(5)
            }
            R.id.button_six -> {
                numberClicked(6)
            }
            R.id.button_seven -> {
                numberClicked(7)
            }
            R.id.button_eight -> {
                numberClicked(8)
            }
            R.id.button_nine -> {
                numberClicked(9)
            }
            R.id.button_zero -> {
                numberClicked(0)
            }
            R.id.C -> {
                editText.setText("")
            }

            R.id.point -> {
                pointClicked()
            }

            R.id.plus -> {
               plusClicked()
            }

            R.id.minus -> {
                minusClicked()
            }
            R.id.div -> {
               divClicked()
            }
            R.id.mul -> {
                mulClicked()
            }

            R.id.eql ->{
                eqlClicked()
            }

        }

    }
    private fun numberClicked(numberClicked : Int){
        val number = editText.text.toString() + numberClicked.toString()
        editText.setText(number)
    }
    private fun pointClicked(){
        val number = editText.text.toString() + "."
        editText.setText(number)
    }
    private fun plusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus = true
    }
    private fun minusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus = true
    }
    private fun divClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDiv = true
    }
    private fun mulClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMul = true
    }

    private fun eqlClicked(){
        when {
            isPlus -> {
                plus()
            }
            isMinus -> {
                minus()
            }
            isDiv -> {
               div()
            }
            isMul -> {
                mul()
            }
        }
    }
    private fun plus(){
        val number2 = editText.text.toString().toFloat()
        val  result = number1 + number2
        editText.setText(result.toString())
        isPlus = false
    }
    private fun minus(){
        val number2 = editText.text.toString().toFloat()
        val  result = number1 - number2
        editText.setText(result.toString())
        isMinus = false
    }
    private fun div(){
        val number2 = editText.text.toString().toFloat()
        val  result = number1 / number2
        editText.setText(result.toString())
        isDiv = false
    }
    private fun mul(){
        val number2 = editText.text.toString().toFloat()
        val  result = number1 * number2
        editText.setText(result.toString())
        isMul = false
    }

}