package com.axon.databingingdemo.viewmodel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 13:56 <br>
 * 版本： V1.0<br>
 */
public class UserModel  {

    public ObservableField<String> username = new ObservableField<>();

    public final ObservableBoolean rememberMe = new ObservableBoolean();

    public void rememberMeChanged(){
        rememberMe.set(!rememberMe.get());
    }



}
