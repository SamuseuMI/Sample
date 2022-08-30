package com.cogniteq.ca.mvvm.sample.data.repository.auth

interface AuthRepository {

    fun saveUserCredentials(login: String, password: String): Boolean

    fun login(login: String, password: String): Boolean

    fun isAuthorized(): Boolean

    fun saveAuthToken()
}