package com.android.project_jnb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PeminjamDao {
    @Query("SELECT * FROM peminjam")
    fun getAll(): List<Peminjam>

    @Query("SELECT * FROM peminjam WHERE kode IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Peminjam>

    @Query("SELECT * FROM customer WHERE nama LIKE :nama AND " +
            "petugas LIKE :petugas LIMIT 1")
    fun findByName(nama: String, penjual: String): Peminjam

    @Insert
    fun insertAll(vararg customer: Peminjam)

    @Delete
    fun delete(customer: Peminjam)
}
