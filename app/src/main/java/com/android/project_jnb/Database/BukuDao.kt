package com.android.project_jnb.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BukuDao {
    @Query("SELECT * FROM buku")
    fun getAll(): List<Buku>

    @Query("SELECT * FROM buku WHERE kode IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Buku>

    @Query("SELECT * FROM customer WHERE nama LIKE :nama AND " +
            "petugas LIKE :petugas LIMIT 1")
    fun findByName(nama: String, jumlah: String): Buku

    @Insert
    fun insertAll(vararg buku: Buku)

    @Delete
    fun delete(buku: Buku)
}