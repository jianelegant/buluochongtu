package com.cos.mos.cocmaps.request;

import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.cos.mos.cocmaps.CocApplication;
import com.cos.mos.cocmaps.R;

/**
 * Created by AdamLi on 2016/3/14.
 */
public class VolleyErrorHandler {

    public static void handleError(VolleyError error) {

        if (error instanceof TimeoutError) {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_timeout, Toast.LENGTH_LONG).show();
        } else if (error instanceof NoConnectionError) {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_no_connection, Toast.LENGTH_LONG).show();
        } else if (error instanceof NetworkError) {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_network, Toast.LENGTH_LONG).show();
        } else if (error instanceof AuthFailureError) {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_authfail, Toast.LENGTH_LONG).show();
        } else if (error instanceof ServerError) {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_server_error, Toast.LENGTH_LONG).show();
        } else if (error instanceof ParseError) {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_parse_error, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(CocApplication.getAppContext(), R.string.volley_error_msg_unknown_error, Toast.LENGTH_LONG).show();
        }
    }
}
