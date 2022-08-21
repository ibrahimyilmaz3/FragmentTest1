package com.example.fragmentstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentstest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val edittextFragment = EdittextFragment()
        val viewFragment = ViewFragment()

        binding.btnEdittext.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, edittextFragment)
                addToBackStack(null)
                commit()
            }
        }

        binding.btnViewText.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, viewFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}