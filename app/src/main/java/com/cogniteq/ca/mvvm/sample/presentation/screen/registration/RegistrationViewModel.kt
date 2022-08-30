package com.cogniteq.ca.mvvm.sample.presentation.screen.registration

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository

class RegistrationViewModel(application: Application, private val authRepository: AuthRepository) : AndroidViewModel(application) {

    private val _navigateUp: MutableLiveData<Any> = MutableLiveData()
    private val _showMessage: MutableLiveData<Int> = MutableLiveData()

    val navigateUp: LiveData<Any> = _navigateUp
    val showMessage: LiveData<Int> = _showMessage

    fun saveAuthData(login: String, password: String) {
        if (authRepository.saveUserCredentials(login, password)) {
            _navigateUp.value = Any()
        } else {
            _showMessage.value = R.string.registration_failed
        }
    }
}