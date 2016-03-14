package com.cos.mos.cocmaps.request.base;

import com.android.volley.VolleyError;

/**
 * Created by AdamLi on 2016/1/3.
 */
public interface IListener<T> {

    public void onResponse(T response, VolleyError volleyError);
}
