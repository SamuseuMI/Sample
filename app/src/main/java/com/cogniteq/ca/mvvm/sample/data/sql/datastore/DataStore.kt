package com.cogniteq.ca.mvvm.sample.data.sql.datastore

interface DataStore<T> {

    suspend fun save(model: T)

    suspend fun update(model: T)

    companion object {
        const val TAG = "DataStore"
    }
}