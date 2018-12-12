package com.axon.databingingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.bean.User;
import com.axon.databingingdemo.databinding.ActivityViewStubBinding;
import com.axon.databingingdemo.databinding.LayoutIncludeBindingImpl;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 20:26 <br>
 * 版本： V1.0<br>
 */
public class ViewStubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityViewStubBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);

        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                LayoutIncludeBindingImpl viewStubBinding = DataBindingUtil.bind(inflated);
                User user = new User("容华", "谢后");
                viewStubBinding.setUser(user);

            }
        });
        binding.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!binding.viewStub.isInflated()) {
                    binding.viewStub.getViewStub().inflate();
                }
            }
        });
    }
}
