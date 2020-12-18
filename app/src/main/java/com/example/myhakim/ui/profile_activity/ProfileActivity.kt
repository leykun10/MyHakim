package com.example.myhakim.ui.profile_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.myhakim.R
import com.google.android.material.tabs.TabLayout

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val viewPager= findViewById<ViewPager>(R.id.viewPager)
        val tabLayout= findViewById<TabLayout>(R.id.tabLayout)
        viewPager.adapter = PageAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)

    }
}