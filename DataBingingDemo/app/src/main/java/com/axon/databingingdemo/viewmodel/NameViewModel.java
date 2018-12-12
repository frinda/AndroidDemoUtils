package com.axon.databingingdemo.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 14:39 <br>
 * 版本： V1.0<br>
 */
public class NameViewModel extends ViewModel {

    private MutableLiveData<String> mCurrentName;

    public MutableLiveData<String> getmCurrentName() {

        if (mCurrentName == null) {
            mCurrentName = new MutableLiveData<>();
        }
        return mCurrentName;
    }
}
