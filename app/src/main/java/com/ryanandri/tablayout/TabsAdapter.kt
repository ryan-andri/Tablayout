package com.ryanandri.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlin.collections.ArrayList

class TabsAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    private var fragmentList : MutableList<Fragment> = ArrayList()
    private var tittleList : MutableList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList?.get(position)
    }

    override fun getCount(): Int {
        return fragmentList?.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tittleList.get(position)
    }

    fun addFragments(frag : Fragment, tittle : String) {
        fragmentList.add(frag)
        tittleList.add(tittle)
    }
}