package com.jader.sesion5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jader.sesion5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        startApp()

    }

    private fun startApp(){
        calcSuma()
        calcResta()
    }

    private fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    private fun calcSuma(){
        binding.btnSumar.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            val result = add(num1, num2)
            binding.tvResultado.text = result.toString()
        }
    }

    private fun calcResta(){
        binding.btnRestar.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            val result = num1 - num2
            binding.tvResultado.text = result.toString()
        }
    }

}