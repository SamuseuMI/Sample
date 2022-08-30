package com.cogniteq.ca.mvvm.sample.presentation.screen.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/login/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "loginInteractor", "Lcom/cogniteq/ca/mvvm/sample/domain/interactor/auth/LoginInteractor;", "(Landroid/app/Application;Lcom/cogniteq/ca/mvvm/sample/domain/interactor/auth/LoginInteractor;)V", "_messageEmitter", "Landroidx/lifecycle/MutableLiveData;", "", "_screenEmitter", "Lcom/cogniteq/ca/mvvm/sample/util/ActionLiveData;", "Lcom/cogniteq/ca/mvvm/sample/util/NavigatorResource;", "messageEmitter", "Landroidx/lifecycle/LiveData;", "getMessageEmitter", "()Landroidx/lifecycle/LiveData;", "screenEmitter", "getScreenEmitter", "login", "", "password", "onSignUpClick", "openInfoScreen", "isLogin", "", "showMessage", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor loginInteractor = null;
    private final com.cogniteq.ca.mvvm.sample.util.ActionLiveData<com.cogniteq.ca.mvvm.sample.util.NavigatorResource> _screenEmitter = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _messageEmitter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.cogniteq.ca.mvvm.sample.util.NavigatorResource> screenEmitter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> messageEmitter = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor loginInteractor) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.cogniteq.ca.mvvm.sample.util.NavigatorResource> getScreenEmitter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMessageEmitter() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void onSignUpClick() {
    }
    
    private final void openInfoScreen(boolean isLogin) {
    }
    
    private final void showMessage(java.lang.Exception exception) {
    }
}