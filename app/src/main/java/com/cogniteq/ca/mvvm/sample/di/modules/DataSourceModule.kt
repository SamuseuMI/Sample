package com.cogniteq.ca.mvvm.sample.di.modules

import com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStore
import com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStoreImpl
import com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSource
import com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSourceImpl
import com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDataStore
import org.koin.dsl.module

val dataSourceModule = module {
    single<AuthDataStore> { AuthDataStoreImpl(get()) }
    single<AuthPrefsDataSource> { AuthPrefsDataSourceImpl(get()) }
    single { InfoDataStore(get())}
}