package com.adop.sdk.adopnativetemplatesample;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.adop.sdk.nativead.BaseNativeTemplateAd;

public class MainActivity extends AppCompatActivity {

    static String ZONE_ID = "aebf056f-86e1-474c-bcf3-f8c6193ca8c2";

    private BaseNativeTemplateAd mNativeTemp;
    private ConstraintLayout nativeAdContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNativeTemp = new BaseNativeTemplateAd(MainActivity.this);
        mNativeTemp.setAdInfo(ZONE_ID);

        nativeAdContainer = (ConstraintLayout) findViewById(R.id.native_ad_container);
        mNativeTemp.setNativeAdContainer(nativeAdContainer);

        mNativeTemp.setLayoutColor(Color.WHITE);
        mNativeTemp.setTitleTextColor(Color.BLACK);
        mNativeTemp.setBodyTextColor(Color.GRAY);

        mNativeTemp.setButtonColor(Color.WHITE);
        mNativeTemp.setButtonTextColor(Color.GRAY);
        mNativeTemp.setButtonBorderColor(Color.BLACK);

        mNativeTemp.setHouseTitleText("ADOP");
        mNativeTemp.setHouseBodyText("For Advertising Revenue Optimization, Let’s be together with the ADOP.");
        mNativeTemp.setHouseIconImage(R.drawable.adop_logo);
        mNativeTemp.setHouseMainImage(R.drawable.house_300x250);

        nativeAdContainer.addView(mNativeTemp);

        mNativeTemp.load();
    }
}
