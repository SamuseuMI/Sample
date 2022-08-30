package com.cogniteq.ca.mvvm.sample.data.repository.auth

import com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStore
import com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSource
import com.cogniteq.ca.mvvm.sample.util.StringGenerator

class AuthRepositoryImpl(private val authDataStore: AuthDataStore, private val authPrefsDataSource: AuthPrefsDataSource) : AuthRepository {

    override fun saveUserCredentials(login: String, password: String): Boolean = authDataStore.saveUserCredentials(login, password)

    override fun login(login: String, password: String): Boolean = authDataStore.searchUserByCredentials(login, password)

    override fun isAuthorized(): Boolean = authPrefsDataSource.getAuthToken().isNotEmpty()

    override fun saveAuthToken() = authPrefsDataSource.saveAuthToken(StringGenerator.generateRandomString())
}