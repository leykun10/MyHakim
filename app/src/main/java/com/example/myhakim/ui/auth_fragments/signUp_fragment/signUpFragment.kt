package com.example.myhakim.ui.auth_fragments.signUp_fragment

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
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
import kotlinx.android.synthetic.main.fragment_sign_up.*


class signUpFragment : Fragment() {

    companion object {
        fun newInstance() = signUpFragment()
    }
    private  lateinit var auth:FirebaseAuth
    private lateinit var viewModel: SignUpViewModel
    private lateinit var customDialog:LoadingDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)

        customDialog = LoadingDialog(context as
                Activity)
        // TODO: Use the ViewModel
      registerButton.setOnClickListener(){
      customDialog.startDialogAnimation()
          editEmailAddress.text.toString().let { it1 ->
              editPassword.text.toString().let { it2 ->
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
                      auth.createUserWithEmailAndPassword(it1, it2)
                              .addOnCompleteListener() { task ->
                                  if (task.isSuccessful) {
                                      // Sign in success, update UI with the signed-in user's information
                                      val user = auth.currentUser
                                      customDialog.dismissDialog()
                                      findNavController().navigate(R.id.action_signUpFragment_to_loadingFragment)

                                  } else {
                                      customDialog.dismissDialog()
                                      // If sign in fails, display a message to the user.
                                      Toast.makeText(context, task.exception.toString() ,Toast.LENGTH_SHORT).show()
                                      customDialog.dismissDialog()

                                  }

                                  // ...
                              }
                  }



              }
          }


      }
        signInTextView.setOnClickListener(){
            findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
        }
    }

}