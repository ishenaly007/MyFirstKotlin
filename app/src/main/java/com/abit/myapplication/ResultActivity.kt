package com.abit.myapplication

import android.app.Activity
import android.app.Instrumentation.ActivityResult
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.abit.myapplication.databinding.ActivityResultBinding

class ResultActivity: Activity(){
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}