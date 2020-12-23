package com.example.myhakim.ui.how_it_works_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhakim.R

class HowItWorksFragment : Fragment() {

    companion object {
        fun newInstance() = HowItWorksFragment()
    }

    private lateinit var viewModel: HowItWorksFragmentModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_how_it_works, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HowItWorksFragmentModel::class.java)
        // TODO: Use the ViewModel
    }

}