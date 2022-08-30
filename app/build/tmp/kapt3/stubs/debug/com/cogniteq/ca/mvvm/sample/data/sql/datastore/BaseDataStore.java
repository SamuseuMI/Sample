package com.cogniteq.ca.mvvm.sample.data.sql.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH$J\b\u0010\n\u001a\u00020\u000bH$J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDataStore;", "T", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/BaseEntity;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/DataStore;", "()V", "getAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDao", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDao;", "getTableName", "", "save", "", "model", "(Lcom/cogniteq/ca/mvvm/sample/data/sql/model/BaseEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract class BaseDataStore<T extends com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity> implements com.cogniteq.ca.mvvm.sample.data.sql.datastore.DataStore<T> {
    
    public BaseDataStore() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    T model, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object update(@org.jetbrains.annotations.NotNull()
    T model, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDao<T> getDao();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getTableName();
}