package com.example.navigationcomponent.bottom_navagtion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationcomponent.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_na)
        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottom_navigationView)
        val  navConter=findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.bottom_frgment1,R.id.bottom_frgment2))
        setupActionBarWithNavController(navConter,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navConter)
    }
}