package com.axon.databingingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.bean.User;
import com.axon.databingingdemo.databinding.ActivityDetailBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 19:09 <br>
 * 版本： V1.0<br>
 */
public class LayoutDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDetailBinding bing = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        User user = new User("ronghua", "xiehou");
        bing.setUser(user);

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(new User("空谷", "幽兰"));
        bing.setPosition(1);
        bing.setUserList(userList);
    }
}
