package com.cogniteq.ca.mvvm.sample.data.repository

import com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDataStore
import com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity

interface Repository<T : BaseEntity> {

    suspend fun save(model: T) = getDataStore().save(model)

    suspend fun update(model: T) = getDataStore().update(model)

    suspend fun getAllData() = getDataStore().getAllData()

    fun getDataStore(): BaseDataStore<T>
}