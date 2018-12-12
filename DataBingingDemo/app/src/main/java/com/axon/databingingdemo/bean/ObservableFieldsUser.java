package com.axon.databingingdemo.bean;

import android.databinding.ObservableField;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 18:26 <br>
 * 版本： V1.0<br>
 */
public class ObservableFieldsUser {

    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();

    public ObservableFieldsUser(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
}
