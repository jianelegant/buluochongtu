package com.cos.mos.cocmaps.request;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.cos.mos.cocmaps.CocApplication;

/**
 * Created by torv on 9/15/15.
 */
public enum JVolley {
    instance;

    private RequestQueue mVolleyRequstQueue = null;

    public void init() {
        if (mVolleyRequstQueue != null)
            throw new UnsupportedOperationException("reinit");

        mVolleyRequstQueue = Volley.newRequestQueue(CocApplication.getAppContext());
    }

    public RequestQueue getRequestQueue() {
        if (null == mVolleyRequstQueue)
            throw new UnsupportedOperationException("call init first");

        return mVolleyRequstQueue;
    }

    public void cancel(Object tag) {
        if (mVolleyRequstQueue != null) {
            mVolleyRequstQueue.cancelAll(tag);
        }
    }
}
