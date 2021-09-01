 package com.edpub.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images  = listOf(
            R.drawable.ic_baseline_10k_24,
            R.drawable.ic_baseline_1x_mobiledata_24,
            R.drawable.ic_baseline_20mp_24,
            R.drawable.ic_baseline_3k_24,
            R.drawable.ic_launcher_background,
            R.drawable.ic_baseline_360_24,
            R.drawable.ic_launcher_foreground)
        val adapter = ViewPagerAdapter(images)
        val viewPager = findViewById<ViewPager2>(R.id.myViewPager)
        viewPager.adapter = adapter


        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)


        TabLayoutMediator(tabLayout, viewPager){tab, position->
            tab.text = "Tab ${position}+1"
        }.attach()
        //now everything is understandable
        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                //called when tab is selected
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //called when tab is un-selected
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //called when tab is re-selected
            }
        })


    }
}