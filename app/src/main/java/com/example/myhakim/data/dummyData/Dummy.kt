package com.example.myhakim.data.dummyData

import com.example.myhakim.data.db.entity.Hospital
import com.example.myhakim.data.db.entity.TreatmentHistory
import com.example.myhakim.data.db.models.Examination
import com.example.myhakim.data.db.models.Medication
import java.util.*

object Dummy {

    var treatments:List<TreatmentHistory> = arrayListOf(TreatmentHistory(1,
        Examination(10,
            110,80),
        arrayListOf( "Determined",
                "Determined",
              "Determined",
                "Determined",
                "Determined"),
                 arrayListOf(
                      Medication("MIGRAINE","200",
              2,

                instruction= "Take two tablets of the medication every eight hours",
                          2
            ),
            Medication(name = "ECONAZOLE", dosage= "10-20 mg", 2,
                instruction= "Two times a day",2
            ),
            Medication("BUSCOPAN",  "10mg",
                2,

               "Take it when you need to relieve painful abdominal cramps, rather than on a regular basis",
            2),
            Medication(name = "THERAFLU", dosage= "20mg",
                2,

                "Do not take more than 5 doses or 150 mL in 24 hours unless directed by a doctor"
            ,2),
            Medication(name = "LIVER MEX", dosage= "3 mL",
                1,
                instruction= "Take this medication by mouth as directed by your doctor, usually once daily",
            3),
        ),
    "tikur andbesa"),
        TreatmentHistory(1,

            Examination(10,
                110,80),
            arrayListOf( "Determined",
                "Determined",
                "Determined",
                "Determined",
                "Determined"),
            arrayListOf(
                Medication("MIGRAINE","200",
                    2,

                    instruction= "Take two tablets of the medication every eight hours",
                    2
                ),
                Medication(name = "ECONAZOLE", dosage= "10-20 mg", 2,
                    instruction= "Two times a day",2
                ),
                Medication("BUSCOPAN",  "10mg",
                    2,

                    "Take it when you need to relieve painful abdominal cramps, rather than on a regular basis",
                    2),
                Medication(name = "THERAFLU", dosage= "20mg",
                    2,

                    "Do not take more than 5 doses or 150 mL in 24 hours unless directed by a doctor"
                    ,2),
                Medication(name = "LIVER MEX", dosage= "3 mL",
                    1,
                    instruction= "Take this medication by mouth as directed by your doctor, usually once daily",
                    3),
            ),
            "tikur andbesa"),
        TreatmentHistory(1,

            Examination(10,
                110,80),
            arrayListOf( "Determined",
                "Determined",
                "Determined",
                "Determined",
                "Determined"),
            arrayListOf(
                Medication("MIGRAINE","200",
                    2,

                    instruction= "Take two tablets of the medication every eight hours",
                    2
                ),
                Medication(name = "ECONAZOLE", dosage= "10-20 mg", 2,
                    instruction= "Two times a day",2
                ),
                Medication("BUSCOPAN",  "10mg",
                    2,

                    "Take it when you need to relieve painful abdominal cramps, rather than on a regular basis",
                    2),
                Medication(name = "THERAFLU", dosage= "20mg",
                    2,

                    "Do not take more than 5 doses or 150 mL in 24 hours unless directed by a doctor"
                    ,2),
                Medication(name = "LIVER MEX", dosage= "3 mL",
                    1,
                    instruction= "Take this medication by mouth as directed by your doctor, usually once daily",
                    3),
            ),
            "tikur andbesa"),
        TreatmentHistory(1,
            Examination(10,
                110,80),
            arrayListOf( "Determined",
                "Determined",
                "Determined",
                "Determined",
                "Determined"),
            arrayListOf(
                Medication("MIGRAINE","200",
                    2,

                    instruction= "Take two tablets of the medication every eight hours",
                    2
                ),
                Medication(name = "ECONAZOLE", dosage= "10-20 mg", 2,
                    instruction= "Two times a day",2
                ),
                Medication("BUSCOPAN",  "10mg",
                    2,

                    "Take it when you need to relieve painful abdominal cramps, rather than on a regular basis",
                    2),
                Medication(name = "THERAFLU", dosage= "20mg",
                    2,

                    "Do not take more than 5 doses or 150 mL in 24 hours unless directed by a doctor"
                    ,2),
                Medication(name = "LIVER MEX", dosage= "3 mL",
                    1,
                    instruction= "Take this medication by mouth as directed by your doctor, usually once daily",
                    3),
            ),
            "tikur andbesa"))



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