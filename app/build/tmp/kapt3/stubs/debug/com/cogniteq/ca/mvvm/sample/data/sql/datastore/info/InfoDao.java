package com.cogniteq.ca.mvvm.sample.data.sql.datastore.info;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/info/InfoDao;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/datastore/BaseDao;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/InfoEntity;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public abstract interface InfoDao extends com.cogniteq.ca.mvvm.sample.data.sql.datastore.BaseDao<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM information")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity>> getAll();
}