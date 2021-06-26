package com.example.calculatorappinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText
    var number1 : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean = false
    var isDivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.number_edit_text)
    }

    fun operationFunction(view : View){
        when(view.id){
            R.id.btn_one -> {
                numberClicked(1)
//              val number1 = editText.text.toString() + "1"
//                editText.setText(number1.toString())
            }
            R.id.btn_two -> {
                numberClicked(2)
            }
            R.id.btn_three -> {
                numberClicked(3)
            }
            R.id.btn_four -> {
                numberClicked(4)
            }
            R.id.btn_five -> {
                numberClicked(5)
            }
            R.id.btn_six -> {
                numberClicked(6)
            }
            R.id.btn_seven -> {
                numberClicked(7)
            }
            R.id.btn_eight -> {
                numberClicked(8)
            }
            R.id.btn_nine -> {
                numberClicked(9)
            }
            R.id.btn_zero -> {
                numberClicked(0)
            }
            R.id.btn_plus -> {
               // plusClicked()
               number1 = editText.text.toString().toFloat()
                editText.setText("")
                isPlus = true
            }
            R.id.btn_minus -> {
                number1 = editText.text.toString().toFloat();
                editText.setText("")
                isMinus = true
            }
            R.id.btn_divide -> {
                number1 = editText.text.toString().toFloat();
                editText.setText("")
                isDivide = true
            }
            R.id.btn_equal -> {
                if (isPlus) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 + number2
                    editText.setText(result.toString())
                    isPlus = false
                }else if (isMinus){
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 - number2
                    editText.setText(result.toString())
                    isMinus = false
                }else if(isDivide){
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 / number2
                    editText.setText(result.toString())
                    isDivide = false
                }

            }
            R.id.btn_dot -> {
                val number = editText.text.toString() + "."
                editText.setText(number)
            }
            R.id.btn_clear -> {
                editText.setText("")
            }

        }
    }
    private fun numberClicked(numberClick : Int){
        val number = editText.text.toString() + numberClick.toString()
        editText.setText(number)
    }
    private fun plusClicked(){

    }
}