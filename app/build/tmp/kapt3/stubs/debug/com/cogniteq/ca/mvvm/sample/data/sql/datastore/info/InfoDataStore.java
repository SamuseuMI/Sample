package com.cogniteq.ca.mvvm.sample.data.sql.datastore.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/info/InfoDataStore;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDataStore;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/InfoEntity;", "infoDao", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/info/InfoDao;", "(Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/info/InfoDao;)V", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "getDao", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDao;", "getTableName", "", "app_debug"})
public final class InfoDataStore extends com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDataStore<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity> {
    private com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDao infoDao;
    
    public InfoDataStore(@org.jetbrains.annotations.NotNull()
    com.cogniteq.ca.mvvm.sample.data.sql.datastore.info.InfoDao infoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDao<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity> getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getTableName() {
        return null;
    }
}