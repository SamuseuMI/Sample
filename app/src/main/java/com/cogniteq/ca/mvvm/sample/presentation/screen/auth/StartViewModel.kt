package com.cogniteq.ca.mvvm.sample.presentation.screen.auth

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository
import com.cogniteq.ca.mvvm.sample.util.NavigatorResource

class StartViewModel(application: Application,  private val authRepository: AuthRepository) : AndroidViewModel(application) {

    private val _screenEmitter: MutableLiveData<NavigatorResource> = MutableLiveData()

    val screenEmitter: LiveData<NavigatorResource> = _screenEmitter

    fun openLoginOrInfoScreen() {
        _screenEmitter.value = if (authRepository.isAuthorized()) {
            NavigatorResource.info()
        } else {
            NavigatorResource.login()
        }
    }
}