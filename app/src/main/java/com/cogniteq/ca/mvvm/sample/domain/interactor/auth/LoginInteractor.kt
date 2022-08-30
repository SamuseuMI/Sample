package com.cogniteq.ca.mvvm.sample.domain.interactor.auth

import com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository
import com.cogniteq.ca.mvvm.sample.domain.BaseInteractor
import com.cogniteq.ca.mvvm.sample.domain.InteractorResult
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginInteractor(private val authRepository: AuthRepository) : BaseInteractor<LoginInteractor.Params, Boolean>() {

    override fun invoke(coroutineScope: CoroutineScope, param: Params, result: (InteractorResult<Boolean>) -> Unit) {
        coroutineScope.launch {
            result.invoke(withContext<InteractorResult<Boolean>>(coroutineContext) {
                try {
                    val isLogIn = authRepository.login(param.login, param.password)
                    if (isLogIn) {
                        authRepository.saveAuthToken()
                    }

                    InteractorResult.Result(isLogIn)
                } catch (exception: Exception) {
                    InteractorResult.Failure(exception)
                }
            })
        }
    }

    data class Params(val login: String, val password: String)
}