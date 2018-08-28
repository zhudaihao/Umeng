package com.example.administrator.umeng;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by Administrator on 2018\8\28 0028.
 */

public class MyAapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

          // 打开统计SDK调试模式
        UMConfigure.setLogEnabled(true);

        /*
注意: 即使您已经在AndroidManifest.xml中配置过appkey和channel值，也需要在App代码中调用初始化接口（如需要使用AndroidManifest.xml中配置好的appkey和channel值，UMConfigure.init调用中appkey和channel参数请置为null）。
*/
        UMConfigure.init(this, "5b84b033f29d986618000042", "Ffgxy", UMConfigure.DEVICE_TYPE_PHONE, null);
    }
}
