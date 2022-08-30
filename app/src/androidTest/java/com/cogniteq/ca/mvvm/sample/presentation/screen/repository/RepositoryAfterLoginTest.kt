package com.cogniteq.ca.mvvm.sample.presentation.screen.repository

import com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository
import com.cogniteq.ca.mvvm.sample.presentation.screen.MockConstants
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.java.KoinJavaComponent.getKoin

class RepositoryAfterLoginTest {

    private lateinit var authRepository: AuthRepository

    @Before
    fun setup() {
        authRepository = getKoin().get()
    }

    @Test
    fun authRepository_saveUserCredentials() {
        val isSave = authRepository.saveUserCredentials(MockConstants.EMAIL, MockConstants.PASSWORD)
        Assert.assertTrue(isSave)
    }

    @Test
    fun authRepository_login() {
        val isLogin = authRepository.login(MockConstants.EMAIL, MockConstants.PASSWORD)
        Assert.assertTrue(isLogin)
    }
}