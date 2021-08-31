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
        //there are two view pagers : view pager one and view pager two
        //we will be using view pager 2
        //view pager is used to create swappable and tab layouts
        //view pager uses adapter like recycler view
        //**Add view pager 2 to layout**//

        //create a layout to define how an element in swappable will look like
        //as we did for recycler view item

        //while creating layout file keep it match parent for height and width both for root element
        //now we need to create an adapter class same as recycler view

        //create a list
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

        //default swipe behaviour is horizontally
        //to make it vertical use code
        //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        //we can add fake drag also as
//        viewPager.beginFakeDrag()
//        viewPager.fakeDragBy(10f)
//        viewPager.endFakeDrag()
        //the sequence of the lines must be same for drag

        //to use tab layout its better to use linear layout
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        //we need to use mediator to set icons and badges and also to merge viewpager with tablayout
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