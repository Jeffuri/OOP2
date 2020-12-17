package com.android.project_jnb.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "peminjam")
data class Peminjam (
    @PrimaryKey val kode : Int,
    @ColumnInfo (name= "nama") val nama: String?,
    @ColumnInfo (name = "petugasperpus") val petugasperpus: String?
)