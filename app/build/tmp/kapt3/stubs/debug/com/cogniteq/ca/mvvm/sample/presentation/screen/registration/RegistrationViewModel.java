package com.cogniteq.ca.mvvm.sample.presentation.screen.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/registration/RegistrationViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "authRepository", "Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;", "(Landroid/app/Application;Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;)V", "_navigateUp", "Landroidx/lifecycle/MutableLiveData;", "", "_showMessage", "", "navigateUp", "Landroidx/lifecycle/LiveData;", "getNavigateUp", "()Landroidx/lifecycle/LiveData;", "showMessage", "getShowMessage", "saveAuthData", "", "login", "", "password", "app_debug"})
public final class RegistrationViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository authRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> _navigateUp = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Object> navigateUp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> showMessage = null;
    
    public RegistrationViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository authRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getNavigateUp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getShowMessage() {
        return null;
    }
    
    public final void saveAuthData(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
}