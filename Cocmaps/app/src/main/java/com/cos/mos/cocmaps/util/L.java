package com.cos.mos.cocmaps.util;

import android.util.Log;

import com.cos.mos.cocmaps.BuildConfig;


/**
 * Created by AdamLi on 2015/12/2.
 */
public class L {

    public static final String DEFAULT_TAG = "CocMaps";

    public static void e(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Throwable t = new Throwable();
            StackTraceElement[] elements = t.getStackTrace();
            String callerClassName = elements[1].getFileName();
            Log.e(tag, callerClassName + ":" + msg);
        }
    }

    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            Throwable t = new Throwable();
            StackTraceElement[] elements = t.getStackTrace();
            String callerClassName = elements[1].getFileName();
            String methodName = elements[1].getMethodName();
            Log.e(DEFAULT_TAG, callerClassName + ">" + methodName + ">" + msg);
        }
    }

    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Throwable t = new Throwable();
            StackTraceElement[] elements = t.getStackTrace();
            String callerClassName = elements[1].getFileName();
            Log.d(tag, callerClassName + ":" + msg);
        }
    }

    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Throwable t = new Throwable();
            StackTraceElement[] elements = t.getStackTrace();
            String callerClassName = elements[1].getFileName();
            Log.d(DEFAULT_TAG, callerClassName + ":" + msg);
        }
    }
}
