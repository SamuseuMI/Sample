package com.cogniteq.ca.mvvm.sample.presentation.screen.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/info/InfoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "saveDataInteractorKotlinImpl", "Lcom/cogniteq/ca/mvvm/sample/domain/interactor/info/SaveDataInteractor;", "getLastUpdateFlowInteractor", "Lcom/cogniteq/ca/mvvm/sample/domain/interactor/info/GetLastUpdateInteractor;", "(Landroid/app/Application;Lcom/cogniteq/ca/mvvm/sample/domain/interactor/info/SaveDataInteractor;Lcom/cogniteq/ca/mvvm/sample/domain/interactor/info/GetLastUpdateInteractor;)V", "_infoEmitter", "Landroidx/lifecycle/MediatorLiveData;", "", "infoEmitter", "Landroidx/lifecycle/LiveData;", "getInfoEmitter", "()Landroidx/lifecycle/LiveData;", "onViewPrepared", "", "updateData", "newData", "app_debug"})
public final class InfoViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.cogniteq.ca.mvvm.sample.domain.interactor.info.SaveDataInteractor saveDataInteractorKotlinImpl = null;
    private final com.cogniteq.ca.mvvm.sample.domain.interactor.info.GetLastUpdateInteractor getLastUpdateFlowInteractor = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.String> _infoEmitter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> infoEmitter = null;
    
    public InfoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.domain.interactor.info.SaveDataInteractor saveDataInteractorKotlinImpl, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.domain.interactor.info.GetLastUpdateInteractor getLastUpdateFlowInteractor) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getInfoEmitter() {
        return null;
    }
    
    public final void onViewPrepared() {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.lang.String newData) {
    }
}