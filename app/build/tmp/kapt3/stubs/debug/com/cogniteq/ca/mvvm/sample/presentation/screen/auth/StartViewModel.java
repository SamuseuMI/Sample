package com.cogniteq.ca.mvvm.sample.presentation.screen.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/auth/StartViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "authRepository", "Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;", "(Landroid/app/Application;Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;)V", "_screenEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/cogniteq/ca/mvvm/sample/util/NavigatorResource;", "screenEmitter", "Landroidx/lifecycle/LiveData;", "getScreenEmitter", "()Landroidx/lifecycle/LiveData;", "openLoginOrInfoScreen", "", "app_debug"})
public final class StartViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository authRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.cogniteq.ca.mvvm.sample.util.NavigatorResource> _screenEmitter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.cogniteq.ca.mvvm.sample.util.NavigatorResource> screenEmitter = null;
    
    public StartViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository authRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.cogniteq.ca.mvvm.sample.util.NavigatorResource> getScreenEmitter() {
        return null;
    }
    
    public final void openLoginOrInfoScreen() {
    }
}