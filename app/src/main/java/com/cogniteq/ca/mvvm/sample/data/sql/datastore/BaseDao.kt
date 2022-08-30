package com.cogniteq.ca.mvvm.sample.data.sql.datastore

import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.RawQuery
import androidx.room.Update
import androidx.sqlite.db.SupportSQLiteQuery

interface BaseDao<T> {

    @Insert(onConflict = REPLACE)
    suspend fun save(model: T)

    @Update(onConflict = REPLACE)
    suspend fun update(model: T)

    @RawQuery
    suspend fun getAllData(query: SupportSQLiteQuery): List<T>
}