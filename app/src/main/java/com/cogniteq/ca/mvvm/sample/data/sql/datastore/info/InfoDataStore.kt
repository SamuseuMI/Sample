package com.cogniteq.ca.mvvm.sample.data.sql.datastore.info

import com.cogniteq.ca.mvvm.sample.data.sql.InfoTable
import com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDao
import com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDataStore
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity
import kotlinx.coroutines.flow.Flow

class InfoDataStore(private var infoDao: InfoDao) : BaseDataStore<InfoEntity>() {

    override fun getDao(): BaseDao<InfoEntity> = infoDao

    fun getAll(): Flow<List<InfoEntity>> = infoDao.getAll()

    override fun getTableName(): String = InfoTable.TABLE_NAME
}