package com.cogniteq.ca.mvvm.sample.data.sql.model;

import java.lang.System;

@androidx.room.Entity(tableName = "information")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/data/sql/model/InfoEntity;", "Lcom/cogniteq/ca/mvvm/sample/data/sql/model/BaseEntity;", "info", "", "lastUpdateDate", "(Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getLastUpdateDate", "app_debug"})
public final class InfoEntity extends com.cogniteq.ca.mvvm.sample.data.sql.model.BaseEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "info")
    @com.google.gson.annotations.SerializedName(value = "info")
    private final java.lang.String info = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "last_update_date")
    @com.google.gson.annotations.SerializedName(value = "last_update_date")
    private final java.lang.String lastUpdateDate = null;
    
    public InfoEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String info, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdateDate) {
        super(0L);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUpdateDate() {
        return null;
    }
}