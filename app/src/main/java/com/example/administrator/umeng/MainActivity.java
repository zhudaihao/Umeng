package com.example.administrator.umeng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.umeng.analytics.MobclickAgent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this); //统计时长
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this); //统计时长
    }
}
