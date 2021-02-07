package com.example.assignment61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView1:TextView = findViewById(R.id.textView1)
        var textView2:TextView = findViewById(R.id.textView7)
        var num1:EditText=findViewById(R.id.Num3)
        var num2:EditText=findViewById(R.id.Num4)

        var btnplus:Button =findViewById(R.id.plus)
        var btnmult:Button =findViewById(R.id.multply)
        var btnminus:Button=findViewById(R.id.minus)
        var btnvidider:Button=findViewById(R.id.divider)
        var btnmodulo:Button=findViewById(R.id.modulo)
        var btnclear:Button=findViewById(R.id.clear)
        //บวก
        btnplus.setOnClickListener() {
            var num1 = Num3.text.toString()
            var num2 = Num4.text.toString()
            var total = 0.00
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Number1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() + num2.toString().toDouble()
                textView1.setText("+")
                textView2.setText(total.toString())

            }
        }

        //ลบ
        btnminus.setOnClickListener(){
            var num1 = Num3.text.toString()
            var num2 = Num4.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Number1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() - num2.toString().toDouble()
                textView1.setText("-")
                textView2.setText(total.toString())

            }
        }

        //คูณ
        btnmult.setOnClickListener(){
            var num1 = Num3.text.toString()
            var num2 = Num4.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Number1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() * num2.toString().toDouble()
                textView1.setText("*")
                textView2.setText(total.toString())

            }
        }

        //หาร
        btnvidider.setOnClickListener(){
            var num1 = Num3.text.toString()
            var num2 = Num4.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "ใส่ทั้งNum1 และ Num2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() / num2.toString().toDouble()
                textView1.setText("/")
                textView2.setText(total.toString())

            }
        }

        //มอด
        btnmodulo.setOnClickListener(){
            var num1 = Num3.text.toString()
            var num2 = Num4.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Number1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(num2=="0") {
                val toast1 =
                    Toast.makeText(applicationContext, "ห้ามกรอกค่า Num2 = 0", Toast.LENGTH_LONG)
                toast1.show()
            }
            else{
                total = num1.toString().toDouble() % num2.toString().toDouble()
                textView1.setText("%")
                textView2.setText(total.toString())

            }
        }

        btnclear.setOnClickListener(){
            num1.setText("")
            num2.setText("")
            textView1.setText("")
            textView2.setText("")
        }
    }
}