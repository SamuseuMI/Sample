package com.cogniteq.ca.mvvm.sample.di.modules

import com.cogniteq.ca.mvvm.sample.data.sql.AppDatabase
import org.koin.dsl.module

var databaseModule = module {
    single { get<AppDatabase>().infoDao() }
}