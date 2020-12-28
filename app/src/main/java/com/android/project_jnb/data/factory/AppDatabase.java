package com.android.project_jnb.data.factory;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.android.project_jnb.data.BarangDAO;
import com.android.project_jnb.model.Barang;

/**
 * Created by Herdi_WORK on 21.01.18.
 */

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BarangDAO barangDAO();

}
