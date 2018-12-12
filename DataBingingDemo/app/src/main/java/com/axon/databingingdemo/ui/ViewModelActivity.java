package com.axon.databingingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.databinding.ActivityUserBinding;
import com.axon.databingingdemo.viewmodel.UserModel;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 13:54 <br>
 * 版本： V1.0<br>
 */
public class ViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityUserBinding activityUserBinding = DataBindingUtil.setContentView(this, R.layout.activity_user);

        activityUserBinding.setLifecycleOwner(this);
        activityUserBinding.setViewmodel(new UserModel(true));
    }
}
