package com.cogniteq.ca.mvvm.sample.presentation.screen.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.sample.App
import com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor
import com.cogniteq.ca.mvvm.sample.util.ActionLiveData
import com.cogniteq.ca.mvvm.sample.util.NavigatorResource

class LoginViewModel(application: Application, private val loginInteractor: LoginInteractor) : AndroidViewModel(application) {

    private val _screenEmitter: ActionLiveData<NavigatorResource> = ActionLiveData()
    private val _messageEmitter: MutableLiveData<String> = MutableLiveData()

    val screenEmitter: LiveData<NavigatorResource> = _screenEmitter
    val messageEmitter: LiveData<String> =  _messageEmitter

    fun login(login: String, password: String) {
        loginInteractor.invoke(viewModelScope, LoginInteractor.Params(login, password)) {
            it.getResult(::openInfoScreen, ::showMessage)
        }
    }

    fun onSignUpClick() {
        _screenEmitter.value = NavigatorResource.registration()
    }

    private fun openInfoScreen(isLogin: Boolean) {
        if (isLogin) {
            _screenEmitter.value = NavigatorResource.info()
        } else {
            _messageEmitter.value = getApplication<App>().getString(R.string.invalid_email_or_password)
        }
    }

    private fun showMessage(exception: Exception) {
        _messageEmitter.value = exception.message
    }
}