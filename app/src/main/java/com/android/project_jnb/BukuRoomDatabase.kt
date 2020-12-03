package com.android.project_jnb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Peminjam::class), version = 1)
abstract class BukuRoomDatabase : RoomDatabase() {
    abstract fun BukuDao(): BukuDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
            applicationContext,
            BukuRoomDatabase::class.java, "DBCS"
    ).build()

}