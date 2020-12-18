package com.example.myhakim.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_info")
data class UserInfo(
    @PrimaryKey val userId:Long, val Name:String, val address:String,
    var age:Int, var bloodGroup:String, val sex:String)
