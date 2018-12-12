package com.axon.databingingdemo.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.axon.databingingdemo.BR;
import com.axon.databingingdemo.R;
import com.axon.databingingdemo.bean.RecyclerViewItem;

import java.util.List;

/**
 * <p>描述：</p>
 * 作者： DELL<br>
 * 日期： 2018/12/11 20:10 <br>
 * 版本： V1.0<br>
 */
public class MultiRecyclerViewAdapter extends RecyclerView.Adapter<MultiRecyclerViewAdapter.BindingHolder> {

    private List<RecyclerViewItem> list;

    public MultiRecyclerViewAdapter(List<RecyclerViewItem> list) {
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
        if (position < 5) {
            return 0;
        } else {
            return 1;
        }
    }

    @NonNull
    @Override
    public BindingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding;

        if (viewType == 0) {
            binding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.getContext()), R.layout.adapter_recycler_view_other, parent, false);
        } else {
            binding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.getContext()), R.layout.recycler_view_item, parent, false);
        }

        BindingHolder holder = new BindingHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;

    }

    @Override
    public void onBindViewHolder(MultiRecyclerViewAdapter.BindingHolder holder, int position) {
        holder.getBinding().setVariable(BR.item, list.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BindingHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        public BindingHolder(View itemView) {
            super(itemView);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }

        public void setBinding(ViewDataBinding binding) {
            this.binding = binding;
        }
    }
}
