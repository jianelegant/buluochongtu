package com.cos.mos.cocmaps;

import android.app.Application;
import android.content.Context;

import com.cos.mos.cocmaps.request.JVolley;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by AdamLi on 2016/3/14.
 */
public class CocApplication extends Application {

    private static Context mAppCtx;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppCtx = getApplicationContext();

        initLibs();
    }

    private void initLibs() {
        Fresco.initialize(this);
        JVolley.instance.init();
    }

    public static Context getAppContext() {
        return mAppCtx;
    }
}
