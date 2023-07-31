package com.mobile.miftakhulilmanrifqi.a205410082.widgetview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.miftakhulilmanrifqi.a205410082.widgetview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var angka = 0
        binding.btnTampil.setOnClickListener{
            angka+=1
            binding.textTampil.text = angka.toString()


             }
        }
    }