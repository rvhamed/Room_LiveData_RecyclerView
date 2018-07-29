package com.hamed.roomlivedata.db

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user")
class User(@ColumnInfo(name = "name") var name : String? = "", @ColumnInfo(name = "family") var family : String? = "") {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "_id") var id : Int = 0
}