package com.example.myhakim.ui.daily_tips_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhakim.R

class NewDailyTIpsFragment : Fragment() {

    companion object {
        fun newInstance() = NewDailyTIpsFragment()
    }

    private lateinit var viewModel: NewDailyTIpsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new_daily_tips, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NewDailyTIpsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}