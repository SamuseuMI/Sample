package com.cogniteq.ca.mvvm.sample.domain

sealed class InteractorResult<out T>() {

    class Result<T>(val data: T) : InteractorResult<T>()
    class Failure<T>(val exception: Exception) : InteractorResult<T>()

    fun getResult(getResult: (T) -> Unit, getException: (Exception) -> Unit) {
        when (this) {
            is Result -> getResult.invoke(data)
            is Failure -> getException.invoke(this.exception)
        }
    }
}