package com.adop.sdk.adopendingpopupsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.adop.sdk.nativead.CustomDialog;

public class MainActivity extends AppCompatActivity {

    private CustomDialog mCustomDialog;
    static String END_ZONE_ID = "aebf056f-86e1-474c-bcf3-f8c6193ca8c2"; // 발급받은 ZONE ID

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if( event.getAction() == KeyEvent.ACTION_DOWN) {
            if( keyCode == KeyEvent.KEYCODE_BACK) {   // 뒤로가기 버튼 터치시 실행

                mCustomDialog = new CustomDialog(MainActivity.this);

                mCustomDialog.setAdInfo(END_ZONE_ID);   // 발급받은 아이디 입력

                mCustomDialog.setHouseTitleText("ADOP");   // 하우스광고 노출시 타이틀
                mCustomDialog.setHouseBodyText("For Advertising Revenue Optimization, Let’s be together with the ADOP.");  // 하우스광고 노출시 본문
                mCustomDialog.setHouseIconImage(R.drawable.adop_logo); // 하우스광고 노출시 아이콘 이미지
                mCustomDialog.setHouseMainImage(R.drawable.adop_house_300x250);  // 하우스광고 노출시 메인 이미지
                mCustomDialog.load();   // 종료광고 실행
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
