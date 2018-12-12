package com.axon.databingingdemo.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

import com.android.databinding.library.baseAdapters.BR;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 13:56 <br>
 * 版本： V1.0<br>
 */
public class UserModel extends ViewModel implements Observable  {

    LiveData username;

    private PropertyChangeRegistry callbacks = new PropertyChangeRegistry();

    private boolean rememberMe;

    public UserModel(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Bindable
    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
        notifyPropertyChanged(BR.rememberMe);

    }

    public void rememberMeChanged() {
        this.rememberMe = !rememberMe;
        System.out.println(rememberMe);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        callbacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        callbacks.remove(callback);
    }

    void notifyPropertyChanged(int fieldId) {
        callbacks.notifyCallbacks(this, fieldId, null);
    }

    /**
     * Notifies observers that all properties of this instance have changed.
     */
    void notifyChange() {
        callbacks.notifyCallbacks(this, 0, null);
    }

}
