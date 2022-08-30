package com.cogniteq.ca.mvvm.sample.domain.interactor.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0004\u0012\u00020\b0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/domain/interactor/auth/LoginInteractor;", "Lcom/cogniteq/ca/mvvm/sample/domain/BaseInteractor;", "Lcom/cogniteq/ca/mvvm/sample/domain/interactor/auth/LoginInteractor$Params;", "", "authRepository", "Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;", "(Lcom/cogniteq/ca/mvvm/sample/data/repository/auth/AuthRepository;)V", "invoke", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "param", "result", "Lkotlin/Function1;", "Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult;", "Params", "app_debug"})
public final class LoginInteractor extends com.cogniteq.ca.mvvm.sample.domain.BaseInteractor<com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor.Params, java.lang.Boolean> {
    private final com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository authRepository = null;
    
    public LoginInteractor(@org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.repository.auth.AuthRepository authRepository) {
        super();
    }
    
    @java.lang.Override()
    public void invoke(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor.Params param, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.cogniteq.ca.mvvm.sample.domain.InteractorResult<java.lang.Boolean>, kotlin.Unit> result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/domain/interactor/auth/LoginInteractor$Params;", "", "login", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getLogin", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String login = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String password = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.cogniteq.ca.mvvm.sample.domain.interactor.auth.LoginInteractor.Params copy(@org.jetbrains.annotations.NotNull()
        java.lang.String login, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        java.lang.String login, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLogin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPassword() {
            return null;
        }
    }
}