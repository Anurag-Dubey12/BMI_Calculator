package com.example.bmicalculator

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Height:EditText=findViewById(R.id.edit_height)
        val weight:EditText=findViewById(R.id.edit_weight)
        val calculate:Button=findViewById(R.id.button_calculate)
        val result:TextView=findViewById(R.id.text_result)
        calculate.setOnClickListener {
            if(Height.text.isNotEmpty()&&weight.text.isNotEmpty()){
                var heig=(Height.text.toString()).toDouble()/100
                var  weig=(weight.text.toString()).toDouble()
                var bmi=weig/(heig*heig)
             if(bmi<18){
                result.text= "Your BMI is $bmi and You are Underweight"
//                 result.setBackgroundResource(R.drawable.under)


             }
                if(bmi>18&&bmi<25){
                    result.text= "Your BMI is $bmi and You are Normal"
//                    result.setBackgroundResource(R.drawable.normal)
                }
                if(bmi>25){
                    result.text= "Your BMI is $bmi and You are Overweight"
//                    result.setBackgroundResource(R.drawable.over)
                }


        }else{
                Toast.makeText(this,"Please Fill both the column", Toast.LENGTH_SHORT).show()}

        }
    }
}