package com.axon.databingingdemo.task;

import android.util.Log;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 11:06 <br>
 * 版本： V1.0<br>
 */
public class Task implements Runnable {
    private static final String TAG = "Task";

    @Override
    public void run() {
        Log.i(TAG, "Task running");
    }
}
