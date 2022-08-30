package com.cogniteq.ca.mvvm.sample.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00020\u00060\u000bH&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/domain/BaseInteractor;", "Param", "Type", "", "()V", "invoke", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "param", "result", "Lkotlin/Function1;", "Lcom/cogniteq/ca/mvvm/sample/domain/InteractorResult;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "app_debug"})
public abstract class BaseInteractor<Param extends java.lang.Object, Type extends java.lang.Object> {
    
    public BaseInteractor() {
        super();
    }
    
    public abstract void invoke(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, Param param, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.cogniteq.ca.mvvm.sample.domain.InteractorResult<? extends Type>, kotlin.Unit> result);
}