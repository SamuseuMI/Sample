package com.cogniteq.ca.mvvm.sample.data.realm.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/realm/datastore/AuthDataStoreImpl;", "Lcom/cogniteq/ca/mvvm/sample/data/realm/datastore/AuthDataStore;", "realm", "Lio/realm/Realm;", "(Lio/realm/Realm;)V", "saveUserCredentials", "", "login", "", "password", "searchUserByCredentials", "Companion", "app_debug"})
public final class AuthDataStoreImpl implements com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStore {
    private final io.realm.Realm realm = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.cogniteq.ca.mvvm.sample.data.realm.datastore.AuthDataStoreImpl.Companion Companion = null;
    private static final java.lang.String TAG = "AuthDataStoreImpl";
    
    public AuthDataStoreImpl(@org.jetbrains.annotations.NotNull()
    io.realm.Realm realm) {
        super();
    }
    
    @java.lang.Override()
    public boolean saveUserCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @java.lang.Override()
    public boolean searchUserByCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/realm/datastore/AuthDataStoreImpl$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}