package com.axon.databingingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.axon.databingingdemo.databinding.ActivityDoubleBingingBinding;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 18:00 <br>
 * 版本： V1.0<br>
 */
public class DoubleBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDoubleBingingBinding activityDoubleBingingBinding =  DataBindingUtil.setContentView(this,R.layout.activity_double_binging);
        activityDoubleBingingBinding.setUser(new ObservableObjectsUser());
    }
}
