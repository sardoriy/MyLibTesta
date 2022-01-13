package com.sardorbek.mylibtesta.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sardorbek.mylibtesta.DemoObjectFragment

class ViewPagerAdapter(fm: Fragment, var list: List<String>) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = list.size

    override fun createFragment(position: Int): Fragment {
        return DemoObjectFragment.newInstance(list[position])
    }
}