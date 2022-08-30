package com.cogniteq.ca.mvvm.sample.data.sql

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDao
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity

@Database(entities = [InfoEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun infoDao(): InfoDao
}