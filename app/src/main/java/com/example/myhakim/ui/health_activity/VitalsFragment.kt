package com.example.myhakim.ui.health_activity

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhakim.R
import com.example.myhakim.ui.medication_fragmnet.MedicalActivity
import kotlinx.android.synthetic.main.vitals_fragment.*

class VitalsFragment : Fragment() {

    companion object {
        fun newInstance() = VitalsFragment()
    }

    private lateinit var viewModel: VitalsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vitals_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VitalsViewModel::class.java)
        // TODO: Use the ViewModel

        medicationBtn.setOnClickListener(){
            val intent = Intent(context, MedicalActivity::class.java)
            startActivity(intent)
        }
    }

}