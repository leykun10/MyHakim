package com.example.myhakim.ui.home_fragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myhakim.data.db.UserDatabase
import com.example.myhakim.data.db.UserInfoDao
import com.example.myhakim.data.db.entity.UserInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application){

}