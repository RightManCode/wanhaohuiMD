package com.wishland.www.wanhaohuimaterialdesign.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gerry on 2017/5/5.
 */

public class MyTextUtils {
    public static boolean checkEmpty(EditText editText, String msg, Context context) {
        boolean empty = TextUtils.isEmpty(editText.getText().toString().trim());
        if (empty)
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        return empty;

    }
    public static boolean checkEmpty(TextView textView, String msg, Context context) {
        boolean empty = TextUtils.isEmpty(textView.getText().toString().trim());
        if (empty)
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        return empty;
    }
    public static boolean checkEmpty(String s, String msg, Context context) {
        boolean empty = TextUtils.isEmpty(s);
        if (empty)
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        return empty;
    }
}
