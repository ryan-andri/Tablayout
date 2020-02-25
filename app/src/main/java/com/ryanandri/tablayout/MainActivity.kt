package com.ryanandri.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ryanandri.tablayout.fragments.Activities
import com.ryanandri.tablayout.fragments.Home
import com.ryanandri.tablayout.fragments.Images

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabsAdapter = TabsAdapter(getSupportFragmentManager())
        val tabLayout : TabLayout = findViewById(R.id.tabs)
        val pageAdapter : ViewPager = findViewById(R.id.pageAdapter)

        tabsAdapter.addFragments(Home(), "Home")
        tabsAdapter.addFragments(Images(), "Images")
        tabsAdapter.addFragments(Activities(), "Activities")

        pageAdapter.adapter = tabsAdapter
        tabLayout.setupWithViewPager(pageAdapter)

    }
}
