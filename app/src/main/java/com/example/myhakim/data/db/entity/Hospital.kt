package com.example.myhakim.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class Hospital(@PrimaryKey val hospitalId:Int,var Address:String,var name:String,var level:String)
