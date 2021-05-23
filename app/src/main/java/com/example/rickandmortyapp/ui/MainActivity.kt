package com.example.rickandmortyapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rickandmortyapp.R

class MainActivity : AppCompatActivity() {
    var navController: NavController? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_RickAndMortyAPP)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navController!!)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController!!.navigateup() || super.onSupportNavigateUp()
    }
}