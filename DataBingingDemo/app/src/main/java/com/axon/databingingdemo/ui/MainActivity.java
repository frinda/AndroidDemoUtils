package com.axon.databingingdemo.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.axon.databingingdemo.R;
import com.axon.databingingdemo.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBindingImpl binging = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binging.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btn_base) {
                    startActivity(new Intent(MainActivity.this,BaseUserActivity.class));
                }else if (v.getId() == R.id.btn_event_handler) {
                    startActivity(new Intent(MainActivity.this,EventHanderActivity.class));
                }else if(v.getId() == R.id.btn_double_binging) {
                    startActivity(new Intent(MainActivity.this,DoubleBindingActivity.class));
                }else if(v.getId() == R.id.btn_observe) {
                    startActivity(new Intent(MainActivity.this,ObservableActivity.class));
                }else if(v.getId() == R.id.btn_detail) {
                    startActivity(new Intent(MainActivity.this,LayoutDetailActivity.class));
                }else if(v.getId() == R.id.btn_recycler_view) {
                    startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
                }else if(v.getId() == R.id.btn_multi_recyclerView) {
                    startActivity(new Intent(MainActivity.this,MultiRecyclerViewActivity.class));
                }else if(v.getId() == R.id.btn_customer_attribute) {
                    startActivity(new Intent(MainActivity.this,CustomAttributeActivity.class));
                }else if(v.getId() == R.id.btn_view_stub) {
                    startActivity(new Intent(MainActivity.this,ViewStubActivity.class));
                }else if(v.getId() == R.id.btn_viewmodel) {
                    startActivity(new Intent(MainActivity.this,ViewModelActivity.class));
                }else if(v.getId() == R.id.btn_livedata) {
                    startActivity(new Intent(MainActivity.this,NameActivity.class));
                }
            }
        });
    }


}
