package com.axon.databingingdemo;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.axon.databingingdemo.databinding.RecyclerViewItemBinding;

import java.util.List;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 19:44 <br>
 * 版本： V1.0<br>
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BindingHolder> {

    private List<RecyclerViewItem> list;

    public RecyclerViewAdapter(List<RecyclerViewItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public BindingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewItemBinding binging = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.recycler_view_item,parent,false);
        BindingHolder bingHolder = new BindingHolder(binging.getRoot());
        bingHolder.setBinding(binging);
        return bingHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BindingHolder holder, int position) {
        holder.getBinding().setVariable(BR.item, list.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BindingHolder extends RecyclerView.ViewHolder {

        private RecyclerViewItemBinding binding;

        public BindingHolder(View itemView) {
            super(itemView);
        }

        public RecyclerViewItemBinding getBinding() {
            return binding;
        }

        public void setBinding(RecyclerViewItemBinding binding) {
            this.binding = binding;
        }
    }
}
