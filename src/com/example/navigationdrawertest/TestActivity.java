package com.example.navigationdrawertest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by kerwin on 15-1-22.
 */
public class TestActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView=(TextView)findViewById(R.id.tv_fragment0);
        textView.setText(getResources().getString(R.string.action_share));

    }
}
