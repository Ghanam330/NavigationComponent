package com.example.navigationcomponent.navgation_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var navController: NavController = findNavController(R.id.fragment)
    lateinit var drawerLatout: DrawerLayout
    lateinit var appBarConfig: AppBarConfiguration

    lateinit var listerNavController: NavController.OnDestinationChangedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLatout = findViewById(R.id.navigtionView)
        navigtionView.setupWithNavController(navController)
        appBarConfig = AppBarConfiguration(navController.graph, drawerLatout)
        setupActionBarWithNavController(navController, appBarConfig)

        listerNavController =NavController.OnDestinationChangedListener{
            controller, destination, arguments ->
            if (destination.id == R.id.firstFragment){

            }else if (destination.id == R.id.secoundFragment){

            }
        }
    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listerNavController)
    }

    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(listerNavController)
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment)

        return navController.navigateUp(appBarConfig)
                || super.onSupportNavigateUp()
    }
}