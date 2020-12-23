package com.example.myhakim.ui.treatmentHistory

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhakim.R

class TreatmentFragment : Fragment() {

    companion object {
        fun newInstance() = TreatmentFragment()
    }

    private lateinit var viewModel: TreatmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.treatment_fragment2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TreatmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}