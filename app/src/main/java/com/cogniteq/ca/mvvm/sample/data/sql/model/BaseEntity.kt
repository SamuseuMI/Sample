package com.cogniteq.ca.mvvm.sample.data.sql.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.cogniteq.ca.mvvm.sample.data.sql.ID_COLUMN
import com.google.gson.annotations.SerializedName

abstract class BaseEntity(@PrimaryKey
                          @SerializedName(ID_COLUMN)
                          @ColumnInfo(name = ID_COLUMN)
                          var id: Long = 1)
