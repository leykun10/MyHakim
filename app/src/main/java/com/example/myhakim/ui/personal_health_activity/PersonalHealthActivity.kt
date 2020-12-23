package com.example.myhakim.ui.personal_health_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.myhakim.R
import com.google.android.material.tabs.TabLayout

class PersonalHealthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_health)
        val viewPager= findViewById<ViewPager>(R.id.viewPager)
        val tabLayout= findViewById<TabLayout>(R.id.tabLayout)
        viewPager.adapter = PageAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_health_report)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_medical_history__1_)

    }
}