package com.android.project_jnb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "buku")
data class Buku (
        @PrimaryKey val kode : Int,
        @ColumnInfo (name= "namabuku") val namabuku: String?,
        @ColumnInfo (name = "jumlah") val jumlah: String?
)
