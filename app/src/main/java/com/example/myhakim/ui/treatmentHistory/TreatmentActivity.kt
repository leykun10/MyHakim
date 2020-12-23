package com.example.myhakim.ui.treatmentHistory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myhakim.R
import com.example.myhakim.data.dummyData.Dummy
import kotlinx.android.synthetic.main.activity_treatment.*

class TreatmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment)

        treatmentView.text="@${Dummy.treatments[0].hospital} " +
                "    \n  ${Dummy.treatments[0].diagnosis[0]},${Dummy.treatments[0].diagnosis[0]}," +
                "${Dummy.treatments[0].diagnosis[2]}" +
                " ${Dummy.treatments[0].examination.blood_glucose_level}, ${
                    Dummy.treatments[0].examination.blood_pressure
                } , ${Dummy.treatments[0].examination.heart_beat}"
    }
}