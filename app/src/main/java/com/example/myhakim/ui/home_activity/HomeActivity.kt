package com.example.myhakim.ui.home_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.myhakim.MainActivity
import com.example.myhakim.R
import com.example.myhakim.ui.contact_us_activity.ContactUsActivity
import com.example.myhakim.ui.notification_activity.NotificationActivity
import com.example.myhakim.ui.setting_activity.SettingsActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    val auth= FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


nav_view.setNavigationItemSelectedListener {

    when(it.itemId){
        R.id.setting_item-> {
            var intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        R.id.home_item-> {
            var intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        R.id.notification->{
            var intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        R.id.sign_out_item->
    {
            auth.signOut()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}

    R.id.contact->
    {
        var intent = Intent(this, ContactUsActivity::class.java)
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