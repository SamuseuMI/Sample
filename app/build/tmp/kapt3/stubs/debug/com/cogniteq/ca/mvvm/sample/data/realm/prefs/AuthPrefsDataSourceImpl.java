package com.cogniteq.ca.mvvm.sample.data.realm.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/realm/prefs/AuthPrefsDataSourceImpl;", "Lcom/cogniteq/ca/mvvm/sample/data/realm/prefs/AuthPrefsDataSource;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getAuthToken", "", "saveAuthToken", "", "authToken", "Companion", "app_debug"})
public final class AuthPrefsDataSourceImpl implements com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSource {
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.cogniteq.ca.mvvm.sample.data.realm.prefs.AuthPrefsDataSourceImpl.Companion Companion = null;
    private static final java.lang.String TAG = "AuthPrefsDataSourceImpl";
    private static final java.lang.String SIGN_IN_ACCESS_TOKEN = "token";
    private static final java.lang.String DEF_VALUE = "";
    
    public AuthPrefsDataSourceImpl(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    @java.lang.Override()
    public void saveAuthToken(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAuthToken() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/realm/prefs/AuthPrefsDataSourceImpl$Companion;", "", "()V", "DEF_VALUE", "", "SIGN_IN_ACCESS_TOKEN", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}