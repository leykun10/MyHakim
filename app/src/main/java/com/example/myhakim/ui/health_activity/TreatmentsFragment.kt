package com.example.myhakim.ui.health_activity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhakim.R

class TreatmentsFragment : Fragment() {

    companion object {
        fun newInstance() = TreatmentsFragment()
    }

    private lateinit var viewModel: TreatmentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.treatment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TreatmentsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}