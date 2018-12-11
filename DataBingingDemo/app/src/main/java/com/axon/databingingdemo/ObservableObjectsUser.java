package com.axon.databingingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 18:04 <br>
 * 版本： V1.0<br>
 */
public class ObservableObjectsUser extends BaseObservable {

    private String firstName;
    private String lastName;

    public ObservableObjectsUser() {
    }

    public ObservableObjectsUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Override
    public String toString() {
        return "ObservableObjectsUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
