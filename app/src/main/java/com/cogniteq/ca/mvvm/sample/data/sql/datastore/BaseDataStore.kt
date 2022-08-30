package com.cogniteq.ca.mvvm.sample.data.sql.datastore

import androidx.sqlite.db.SimpleSQLiteQuery
import com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity
import timber.log.Timber

abstract class BaseDataStore<T> : DataStore<T> where T : BaseEntity {

    override suspend fun save(model: T) {
        try {
            getDao().save(model)
        } catch (exception: Exception) {
            Timber.e(exception)
        }
    }

    override suspend fun update(model: T) {
        try {
            getDao().update(model)
        } catch (exception: Exception) {
            Timber.e(exception)
        }
    }

    suspend fun getAllData(): List<T> {
        val query = "SELECT * FROM ${getTableName()}"
        return try {
            val sqlQuery = SimpleSQLiteQuery(query)
            getDao().getAllData(sqlQuery)
        } catch (exception: Exception) {
            Timber.e(exception)
            emptyList()
        }
    }

    protected abstract fun getDao(): BaseDao<T>

    protected abstract fun getTableName(): String
}