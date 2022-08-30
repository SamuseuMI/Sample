package com.cogniteq.ca.mvvm.sample.presentation.screen.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001b\u0010\r\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/login/LoginFragment;", "Lcom/cogniteq/ca/mvvm/sample/presentation/common/BaseFragment;", "Lcom/cogniteq/ca/mvvm/sample/presentation/screen/login/LoginViewModel;", "()V", "emailAddressView", "Lcom/google/android/material/textfield/TextInputEditText;", "getEmailAddressView", "()Lcom/google/android/material/textfield/TextInputEditText;", "setEmailAddressView", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "passwordView", "getPasswordView", "setPasswordView", "viewModel", "getViewModel", "()Lcom/cogniteq/ca/mvvm/sample/presentation/screen/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeMessage", "", "observeOpenScreen", "onLoginClick", "onSignUpClick", "prepareViews", "app_debug"})
public final class LoginFragment extends com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment<com.cogniteq.ca.mvvm.sample.presentation.screen.login.LoginViewModel> {
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_email_address)
    public com.google.android.material.textfield.TextInputEditText emailAddressView;
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_password)
    public com.google.android.material.textfield.TextInputEditText passwordView;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public LoginFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getEmailAddressView() {
        return null;
    }
    
    public final void setEmailAddressView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getPasswordView() {
        return null;
    }
    
    public final void setPasswordView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cogniteq.ca.mvvm.sample.presentation.screen.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void prepareViews() {
    }
    
    @butterknife.OnClick(value = {com.cogniteq.ca.mvvm.android.sample.R.id.btn_success})
    public final void onLoginClick() {
    }
    
    @butterknife.OnClick(value = {com.cogniteq.ca.mvvm.android.sample.R.id.view_sign_up})
    public final void onSignUpClick() {
    }
    
    private final void observeOpenScreen() {
    }
    
    private final void observeMessage() {
    }
}