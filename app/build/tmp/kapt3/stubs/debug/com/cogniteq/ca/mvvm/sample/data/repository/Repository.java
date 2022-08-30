package com.cogniteq.ca.mvvm.sample.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/repository/Repository;", "T", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/BaseEntity;", "", "getAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataStore", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDataStore;", "save", "", "model", "(Lcom/cogniteq/ca/mvvm/sample/data/sql/model/BaseEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface Repository<T extends com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    T model, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    T model, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDataStore<T> getDataStore();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static <T extends com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity>java.lang.Object save(@org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.repository.Repository<T> $this, @org.jetbrains.annotations.NotNull()
        T model, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static <T extends com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity>java.lang.Object update(@org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.repository.Repository<T> $this, @org.jetbrains.annotations.NotNull()
        T model, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static <T extends com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity>java.lang.Object getAllData(@org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.repository.Repository<T> $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<? extends T>> p1) {
            return null;
        }
    }
}