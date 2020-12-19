package com.example.myhakim.data.dummyData

import com.example.myhakim.data.db.entity.Hospital

object Dummy {
    val hospitals:List<Hospital> = arrayListOf(Hospital(hospitalId = 0,
        Address = "Tikur Anbessa",
        name = "Tikur Anbesa Hospital",level = "Higher"),
        Hospital(hospitalId = 0,
            Address = "Tikur Anbessa",
            name = "Tikur Anbesa Hospital",level = "Higher"),
        Hospital(hospitalId = 1,
            Address = "Akaki Kalit",
            name = "Tirunesh Bejing Hospital",level = "Higher"),
        Hospital(hospitalId = 2,
            Address = "Jemo Mickael",
            name = "Dr Sisay Clinic",level = "Medium"),
        Hospital(hospitalId = 3,
            Address = "Mexico",
            name = "LandMark Hospital",level = "Higher"),
        Hospital(hospitalId = 4,
            Address = "Bole Michael",
            name = "Haleluya Heart Speciality",level = "Higher"),
        Hospital(hospitalId = 0,
            Address = "Bisrate Gabriel",
            name = "Sam Vision",level = "Higher"))
}