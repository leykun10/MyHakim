package com.example.myhakim.ui.health_activity
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myhakim.ui.treatmentHistory.TreatmentHistoryFragment

class PageAdapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                VitalsFragment()
            }
            1 -> {
                TreatmentHistoryFragment()
            }
            else -> {
                VitalsFragment()
            }

        }
    }


    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {return "Vitals"}
            1 -> {return "History"}
        }
        return super.getPageTitle(position)
    }

}