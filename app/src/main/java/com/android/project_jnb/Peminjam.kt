package com.android.project_jnb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "peminjam")
data class Peminjam (
    @PrimaryKey val kode : Int,
            @ColumnInfo (name= "nama") val nama: String?,
                    @ColumnInfo (name = "petugas_perpus") val petugas_perpus: String?
)