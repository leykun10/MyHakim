package com.example.myhakim.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myhakim.data.db.models.Examination
import com.example.myhakim.data.db.models.Medication
import java.util.*

@Entity(tableName = "medical_history")
data class TreatmentHistory(@PrimaryKey(autoGenerate = true)
                             var treatmentId:Int,
                             @Embedded
                             var examination: Examination,
                             var diagnosis:List<String>,
                             var prescription:List<Medication>,
                             var hospital: String
 )
