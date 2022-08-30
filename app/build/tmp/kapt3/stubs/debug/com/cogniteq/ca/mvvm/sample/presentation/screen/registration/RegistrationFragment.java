package com.cogniteq.ca.mvvm.sample.presentation.screen.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0007R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001b\u0010\u0010\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/registration/RegistrationFragment;", "Lcom/cogniteq/ca/mvvm/sample/presentation/common/BaseFragment;", "Lcom/cogniteq/ca/mvvm/sample/presentation/screen/registration/RegistrationViewModel;", "()V", "emailAddressView", "Lcom/google/android/material/textfield/TextInputEditText;", "getEmailAddressView", "()Lcom/google/android/material/textfield/TextInputEditText;", "setEmailAddressView", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "fullNameView", "getFullNameView", "setFullNameView", "passwordView", "getPasswordView", "setPasswordView", "viewModel", "getViewModel", "()Lcom/cogniteq/ca/mvvm/sample/presentation/screen/registration/RegistrationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "attachViewModel", "", "onRegistrationClick", "app_debug"})
public final class RegistrationFragment extends com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment<com.cogniteq.ca.mvvm.sample.presentation.screen.registration.RegistrationViewModel> {
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_full_name)
    public com.google.android.material.textfield.TextInputEditText fullNameView;
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_email_address)
    public com.google.android.material.textfield.TextInputEditText emailAddressView;
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_password)
    public com.google.android.material.textfield.TextInputEditText passwordView;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public RegistrationFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getFullNameView() {
        return null;
    }
    
    public final void setFullNameView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
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
    public com.cogniteq.ca.mvvm.sample.presentation.screen.registration.RegistrationViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void attachViewModel() {
    }
    
    @butterknife.OnClick(value = {com.cogniteq.ca.mvvm.android.sample.R.id.btn_success})
    public final void onRegistrationClick() {
    }
}