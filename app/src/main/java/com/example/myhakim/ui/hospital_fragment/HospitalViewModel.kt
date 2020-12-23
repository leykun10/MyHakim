package com.example.myhakim.ui.hospital_fragment

import androidx.lifecycle.ViewModel
import com.example.myhakim.data.db.entity.Hospital
import com.example.myhakim.data.dummyData.Dummy

class HospitalViewModel : ViewModel() {
    val hospitals:List<Hospital> = Dummy.hospitals
}