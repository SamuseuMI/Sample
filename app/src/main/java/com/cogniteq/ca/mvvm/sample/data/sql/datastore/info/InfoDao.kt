package com.cogniteq.ca.mvvm.sample.data.sql.datastore.info

import androidx.room.Dao
import androidx.room.Query
import com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDao
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface InfoDao : BaseDao<InfoEntity> {

    @Query("SELECT * FROM information")
    fun getAll(): Flow<List<InfoEntity>>
}