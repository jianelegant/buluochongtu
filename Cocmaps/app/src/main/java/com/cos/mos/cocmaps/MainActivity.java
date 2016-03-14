package com.cos.mos.cocmaps;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.VolleyError;
import com.cos.mos.cocmaps.request.RequestFactory;
import com.cos.mos.cocmaps.request.VolleyErrorHandler;
import com.cos.mos.cocmaps.request.base.IListener;
import com.cos.mos.cocmaps.request.bean.CocMap;
import com.cos.mos.cocmaps.util.L;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private static final java.lang.String TAG = MainActivity.class.getSimpleName();

    SimpleDraweeView draweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        requestData();
    }

    private void findView() {
        draweeView = (SimpleDraweeView) findViewById(R.id.iv_test_map);
    }

    private void requestData() {
        RequestFactory.requestCocMap(this, new IListener<CocMap>() {
            @Override
            public void onResponse(CocMap map, VolleyError volleyError) {
                L.e(TAG, "onResponse");
                if (volleyError != null) {
                    VolleyErrorHandler.handleError(volleyError);
                } else {
                    if (map != null) {
                        draweeView.setImageURI(Uri.parse(map.getUrl()));
                    }
                }
            }
        });
    }
}
