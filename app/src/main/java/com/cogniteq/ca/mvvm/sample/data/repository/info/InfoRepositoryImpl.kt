package com.cogniteq.ca.mvvm.sample.data.repository.info

import com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDataStore
import com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDataStore
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity

class InfoRepositoryImpl(private val infoDataStore: InfoDataStore) : InfoRepository {

    override fun getAll() = infoDataStore.getAll()

    override fun getDataStore(): BaseDataStore<InfoEntity> = infoDataStore
}