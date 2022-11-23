package com.abit.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.abit.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var toTen = false
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var button: Button = binding.btn1
        var text: TextView = binding.tvNum
        button.setOnClickListener {
            var a: Int = Integer.valueOf(text.text.toString())


            when (toTen) {
                false -> {
                    when (a == 10) {
                        false -> {
                        a += 1
                        text.text = a.toString()

                        }true -> {
                            toTen = true
                        }

                    }
                }true-> when (a == 0) {
                    false -> {
                        button.text = "-1"
                        a -= 1
                        text.text = a.toString()
                    }true->{
                    val intent = Intent(this, ResultActivity::class.java)
                    startActivity(intent)
                }
                }
            }
        }
    }
}
