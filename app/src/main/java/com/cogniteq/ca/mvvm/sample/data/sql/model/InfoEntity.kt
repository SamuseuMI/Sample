package com.cogniteq.ca.mvvm.sample.data.sql.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.cogniteq.ca.mvvm.sample.data.sql.InfoTable
import com.google.gson.annotations.SerializedName

@Entity(tableName = InfoTable.TABLE_NAME)
class InfoEntity(@SerializedName(InfoTable.INFO_COLUMN)
                 @ColumnInfo(name = InfoTable.INFO_COLUMN)
                 val info: String,
                 @SerializedName(InfoTable.LAST_UPDATE_DATE_COLUMN)
                 @ColumnInfo(name = InfoTable.LAST_UPDATE_DATE_COLUMN)
                 val lastUpdateDate: String) : BaseEntity()