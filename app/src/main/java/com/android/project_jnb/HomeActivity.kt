package com.android.project_jnb

import android.R
import android.app.FragmentManager
import android.os.Bundle


class HomeActivity : AppCompatActivity() {
    fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = getSupportFragmentManager()
        myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase::class.java, "userdb").allowMainThreadQueries().build()


        // Null checking of container
        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return
            }
            fragmentManager!!.beginTransaction().add(R.id.fragment_container, HomeFragment()).commit()
        }
    }

    companion object {
        var fragmentManager: FragmentManager? = null
        var myAppDatabase: MyAppDatabase? = null
    }
}