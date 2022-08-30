package com.cogniteq.ca.mvvm.sample.data.repository.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/repository/info/InfoRepository;", "Lcom/cogniteq/ca/mvvm/sample/data/repository/Repository;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/InfoEntity;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public abstract interface InfoRepository extends com.cogniteq.ca.mvvm.sample.data.repository.Repository<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity>> getAll();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public static java.lang.Object getAllData(@org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity>> p1) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public static java.lang.Object save(@org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository $this, @org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity model, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public static java.lang.Object update(@org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository $this, @org.jetbrains.annotations.NotNull()
        com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity model, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
    }
}