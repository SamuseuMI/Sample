package com.cogniteq.ca.mvvm.sample.data.realm.datastore

import com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel
import com.cogniteq.ca.mvvm.sample.domain.getId
import io.realm.Realm
import io.realm.kotlin.createObject
import timber.log.Timber
import java.util.*

class AuthDataStoreImpl(private val realm: Realm): AuthDataStore {

    override fun saveUserCredentials(login: String, password: String): Boolean {
        return try {
            realm.beginTransaction()
            val authModel = realm.createObject<AuthModel>(UUID.randomUUID().getId()).apply {
                this.login = login
                this.password = password
            }
            realm.insertOrUpdate(authModel)
            realm.commitTransaction()
            true
        } catch (exception: Exception) {
            Timber.e(exception)
            false
        }
    }

    override fun searchUserByCredentials(login: String, password: String): Boolean {
        return try {
            realm.beginTransaction()
            val authModel = realm.where(AuthModel::class.java)
                    .equalTo("login", login)
                    .equalTo("password", password)
                    .findFirst()
            realm.commitTransaction()

            return authModel != null
        } catch (exception: Exception) {
            Timber.e(exception)
            false
        }
    }

    companion object {
        private const val TAG = "AuthDataStoreImpl"
    }
}