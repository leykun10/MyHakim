package com.example.myhakim.ui.medication_fragmnet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhakim.R

class MedicalFragment : Fragment() {

    companion object {
        fun newInstance() = MedicalFragment()
    }

    private lateinit var viewModel: MedicalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.medical_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MedicalViewModel::class.java)
        // TODO: Use the ViewModel
    }

}