package com.axon.databingingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.axon.databingingdemo.databinding.ActivityCustomerAttributeBinding;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 20:18 <br>
 * 版本： V1.0<br>
 */
public class CustomAttributeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCustomerAttributeBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_customer_attribute);

        binding.setUrl("http://i7.qhmsg.com/t01b48a6f15bf0cf5c1.jpg");
    }
}
