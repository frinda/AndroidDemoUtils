package com.axon.databingingdemo;

import android.view.View;
import android.widget.Toast;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 16:39 <br>
 * 版本： V1.0<br>
 */
public class EventHandler {

    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_LONG).show();
    }

    public void onTaskClick(Task task) {
        task.run();
    }

    public void onTaskClick(View view, Task task) {
        Toast.makeText(view.getContext(), "onTaskClick", Toast.LENGTH_LONG).show();
        task.run();
    }

    public void onCompletedChanged(Task task, boolean completed){
        if (completed) {
            task.run();
        }
    }
}
