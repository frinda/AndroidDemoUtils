package com.axon.databingingdemo.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.bean.ObservableFieldsUser;
import com.axon.databingingdemo.bean.ObservableObjectsUser;
import com.axon.databingingdemo.databinding.ActivityObservableBinding;
import com.axon.databingingdemo.databinding.ActivityObservableBindingImpl;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 18:30 <br>
 * 版本： V1.0<br>
 */
public class ObservableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binging =  DataBindingUtil.setContentView(this, R.layout.activity_observable);
        final ObservableObjectsUser user = new ObservableObjectsUser("容华", "谢后");
//        final ObservableFieldsUser user = new ObservableFieldsUser("容华", "谢后");
//        final ObservableArrayMap<String, String> user = new ObservableArrayMap<>();
//        user.put("firstName", "Google");
//        user.put("lastName", "Inc.");
        binging.setUser(user);
        binging.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Observable Objects
                user.setFirstName("空谷");
                user.setLastName("幽兰");

                //ObservableFields
//                user.firstName.set("空谷");
//                user.lastName.set("幽兰");

                // Observable Collections
//                user.put("firstName", "空谷");
//                user.put("lastName", "幽兰");
            }
        });
    }
}
