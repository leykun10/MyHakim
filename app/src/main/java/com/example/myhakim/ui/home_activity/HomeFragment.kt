package com.example.myhakim.ui.home_activity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myhakim.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
        hospitalCard.setOnClickListener(){
findNavController().navigate(R.id.action_homeFragment2_to_hospitalsFragment)
        }
        profileCard.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment2_to_profileActivity)
        }
        moreCard.setOnClickListener(){
findNavController().navigate(R.id.action_homeFragment2_to_newDailyTIpsFragment)
        }
        calanderCardView.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment2_to_calanderFragment)
        }
        supportCardView.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment2_to_emergencyContactFragment)
        }
        helpCardView.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment2_to_helpFragment)
        }
    }

}