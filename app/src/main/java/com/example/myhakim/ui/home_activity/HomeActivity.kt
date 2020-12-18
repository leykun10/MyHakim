package com.example.myhakim.ui.home_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.example.myhakim.R
import kotlinx.android.synthetic.main.home_activity.*

class HomeActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return  true
        }
            return super.onOptionsItemSelected(item)
    }
}