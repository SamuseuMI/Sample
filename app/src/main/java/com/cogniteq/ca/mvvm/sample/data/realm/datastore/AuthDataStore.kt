package com.cogniteq.ca.mvvm.sample.data.realm.datastore

interface AuthDataStore {

    fun saveUserCredentials(login: String, password: String): Boolean

    fun searchUserByCredentials(login: String, password: String): Boolean
}