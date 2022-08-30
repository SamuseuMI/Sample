package com.cogniteq.ca.mvvm.sample.domain

import kotlinx.coroutines.flow.Flow

abstract class BaseFlowInteractor<T> {

    abstract suspend fun execute(): Flow<T>
}