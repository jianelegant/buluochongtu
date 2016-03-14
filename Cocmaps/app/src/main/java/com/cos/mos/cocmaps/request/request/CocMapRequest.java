package com.cos.mos.cocmaps.request.request;

import com.cos.mos.cocmaps.Constants;
import com.cos.mos.cocmaps.request.base.BaseRequest;
import com.cos.mos.cocmaps.request.base.IListener;
import com.cos.mos.cocmaps.request.bean.CocMap;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by AdamLi on 2016/3/14.
 */
public class CocMapRequest extends BaseRequest<CocMap>{


    public CocMapRequest(Object tag, IListener<CocMap> mListener) {
        super(tag, mListener);
    }

    @Override
    protected CocMap parseJson(JSONObject jsonObject) {
        CocMap map = null;
        try {
            int level = jsonObject.getInt(Constants.JSON_KEY_COCMAP_LEVEL);
            int type = jsonObject.getInt(Constants.JSON_KEY_COCMAP_TYPE);
            String url = jsonObject.getString(Constants.JSON_KEY_COCMAP_URL);

            map = new CocMap();
            map.setLevel(level);
            map.setType(type);
            map.setUrl(url);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    protected String getUrl() {
        return HOST_URL;
    }
}
