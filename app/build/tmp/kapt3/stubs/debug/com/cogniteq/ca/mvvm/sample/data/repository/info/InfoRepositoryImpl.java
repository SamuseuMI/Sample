package com.cogniteq.ca.mvvm.sample.data.repository.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/repository/info/InfoRepositoryImpl;", "Lcom/cogniteq/ca/mvvm/sample/data/repository/info/InfoRepository;", "infoDataStore", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/info/InfoDataStore;", "(Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/info/InfoDataStore;)V", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/InfoEntity;", "getDataStore", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDataStore;", "app_debug"})
public final class InfoRepositoryImpl implements com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository {
    private final com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDataStore infoDataStore = null;
    
    public InfoRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDataStore infoDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDataStore<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity> getDataStore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity model, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity model, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
}