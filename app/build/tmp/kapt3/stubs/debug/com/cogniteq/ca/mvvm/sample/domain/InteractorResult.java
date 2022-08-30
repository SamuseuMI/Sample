package com.cogniteq.ca.mvvm.sample.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\n\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00062\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00050\u0006\u0082\u0001\u0002\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult;", "T", "", "()V", "getResult", "", "Lkotlin/Function1;", "getException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Failure", "Result", "Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult$Result;", "Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult$Failure;", "app_debug"})
public abstract class InteractorResult<T extends java.lang.Object> {
    
    private InteractorResult() {
        super();
    }
    
    public final void getResult(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> getResult, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> getException) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult$Result;", "T", "Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Result<T extends java.lang.Object> extends com.cogniteq.ca.mvvm.sample.domain.InteractorResult<T> {
        private final T data = null;
        
        public Result(T data) {
            super();
        }
        
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult$Failure;", "T", "Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "app_debug"})
    public static final class Failure<T extends java.lang.Object> extends com.cogniteq.ca.mvvm.sample.domain.InteractorResult<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
    }
}