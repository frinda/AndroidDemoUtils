package com.axon.databingingdemo.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/12 11:01 <br>
 * 版本： V1.0<br>
 */
public class ImageUtils {

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}
