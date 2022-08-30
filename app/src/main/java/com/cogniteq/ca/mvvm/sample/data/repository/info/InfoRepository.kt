package com.cogniteq.ca.mvvm.sample.data.repository.info

import com.cogniteq.ca.mvvm.sample.data.repository.Repository
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity
import kotlinx.coroutines.flow.Flow

interface InfoRepository : Repository<InfoEntity> {

    fun getAll(): Flow<List<InfoEntity>>
}