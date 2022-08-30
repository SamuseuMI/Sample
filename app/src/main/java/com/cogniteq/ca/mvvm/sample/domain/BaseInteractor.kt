package com.cogniteq.ca.mvvm.sample.domain

import kotlinx.coroutines.CoroutineScope

abstract class BaseInteractor<in Param, out Type> where Type : Any {

    abstract fun invoke(coroutineScope: CoroutineScope, param: Param, result: (InteractorResult<Type>) -> Unit)
}