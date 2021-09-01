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

        val chapters = listOf("C1", "C2")
        val examples = listOf("E1", "E2")

        val adapter1 = RecyclerViewAdapter(chapters)
        val adapter2 = RecyclerViewAdapter(examples)

        val adapterList  = listOf(adapter1, adapter2)
        val adapter = ViewPagerAdapter(adapterList)
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