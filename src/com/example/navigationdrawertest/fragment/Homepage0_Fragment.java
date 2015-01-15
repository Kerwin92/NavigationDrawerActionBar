/**
 * 
 */
package com.example.navigationdrawertest.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.example.navigationdrawertest.R;

/**
 * @author youyuxing
 * 
 *         2014-10-26
 */
public class Homepage0_Fragment extends Fragment implements OnClickListener {
	public static Homepage0_Fragment getInstance() {
		Homepage0_Fragment fragment = new Homepage0_Fragment();
		return fragment;

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_homepage0, container, false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}

}
