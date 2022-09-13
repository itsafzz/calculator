package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun calculator(v:View){
            val n1 = findViewById<EditText>(R.id.editTextTextPersonName) as EditText
            val n2 = findViewById<EditText>(R.id.editTextTextPersonName2) as EditText
            val res = findViewById<TextView>(R.id.textView2) as TextView

            val number1:Float
            val number2:Float
            val result:Float

            if (TextUtils.isEmpty(n1.text.toString())){
                n1.error = "Enter some number"
                return

            }else{
                number1 = n1.text.toString().toFloat()
            }

            if (TextUtils.isEmpty(n2.text.toString())){
                n2.error = "Enter some number for n222"
                return

            }else{
                number2 = n1.text.toString().toFloat()
            }



            when(v.id){
                R.id.add -> {
                    result = number1 + number2
                    res.text = result.toString()

                }
                R.id.sub -> {
                    result = number1 - number2

                    res.text = result.toString()

                }
                R.id.mult -> {
                    result = number1 * number2

                    res.text = result.toString()

                }R.id.div -> {
                result = number1 / number2

                res.text = result.toString()

            }
            }




        }
    }
     }


