package com.example.navigationcomponent.Animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.navigationcomponent.R

class AnimationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)
        setupActionBarWithNavController(findNavController(R.id.fragmentContainerView2))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController =findNavController(R.id.fragmentContainerView2)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}