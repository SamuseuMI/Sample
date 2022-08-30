package com.cogniteq.ca.mvvm.sample.data.repository.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepositoryImpl;", "Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;", "authDataStore", "Lcom/cogniteq/ca/mvvm/sample/data/realm/datastore/AuthDataStore;", "authPrefsDataSource", "Lcom/cogniteq/ca/mvvm/sample/data/realm/prefs/AuthPrefsDataSource;", "(Lcom/cogniteq/ca/mvvm/sample/data/realm/datastore/AuthDataStore;Lcom/cogniteq/ca/mvvm/sample/data/realm/prefs/AuthPrefsDataSource;)V", "isAuthorized", "", "login", "", "password", "saveAuthToken", "", "saveUserCredentials", "app_debug"})
public final class AuthRepositoryImpl implements com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository {
    private final com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStore authDataStore = null;
    private final com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSource authPrefsDataSource = null;
    
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStore authDataStore, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSource authPrefsDataSource) {
        super();
    }
    
    @java.lang.Override()
    public boolean saveUserCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @java.lang.Override()
    public boolean login(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAuthorized() {
        return false;
    }
    
    @java.lang.Override()
    public void saveAuthToken() {
    }
}