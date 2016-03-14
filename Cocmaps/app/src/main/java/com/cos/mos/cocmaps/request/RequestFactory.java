package com.cos.mos.cocmaps.request;

import com.cos.mos.cocmaps.request.base.IListener;
import com.cos.mos.cocmaps.request.bean.CocMap;
import com.cos.mos.cocmaps.request.request.CocMapRequest;

/**
 * Created by AdamLi on 2016/3/14.
 */
public class RequestFactory {
    /**
     * @param tag      requst tag, used for cancel request
     * @param listener
     * @see JVolley#cancel(Object)
     */
    public static void requestCocMap(Object tag, IListener<CocMap> listener) {
        new CocMapRequest(tag, listener).start();
    }
}
