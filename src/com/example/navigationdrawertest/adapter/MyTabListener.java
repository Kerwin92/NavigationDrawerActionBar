/**
 * 
 */
package com.example.navigationdrawertest.adapter;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.support.v4.view.ViewPager;

/**
 * @author youyuxing
 * 
 *         2014-10-29
 */
public class MyTabListener implements ActionBar.TabListener {
	private ViewPager mViewPager;

	public MyTabListener(ViewPager viewpager) {
		this.mViewPager = viewpager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.app.ActionBar.TabListener#onTabReselected(android.app.ActionBar
	 * .Tab, android.app.FragmentTransaction)
	 */
	@Override
	public void onTabReselected(Tab arg0, android.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.app.ActionBar.TabListener#onTabSelected(android.app.ActionBar
	 * .Tab, android.app.FragmentTransaction)
	 */
	@Override
	public void onTabSelected(Tab tab, android.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		if (mViewPager != null) {
			mViewPager.setCurrentItem(tab.getPosition());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.app.ActionBar.TabListener#onTabUnselected(android.app.ActionBar
	 * .Tab, android.app.FragmentTransaction)
	 */
	@Override
	public void onTabUnselected(Tab arg0, android.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}
}
