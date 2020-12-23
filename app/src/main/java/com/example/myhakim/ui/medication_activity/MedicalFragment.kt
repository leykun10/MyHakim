package com.example.myhakim.ui.medication_activity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myhakim.R
import com.example.myhakim.data.dummyData.Dummy
import kotlinx.android.synthetic.main.fragment_medication_detail.*


class MedicalFragment : Fragment() {

    companion object {
        fun newInstance() = MedicalFragment()
    }

    private lateinit var viewModel: MedicalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_medication_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MedicalViewModel::class.java)
        val args: MedicalFragmentArgs by navArgs()
        nmemedView.text=args.name
        medInfo.text = "${Dummy.treatments[0].prescription[0].instruction}, dosage:${Dummy.treatments[0].prescription[0].dosage}"
        // TODO: Use the ViewModel
    }

}