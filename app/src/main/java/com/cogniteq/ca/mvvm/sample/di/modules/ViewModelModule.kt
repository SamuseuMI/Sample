package com.cogniteq.ca.mvvm.sample.di.modules

import com.cogniteq.ca.mvvm.sample.presentation.screen.auth.StartViewModel
import com.cogniteq.ca.mvvm.sample.presentation.screen.info.InfoViewModel
import com.cogniteq.ca.mvvm.sample.presentation.screen.login.LoginViewModel
import com.cogniteq.ca.mvvm.sample.presentation.screen.registration.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { StartViewModel(get(), get()) }
    viewModel { LoginViewModel(get(), get()) }
    viewModel { InfoViewModel(get(), get(), get()) }
    viewModel { RegistrationViewModel(get(), get()) }
}