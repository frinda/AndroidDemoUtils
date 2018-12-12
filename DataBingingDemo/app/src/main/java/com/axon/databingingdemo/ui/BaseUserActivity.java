package com.axon.databingingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.bean.User;
import com.axon.databingingdemo.databinding.ActivityBaseUserBindingImpl;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 17:24 <br>
 * 版本： V1.0<br>
 */
public class BaseUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityBaseUserBindingImpl binging = DataBindingUtil.setContentView(this, R.layout.activity_base_user);

        final User user = new User("容华", "谢后");
        binging.setUser(user);
        binging.setClicklistener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setFirstName("123");
                user.setLastName("456");
            }
        });
    }
}
