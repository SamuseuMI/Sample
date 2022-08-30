package com.cogniteq.ca.mvvm.sample

import android.app.Application
import com.cogniteq.ca.mvvm.sample.di.modules.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@App)
            modules(viewModelModule, applicationModule, dataSourceModule, repositoryModule, interactorModule, databaseModule)
        }
    }
}