package com.android.project_jnb

import android.R
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup


class HomeFragment : Fragment(), View.OnClickListener {
    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle): View? {
        val homeBinding: FragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        homeBinding.bnAddUser.setOnClickListener(this)
        homeBinding.bnViewUser.setOnClickListener(this)
        homeBinding.bnDeleteUser.setOnClickListener(this)
        homeBinding.bnUpdateUser.setOnClickListener(this)
        return homeBinding.getRoot()
    }

    fun onClick(v: View) {
        when (v.getId()) {
            R.id.bn_add_user -> HomeActivity.fragmentManager!!.beginTransaction().replace(R.id.fragment_container, AddUserFragment()).addToBackStack(null).commit()
            R.id.bn_view_user -> HomeActivity.fragmentManager!!.beginTransaction().replace(R.id.fragment_container, ReadUserFragment()).addToBackStack(null).commit()
            R.id.bn_delete_user -> HomeActivity.fragmentManager!!.beginTransaction().replace(R.id.fragment_container, DeleteUserFragment()).addToBackStack(null).commit()
            R.id.bn_update_user -> HomeActivity.fragmentManager!!.beginTransaction().replace(R.id.fragment_container, UpdateUserFragment()).addToBackStack(null).commit()
        }
    }
}