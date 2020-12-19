package com.example.myhakim.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myhakim.data.db.entity.TreatmentHistory



@Dao
interface TreatmentHistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(treatmentHistory:TreatmentHistory)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTreatmentHistory(vararg treatmentHistory:TreatmentHistory)

    @Query(value = "select * from medical_history")
    fun getTreatmentHistory():LiveData<List<TreatmentHistory>>
}