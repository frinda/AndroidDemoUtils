package com.axon.databingingdemo.ui;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

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

        final UserModel userModel = new UserModel();

        final ActivityUserBinding activityUserBinding = DataBindingUtil.setContentView(this, R.layout.activity_user);

        activityUserBinding.setViewmodel(userModel);

        userModel.username.set("xxxx");

        userModel.rememberMe.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {

                if (userModel.rememberMe.get()) {
                    userModel.username.set("记住我吧!!!");
                    Toast.makeText(ViewModelActivity.this,"记住我",Toast.LENGTH_SHORT).show();
                }else{
                    userModel.username.set("不用记住我");
                    Toast.makeText(ViewModelActivity.this,"不用记住我",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
