package com.example.myhakim.ui.auth_fragments.login_fragment

import android.app.Activity
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.example.myhakim.R
import com.example.myhakim.ui.Dialogs.LoadingDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }
    private lateinit var auth:FirebaseAuth
    private lateinit var viewModel: LoginViewModel
    private lateinit var customDialog: LoadingDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        customDialog = LoadingDialog(activity?.parent)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
        customDialog = LoadingDialog(context as
         Activity)


     loginButton.setOnClickListener(){


         loginTextEmailAddress.text.toString().let { it1 ->
             loginTextPassword.text.toString().let { it2 ->
                 if(it1=="" ){
                     loginTextEmailAddress.error= "This field can not be blank"
                     loginTextEmailAddress.doAfterTextChanged {
                         loginTextEmailAddress.error=null
                     }
                 }
                 if(it2==""){
                     loginTextPassword.error= "This field can not be blank"
                     loginTextPassword.doAfterTextChanged {
                         loginTextPassword.error=null
                 }}
                 else if(it2!="" && it1 !=""){
                     customDialog.startDialogAnimation()
                     auth.signInWithEmailAndPassword(it1, it2)
                             .addOnCompleteListener() { task ->
                                 customDialog.dismissDialog()
                                 if (task.isSuccessful) {
                                     // Sign in success, update UI with the signed-in user's information
                                     Log.d("TAG", "createUserWithEmail:success")
                                     val user = auth.currentUser
                                     findNavController().navigate(R.id.action_loginFragment_to_loadingFragment)
                                 } else {
                                     // If sign in fails, display a message to the user.
                                     Toast.makeText(context, "server error" ,Toast.LENGTH_SHORT).show()

                                 }

                                 // ...
                             }
                 }

             }
         }
     }
      createAccountTextView.setOnClickListener(){
          findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
      }

    }

}