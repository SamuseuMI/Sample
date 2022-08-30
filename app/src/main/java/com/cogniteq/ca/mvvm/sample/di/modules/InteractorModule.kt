package com.cogniteq.ca.mvvm.sample.di.modules

import com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor
import com.cogniteq.ca.mvvm.sample.domain.interactor.info.GetLastUpdateInteractor
import com.cogniteq.ca.mvvm.sample.domain.interactor.info.SaveDataInteractor
import org.koin.dsl.module

val interactorModule = module {
    single { LoginInteractor(get()) }
    single { GetLastUpdateInteractor(get()) }
    single { SaveDataInteractor(get()) }
}