package com.example.myhakim.data.db

import android.content.Context
import androidx.room.*
import com.example.myhakim.data.db.entity.Hospital
import com.example.myhakim.data.db.entity.TreatmentHistory
import com.example.myhakim.data.db.entity.UserInfo

@Database(entities = [TreatmentHistory::class,Hospital::class,UserInfo::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class UserDatabase: RoomDatabase() {
        abstract fun treatmentHistoryDao(): TreatmentHistoryDao
        abstract fun userInfoDao(): UserInfoDao
        abstract fun hospitalDao():HospitalDao

        companion object {
            // Singleton prevents multiple instances of database opening at the
            // same time.
            @Volatile
            private var INSTANCE: UserDatabase? = null

            fun getDatabase(context: Context): UserDatabase {
                // if the INSTANCE is not null, then return it,
                // if it is, then create the database
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                       UserDatabase::class.java,
                        "user_database"
                    ).build()
                    INSTANCE = instance
                    // return instance
                    return instance
                }
            }
        }

}