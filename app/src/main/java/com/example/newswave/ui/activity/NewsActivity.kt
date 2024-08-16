package com.example.newswave.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newswave.R
import com.example.newswave.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ensure the NavController is accessed correctly
        val navController = supportFragmentManager.findFragmentById(R.id.newsnavHostFragment)
            ?.findNavController()

        // Setup BottomNavigationView with NavController
        navController?.let {
            binding.bottomNavigationView.setupWithNavController(it)
        }
    }
}
