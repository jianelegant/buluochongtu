package com.cos.mos.cocmaps.request.base;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.cos.mos.cocmaps.request.JVolley;

import org.json.JSONObject;

/**
 * Created by AdamLi on 2016/3/14.
 */
public abstract class BaseRequest<T> {

    protected static final String HOST_URL = "http://54.213.27.158/coclayout/rest/hello";

    protected Object mTag;
    protected IListener<T> mListener;

    public BaseRequest(Object tag, IListener<T> mListener) {
        mTag = tag;
        this.mListener = mListener;
    }

    public void start() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(getUrl(), null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                if (mListener != null) {
                    mListener.onResponse(parseJson(response), null);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (mListener != null) {
                    mListener.onResponse(null, error);
                }
            }
        });

        jsonObjectRequest.setTag(mTag);
        JVolley.instance.getRequestQueue().add(jsonObjectRequest);
    }


    protected abstract T parseJson(JSONObject jsonObject);

    protected abstract String getUrl();
}
