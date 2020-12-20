package com.example.myhakim.ui.home_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.example.myhakim.MainActivity
import com.example.myhakim.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.home_activity.*
import kotlinx.android.synthetic.main.nav_header.*

class HomeActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    val auth= FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


nav_view.setNavigationItemSelectedListener {

    when(it.itemId){
        R.id.home_item-> {
            var intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        R.id.notification->{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        R.id.sign_out_item->
    {
            auth.signOut()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}
    }
    true
}

    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
         return true
            }
            return super.onOptionsItemSelected(item)
    }
}