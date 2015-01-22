/**
 *
 */
package com.example.navigationdrawertest.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @author youyuxing
 *         <p/>
 *         2014-10-29
 */
public class MyFragmentPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentsList;

    public MyFragmentPageAdapter(FragmentManager fm,
                                 ArrayList<Fragment> fragments) {
        super(fm);
        this.fragmentsList = fragments;
    }

    @Override
    public Fragment getItem(int index) {
        // TODO Auto-generated method stub
        return fragmentsList.get(index);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return fragmentsList.size();
    }
}
