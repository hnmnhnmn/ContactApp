package com.momotest.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.momotest.ui.fragment.ContactFragment
import com.momotest.ui.fragment.FixManageFragment

class ContactsViewpagerAdapter(
    fragmentManager: FragmentActivity

) : FragmentStateAdapter(fragmentManager) {
    override fun getItemCount(): Int {
      return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                return ContactFragment()
            }
            else -> {
                return FixManageFragment()
            }
        }
    }


}