package com.axon.databingingdemo.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.viewmodel.NameViewModel;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 14:38 <br>
 * 版本： V1.0<br>
 */
public class NameActivity extends AppCompatActivity implements View.OnClickListener {

    private NameViewModel mModel;

    TextView mNameTextView;

    Button mButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_name);

        mNameTextView = findViewById(R.id.tv_name);
        mButton = findViewById(R.id.btn);
        mButton.setOnClickListener(this);
        mModel = ViewModelProviders.of(this).get(NameViewModel.class);

        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                mNameTextView.setText(newName);
            }
        };

        mModel.getmCurrentName().observe(this,nameObserver);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn) {
            String anotherName = "tony";
            mModel.getmCurrentName().setValue(anotherName);
        }
    }
}
