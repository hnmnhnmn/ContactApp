package com.momotest.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.viewpager2.widget.ViewPager2
import com.momotest.ui.R
import com.momotest.ui.adapter.ContactsViewpagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        handleEvents()

        threeLine.setOnClickListener {
            drawerMenu.openDrawer(GravityCompat.START)
        }







    }

    private fun initData() {
        viewPager.adapter = ContactsViewpagerAdapter(this)
    }
    private fun handleEvents () {
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.btnContacts -> {
                    viewPager.currentItem = 0
                }

                R.id.btnFixManage -> {
                    viewPager.currentItem = 1
                }
            }
            return@setOnItemSelectedListener true
        }
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> {
                        bottomNavigationView.menu.findItem(R.id.btnContacts).isChecked = true
                    }
//                    1 -> {
//                        bottomNavigation.menu.findItem(R.id.btnReport).isChecked = true
//                    }
                    1 -> {
                        bottomNavigationView.menu.findItem(R.id.btnFixManage).isChecked = true
                    }
                }
            }
        })
    }

}