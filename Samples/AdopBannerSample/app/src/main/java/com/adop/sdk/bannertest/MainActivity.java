package com.adop.sdk.bannertest;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import com.adop.sdk.adview.BaseAdView;

public class MainActivity extends AppCompatActivity {

    static String ZONE_ID = "7473ed8e-7a9c-48de-8bd7-759f3cd12042";
    ConstraintLayout layout;
    private BaseAdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout)findViewById(R.id.bannerLayout);
        mAdView = new BaseAdView(MainActivity.this);
        mAdView.setHouseImg(R.drawable.house);
        mAdView.setAdInfo(ZONE_ID);
        mAdView.setGravity(Gravity. CENTER );
        mAdView.setInterval(30);

        layout.addView(mAdView);
    }

    @Override
    public void onPause() {
        super.onPause();
        mAdView.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();
        mAdView.onResume();
    }
}
