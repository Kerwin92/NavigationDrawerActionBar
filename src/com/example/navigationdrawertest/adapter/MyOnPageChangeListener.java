/**
 *
 */
package com.example.navigationdrawertest.adapter;

import android.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager.OnPageChangeListener;

/**
 * @author youyuxing
 *         <p/>
 *         2014-10-29
 */
public class MyOnPageChangeListener implements OnPageChangeListener {
    private ActionBar mActionBar;

    public MyOnPageChangeListener(FragmentActivity activity) {
        // TODO Auto-generated constructor stub
        this.mActionBar = activity.getActionBar();
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onPageSelected(int arg0) {
        // TODO Auto-generated method stub
        if (mActionBar.getTabCount() == 2) {
            mActionBar.selectTab(mActionBar.getTabAt(arg0));
        }

    }
}
