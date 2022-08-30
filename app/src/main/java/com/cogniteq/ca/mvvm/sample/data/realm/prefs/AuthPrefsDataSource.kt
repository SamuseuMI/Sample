package com.cogniteq.ca.mvvm.sample.data.realm.prefs

interface AuthPrefsDataSource {

    fun saveAuthToken(authToken: String)

    fun getAuthToken(): String
}