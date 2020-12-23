package com.example.myhakim.ui.hospital_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myhakim.R
import kotlinx.android.synthetic.main.hospital_fragment.*

class HospitalFragment : Fragment() {

    companion object {
        fun newInstance() = HospitalFragment()
    }

    private lateinit var viewModel: HospitalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.hospital_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        val args: HospitalFragmentArgs by navArgs()
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HospitalViewModel::class.java)
        detailHospitalFr.text= "${args.hospital}"

    }

}