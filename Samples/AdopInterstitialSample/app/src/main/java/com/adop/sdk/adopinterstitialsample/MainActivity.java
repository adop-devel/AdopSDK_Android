package com.adop.sdk.adopinterstitialsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.adop.sdk.interstitial.BaseInterstitial;

public class MainActivity extends AppCompatActivity {

    static String ZONE_ID = "001d503c-8591-4e1c-9e6d-d7b027ea8d09"; // 발급받은 ZONE ID
    private BaseInterstitial mInterstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInterstitial = new BaseInterstitial(MainActivity.this);
        mInterstitial.setAdInfo(ZONE_ID);   // 발급받은 아이디 입력
        mInterstitial.start(); // 광고실행
    }
}
