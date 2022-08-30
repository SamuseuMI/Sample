package com.cogniteq.ca.mvvm.sample.data.realm.prefs

import android.annotation.SuppressLint
import android.content.SharedPreferences
import timber.log.Timber

class AuthPrefsDataSourceImpl(private val preferences: SharedPreferences) : AuthPrefsDataSource {

    @SuppressLint("ApplySharedPref")
    override fun saveAuthToken(authToken: String) {
        try {
            val editor = preferences.edit()
            editor.putString(SIGN_IN_ACCESS_TOKEN, authToken)
            editor.commit()
        } catch (exception: Exception) {
            Timber.e(exception)
        }
    }

    override fun getAuthToken(): String = preferences.getString(SIGN_IN_ACCESS_TOKEN, DEF_VALUE)
            ?: DEF_VALUE

    companion object {
        private const val TAG = "AuthPrefsDataSourceImpl"
        private const val SIGN_IN_ACCESS_TOKEN = "token"
        private const val DEF_VALUE = ""
    }
}