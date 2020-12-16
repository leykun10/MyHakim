package com.example.myhakim.ui.Dialogs
import android.app.Activity
import android.app.AlertDialog
import android.view.LayoutInflater
import com.example.myhakim.R

class LoadingDialog(myActivity: Activity?) {
     var activity:Activity? = myActivity
    lateinit var alertDialog: AlertDialog


    fun startDialogAnimation(){
        var  builder:AlertDialog.Builder = AlertDialog.Builder(activity)
        var layoutInflater:LayoutInflater? =activity?.layoutInflater
        builder.setView(layoutInflater?.inflate(R.layout.custom_dialog_layout,null))
        builder.setCancelable(false)
        alertDialog=builder.create()
        alertDialog.show()
    }
    fun dismissDialog(){
        alertDialog.dismiss()
    }
}