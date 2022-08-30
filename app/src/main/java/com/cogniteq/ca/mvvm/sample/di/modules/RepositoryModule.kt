package com.cogniteq.ca.mvvm.sample.di.modules

import com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository
import com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepositoryImpl
import com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository
import com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImpl(get(), get()) }
    single<InfoRepository> { InfoRepositoryImpl(get()) }
}