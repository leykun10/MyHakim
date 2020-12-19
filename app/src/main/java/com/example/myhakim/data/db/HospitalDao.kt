package com.example.myhakim.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myhakim.data.db.entity.Hospital
import com.example.myhakim.data.db.entity.TreatmentHistory


@Dao
interface HospitalDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(hospital: Hospital)

    @Query(value = "select * from hospital")
    fun getTreatmentHistory(): LiveData<List<Hospital>>
}