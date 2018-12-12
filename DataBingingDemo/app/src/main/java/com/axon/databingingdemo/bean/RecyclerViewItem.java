package com.axon.databingingdemo.bean;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 19:50 <br>
 * 版本： V1.0<br>
 */
public class RecyclerViewItem {

    private String content;

    public RecyclerViewItem(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String item) {
        this.content = item;
    }
}
