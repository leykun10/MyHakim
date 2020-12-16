package com.example.myhakim.ui.loadingscreen_fragment

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.myhakim.R
import com.google.firebase.auth.FirebaseAuth


class LoadingFragment : Fragment() {

    private var mAuth: FirebaseAuth? = null

    companion object {
        fun newInstance() = LoadingFragment()
    }

    private lateinit var viewModel: LoadingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAuth = FirebaseAuth.getInstance();
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.loading_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val currentUser = mAuth!!.currentUser
        Handler().postDelayed({
            if (currentUser != null) {
                Log.i("check","came here")


                view.findNavController().navigate(R.id.action_loadingFragment_to_homeFragment)
            }
            else{
                Log.i("check","came here")
                view.findNavController().navigate(R.id.action_loadingFragment_to_loginFragment)
            }
        },200)



    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoadingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}