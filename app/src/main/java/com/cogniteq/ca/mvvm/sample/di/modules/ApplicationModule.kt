package com.cogniteq.ca.mvvm.sample.di.modules

import androidx.preference.PreferenceManager
import androidx.room.Room
import com.cogniteq.ca.mvvm.sample.data.sql.AppDatabase
import io.realm.Realm
import io.realm.RealmConfiguration
import org.koin.dsl.module

private const val ROOM_DATABASE_NAME = "AppDatabase"
private const val REALM_DATABASE_NAME = "realm_ca_mvvm_sample"
private const val DATABASE_VERSION: Long = 1

val applicationModule = module {

    single<RealmConfiguration> {
        RealmConfiguration.Builder()
                .name(REALM_DATABASE_NAME)
                .schemaVersion(DATABASE_VERSION)
                .deleteRealmIfMigrationNeeded()
                .build()
    }

    single<Realm> {
        Realm.init(get())
        Realm.setDefaultConfiguration(get())
        Realm.getDefaultInstance()
    }

    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, ROOM_DATABASE_NAME)
                .build()
    }

    single { PreferenceManager.getDefaultSharedPreferences(get()) }
}