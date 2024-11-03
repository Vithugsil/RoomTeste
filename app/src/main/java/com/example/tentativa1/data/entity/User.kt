package com.example.tentativa1.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "first_name")
    var first_name: String?,
    @ColumnInfo(name = "last_name")
    var last_name: String?,
    @ColumnInfo(name = "phone")
    var phone: String?
)
